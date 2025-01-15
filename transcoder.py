from antlr4 import *
from pyLexer import pyLexer
from pyParser import pyParser
from pyVisitor import pyVisitor

class PythonToCPPVisitor(pyVisitor):
    def __init__(self):
        super().__init__()
        self.declared_variables = dict()
        self.indent_level = 0
        self.function = "main"
    
    def indent(self):
        return '\t'*self.indent_level

    def visitProgram(self, ctx):
        result = '''#include <iostream>
#include <vector>
#include <cmath>

template <typename T>
std::ostream& operator<<(std::ostream& os, const std::vector<T>& vec) {
	os << "{";
	for (size_t i = 0; i < vec.size(); ++i) {
		os << vec[i];
		if (i != vec.size() - 1) {
			os << ", ";
		}
	}
	os << "}";
	return os;
}

std::vector<int> range(int start, int stop, int step) {
    std::vector<int> result;

    for (int i = start; (step > 0) ? (i < stop) : (i > stop); i += step) {
        result.push_back(i);
    }

    return result;
}

std::vector<int> range(int start, int stop) {
    return range(start, stop, 1);
}

std::vector<int> range(int stop) {
    return range(0, stop, 1);
}

int main() {
'''

        self.indent_level += 1
        for statement in ctx.statement():
            result += self.visit(statement)
        result += "}"
        self.indent_level -= 1
        
        return result

    def visitStatement(self, ctx):
        if ctx.simple_stmt():
            return self.indent() + self.visit(ctx.simple_stmt()) + "\n"
        elif ctx.compound_stmt():
            return self.indent() + self.visit(ctx.compound_stmt())
        elif ctx.NEWLINE():
            return "\n"
        return ""
    
    def visitCompound_stmt(self, ctx):
        if ctx.funcdef():
            return self.visit(ctx.funcdef())
        elif ctx.while_stmt():
            return self.visitWhile_stmt(ctx.while_stmt())
        elif ctx.if_stmt():
            return self.visitIf_stmt(ctx.if_stmt())
        elif ctx.for_stmt():
            return self.visitFor_stmt(ctx.for_stmt())
        
        return "compound statement"
    
    def visitFuncdef(self, ctx):
        func_name = ctx.IDENTIFIER(0).getText()
        previous_function = self.function
        self.function = func_name
        params = []
        for i in range(1,len(ctx.IDENTIFIER())):
            param_name = ctx.IDENTIFIER(i).getText()
            param_type = self.visit(ctx.type_(i-1))
            self.declared_variables[(self.function,param_name)] = param_type
            params.append(f"{param_type} {param_name}")
        block = self.visit(ctx.block())
        self.function = previous_function
        return f"auto {func_name} = [=]({', '.join(params)}) {block};"
    
    def visitControl_stmt(self, ctx):
        if ctx.RETURN():
            return self.indent() + "return " + self.visit(ctx.expr()) + ";\n" if ctx.expr() else self.indent() + "return;\n"
        elif ctx.BREAK():
            return self.indent() + "break;\n"
        elif ctx.CONTINUE():
            return self.indent() + "continue;\n"

    def visitType(self, ctx):
        if ctx.INT():
            return 'int'
        elif ctx.FLOAT():
            return 'float'
        elif ctx.STR():
            return 'string'
        elif ctx.BOOL():
            return 'bool'
        elif ctx.LIST():
            return f'std::vector<{self.visit(ctx.type_())}>'

    def visitBlock(self, ctx):
        statements = ""
        self.indent_level += 1
        
        for stmt in ctx.statement():
            statements += self.visit(stmt)
        
        for ctrl_stmt in ctx.control_stmt():
            statements += self.visit(ctrl_stmt)
        
        self.indent_level -= 1
        
        return f"{{\n{statements}{self.indent()}}}"

    def visitWhile_stmt(self, ctx):
        condition = self.visit(ctx.logic_expr())
        block = self.visit(ctx.block())
        return f"while ({condition}) {block}"
    
    def visitComparison_expr(self, ctx):
        result = self.visit(ctx.valued_expr(0))
        for i in range(1, len(ctx.valued_expr())):
            op = ctx.comparison_op(i-1).getText()

            if op == "is":
                op = "=="
            elif op == "not":
                op =  "!("
            
            right_expr = self.visit(ctx.valued_expr(i))
            result += f" {op} {right_expr}"
        
        return result
    
    def visitLogic_expr(self, ctx):
        result = self.visit(ctx.logic_term(0))
        for i in range(1, len(ctx.logic_term())):
            result += f" || {self.visit(ctx.logic_term(i))}"
        return result

    def visitLogic_term(self, ctx):
        result = self.visit(ctx.logic_factor(0))
        for i in range(1, len(ctx.logic_factor())):
            result += f" && {self.visit(ctx.logic_factor(i))}"
        return result
    
    def visitLogic_factor(self, ctx):
        if ctx.NOT():
            return f"!{self.visit(ctx.logic_factor())}"
        elif ctx.comparison_expr():
            return self.visit(ctx.comparison_expr())
        else:
            raise NotImplementedError(f"Unhandled logic factor: {ctx.getText()}")

    def visitSimple_stmt(self, ctx):
        if ctx.assignment():
            return self.visit(ctx.assignment())
        elif ctx.expr():
            return self.visit(ctx.expr()) + ";"
        return ""

    def visitAssignment(self, ctx):
        variable = ctx.IDENTIFIER().getText()
        expression = self.visit(ctx.expr())

        var_type = self.visit(ctx.type_())

        index_expr = ""
        if ctx.LBRACKET():
            index_expr = "[" + ", ".join(self.visit(idx) for idx in ctx.valued_expr()) + "]"

        if index_expr:
            if (self.function, variable) not in self.declared_variables:
                self.declared_variables[(self.function, variable)] = var_type
                return f"{var_type} {variable}{index_expr} = {expression};"
            else:
                return f"{variable}{index_expr} = {expression};"
        else:
            if (self.function, variable) not in self.declared_variables:
                self.declared_variables[(self.function, variable)] = var_type
                if expression == "input()":
                    return f"{var_type} {variable}; std::cin >> {variable};"
                return f"{var_type} {variable} = {expression};"
            else:
                if expression == "input()":
                    return f"std::cin >> {variable};"
                return f"{variable} = {expression};"

    def visitExpr(self, ctx):
        if ctx.valued_expr():
            return self.visit(ctx.valued_expr())
        elif ctx.logic_expr():
            return self.visit(ctx.logic_expr())
        return ""

    def visitValued_expr(self, ctx):
        result = self.visit(ctx.term(0))
        for i in range(1, len(ctx.term())):
            op = ctx.getChild(2 * i - 1).getText()
            result += f" {op} {self.visit(ctx.term(i))}"
        return result

    def visitTerm(self, ctx):
        result = self.visit(ctx.factor(0))
        for i in range(1, len(ctx.factor())):
            op = ctx.getChild(2 * i - 1).getText()
            
            if op == '//':
                op = '/'

            if op != '**':
                result += f" {op} {self.visit(ctx.factor(i))}"
            else:
                result = f"pow({result},{self.visit(ctx.factor(i))})"
        return result

    def visitFactor(self, ctx):
        if ctx.NUMBER():
            return ctx.NUMBER().getText()
        elif ctx.STRING():
            return ctx.STRING().getText()
        elif ctx.TRUE():
            return "true"
        elif ctx.FALSE():
            return "false"
        elif ctx.NONE():
            return "nullptr"
        elif ctx.IDENTIFIER() and ctx.LPAREN():
            func_name = ctx.IDENTIFIER(0).getText()
            
            args = ', '.join(self.visit(arg) for arg in ctx.expr())

            if func_name == "print":
                return f"std::cout<<{args}<<std::endl"
            
            if ctx.DOT() and ctx.IDENTIFIER(1).getText() == "append":
                return f"{func_name}.push_back({args})"

            return f"{func_name}({args})"
        
        elif ctx.IDENTIFIER():
            index_expr = ""
            if ctx.LBRACKET():
                index_expr = "[" + ", ".join(self.visit(idx) for idx in ctx.valued_expr()) + "]"
            return ctx.IDENTIFIER(0).getText() + index_expr
        elif ctx.LPAREN() and ctx.expr():
            return f"({self.visit(ctx.expr())})"
        elif ctx.list_expr():
            return self.visit(ctx.list_expr())
        elif ctx.fstring_expr():
            return self.visit(ctx.fstring_expr())

    def visitList_expr(self, ctx):
        elements = [self.visit(element) for element in ctx.expr()]
        elements = [str(element) if element is not None else "" for element in elements]
        self.result = "{" + ", ".join(elements) + "}"
        return self.result

    def visitIf_stmt(self, ctx):
        condition = self.visit(ctx.logic_expr(0))
        block = self.visit(ctx.block(0))
        result = f"if ({condition}) {block}"
        
        for i in range(len(ctx.ELIF())):
            elif_condition = self.visit(ctx.logic_expr(i+1))
            elif_block = self.visit(ctx.block(i+1))
            result += f" else if ({elif_condition}) {elif_block}"
        
        if ctx.ELSE():
            else_block = self.visit(ctx.block(-1))
            result += f" else {else_block}"
        
        return result


    def visitFor_stmt(self, ctx):
        iterator = ctx.IDENTIFIER().getText()
        self.declared_variables[(self.function,iterator)] = None
        iterable = self.visit(ctx.expr())
        block = self.visit(ctx.block())

        return f"for (auto {iterator} : {iterable}) {block}"

def translate_pseudocode_to_cpp(code):
    input_stream = InputStream(code)
    lexer = pyLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = pyParser(token_stream)
    tree = parser.program()

    visitor = PythonToCPPVisitor()
    cpp_code = visitor.visit(tree)

    print(cpp_code)

filename = input()
file = open(filename, "r")
code = file.read() + '\n'
translate_pseudocode_to_cpp(code)
