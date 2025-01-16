# Generated from py.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .pyParser import pyParser
else:
    from pyParser import pyParser

# This class defines a complete generic visitor for a parse tree produced by pyParser.

class pyVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by pyParser#program.
    def visitProgram(self, ctx:pyParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#statement.
    def visitStatement(self, ctx:pyParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#simple_stmt.
    def visitSimple_stmt(self, ctx:pyParser.Simple_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#control_stmt.
    def visitControl_stmt(self, ctx:pyParser.Control_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#type.
    def visitType(self, ctx:pyParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#assignment.
    def visitAssignment(self, ctx:pyParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#comparison_op.
    def visitComparison_op(self, ctx:pyParser.Comparison_opContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#expr.
    def visitExpr(self, ctx:pyParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#logic_expr.
    def visitLogic_expr(self, ctx:pyParser.Logic_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#logic_term.
    def visitLogic_term(self, ctx:pyParser.Logic_termContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#logic_factor.
    def visitLogic_factor(self, ctx:pyParser.Logic_factorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#comparison_expr.
    def visitComparison_expr(self, ctx:pyParser.Comparison_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#valued_expr.
    def visitValued_expr(self, ctx:pyParser.Valued_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#term.
    def visitTerm(self, ctx:pyParser.TermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#factor.
    def visitFactor(self, ctx:pyParser.FactorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#list_expr.
    def visitList_expr(self, ctx:pyParser.List_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#key_value_pair.
    def visitKey_value_pair(self, ctx:pyParser.Key_value_pairContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#fstring_expr.
    def visitFstring_expr(self, ctx:pyParser.Fstring_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#compound_stmt.
    def visitCompound_stmt(self, ctx:pyParser.Compound_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#block.
    def visitBlock(self, ctx:pyParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#if_stmt.
    def visitIf_stmt(self, ctx:pyParser.If_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#while_stmt.
    def visitWhile_stmt(self, ctx:pyParser.While_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#funcdef.
    def visitFuncdef(self, ctx:pyParser.FuncdefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by pyParser#for_stmt.
    def visitFor_stmt(self, ctx:pyParser.For_stmtContext):
        return self.visitChildren(ctx)



del pyParser