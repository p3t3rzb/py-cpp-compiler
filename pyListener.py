# Generated from py.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .pyParser import pyParser
else:
    from pyParser import pyParser

# This class defines a complete listener for a parse tree produced by pyParser.
class pyListener(ParseTreeListener):

    # Enter a parse tree produced by pyParser#program.
    def enterProgram(self, ctx:pyParser.ProgramContext):
        pass

    # Exit a parse tree produced by pyParser#program.
    def exitProgram(self, ctx:pyParser.ProgramContext):
        pass


    # Enter a parse tree produced by pyParser#statement.
    def enterStatement(self, ctx:pyParser.StatementContext):
        pass

    # Exit a parse tree produced by pyParser#statement.
    def exitStatement(self, ctx:pyParser.StatementContext):
        pass


    # Enter a parse tree produced by pyParser#simple_stmt.
    def enterSimple_stmt(self, ctx:pyParser.Simple_stmtContext):
        pass

    # Exit a parse tree produced by pyParser#simple_stmt.
    def exitSimple_stmt(self, ctx:pyParser.Simple_stmtContext):
        pass


    # Enter a parse tree produced by pyParser#control_stmt.
    def enterControl_stmt(self, ctx:pyParser.Control_stmtContext):
        pass

    # Exit a parse tree produced by pyParser#control_stmt.
    def exitControl_stmt(self, ctx:pyParser.Control_stmtContext):
        pass


    # Enter a parse tree produced by pyParser#global_stmt.
    def enterGlobal_stmt(self, ctx:pyParser.Global_stmtContext):
        pass

    # Exit a parse tree produced by pyParser#global_stmt.
    def exitGlobal_stmt(self, ctx:pyParser.Global_stmtContext):
        pass


    # Enter a parse tree produced by pyParser#nonlocal_stmt.
    def enterNonlocal_stmt(self, ctx:pyParser.Nonlocal_stmtContext):
        pass

    # Exit a parse tree produced by pyParser#nonlocal_stmt.
    def exitNonlocal_stmt(self, ctx:pyParser.Nonlocal_stmtContext):
        pass


    # Enter a parse tree produced by pyParser#type.
    def enterType(self, ctx:pyParser.TypeContext):
        pass

    # Exit a parse tree produced by pyParser#type.
    def exitType(self, ctx:pyParser.TypeContext):
        pass


    # Enter a parse tree produced by pyParser#assignment.
    def enterAssignment(self, ctx:pyParser.AssignmentContext):
        pass

    # Exit a parse tree produced by pyParser#assignment.
    def exitAssignment(self, ctx:pyParser.AssignmentContext):
        pass


    # Enter a parse tree produced by pyParser#comparison_op.
    def enterComparison_op(self, ctx:pyParser.Comparison_opContext):
        pass

    # Exit a parse tree produced by pyParser#comparison_op.
    def exitComparison_op(self, ctx:pyParser.Comparison_opContext):
        pass


    # Enter a parse tree produced by pyParser#expr.
    def enterExpr(self, ctx:pyParser.ExprContext):
        pass

    # Exit a parse tree produced by pyParser#expr.
    def exitExpr(self, ctx:pyParser.ExprContext):
        pass


    # Enter a parse tree produced by pyParser#logic_expr.
    def enterLogic_expr(self, ctx:pyParser.Logic_exprContext):
        pass

    # Exit a parse tree produced by pyParser#logic_expr.
    def exitLogic_expr(self, ctx:pyParser.Logic_exprContext):
        pass


    # Enter a parse tree produced by pyParser#logic_term.
    def enterLogic_term(self, ctx:pyParser.Logic_termContext):
        pass

    # Exit a parse tree produced by pyParser#logic_term.
    def exitLogic_term(self, ctx:pyParser.Logic_termContext):
        pass


    # Enter a parse tree produced by pyParser#logic_factor.
    def enterLogic_factor(self, ctx:pyParser.Logic_factorContext):
        pass

    # Exit a parse tree produced by pyParser#logic_factor.
    def exitLogic_factor(self, ctx:pyParser.Logic_factorContext):
        pass


    # Enter a parse tree produced by pyParser#comparison_expr.
    def enterComparison_expr(self, ctx:pyParser.Comparison_exprContext):
        pass

    # Exit a parse tree produced by pyParser#comparison_expr.
    def exitComparison_expr(self, ctx:pyParser.Comparison_exprContext):
        pass


    # Enter a parse tree produced by pyParser#valued_expr.
    def enterValued_expr(self, ctx:pyParser.Valued_exprContext):
        pass

    # Exit a parse tree produced by pyParser#valued_expr.
    def exitValued_expr(self, ctx:pyParser.Valued_exprContext):
        pass


    # Enter a parse tree produced by pyParser#term.
    def enterTerm(self, ctx:pyParser.TermContext):
        pass

    # Exit a parse tree produced by pyParser#term.
    def exitTerm(self, ctx:pyParser.TermContext):
        pass


    # Enter a parse tree produced by pyParser#factor.
    def enterFactor(self, ctx:pyParser.FactorContext):
        pass

    # Exit a parse tree produced by pyParser#factor.
    def exitFactor(self, ctx:pyParser.FactorContext):
        pass


    # Enter a parse tree produced by pyParser#list_expr.
    def enterList_expr(self, ctx:pyParser.List_exprContext):
        pass

    # Exit a parse tree produced by pyParser#list_expr.
    def exitList_expr(self, ctx:pyParser.List_exprContext):
        pass


    # Enter a parse tree produced by pyParser#key_value_pair.
    def enterKey_value_pair(self, ctx:pyParser.Key_value_pairContext):
        pass

    # Exit a parse tree produced by pyParser#key_value_pair.
    def exitKey_value_pair(self, ctx:pyParser.Key_value_pairContext):
        pass


    # Enter a parse tree produced by pyParser#fstring_expr.
    def enterFstring_expr(self, ctx:pyParser.Fstring_exprContext):
        pass

    # Exit a parse tree produced by pyParser#fstring_expr.
    def exitFstring_expr(self, ctx:pyParser.Fstring_exprContext):
        pass


    # Enter a parse tree produced by pyParser#compound_stmt.
    def enterCompound_stmt(self, ctx:pyParser.Compound_stmtContext):
        pass

    # Exit a parse tree produced by pyParser#compound_stmt.
    def exitCompound_stmt(self, ctx:pyParser.Compound_stmtContext):
        pass


    # Enter a parse tree produced by pyParser#block.
    def enterBlock(self, ctx:pyParser.BlockContext):
        pass

    # Exit a parse tree produced by pyParser#block.
    def exitBlock(self, ctx:pyParser.BlockContext):
        pass


    # Enter a parse tree produced by pyParser#if_stmt.
    def enterIf_stmt(self, ctx:pyParser.If_stmtContext):
        pass

    # Exit a parse tree produced by pyParser#if_stmt.
    def exitIf_stmt(self, ctx:pyParser.If_stmtContext):
        pass


    # Enter a parse tree produced by pyParser#while_stmt.
    def enterWhile_stmt(self, ctx:pyParser.While_stmtContext):
        pass

    # Exit a parse tree produced by pyParser#while_stmt.
    def exitWhile_stmt(self, ctx:pyParser.While_stmtContext):
        pass


    # Enter a parse tree produced by pyParser#funcdef.
    def enterFuncdef(self, ctx:pyParser.FuncdefContext):
        pass

    # Exit a parse tree produced by pyParser#funcdef.
    def exitFuncdef(self, ctx:pyParser.FuncdefContext):
        pass


    # Enter a parse tree produced by pyParser#for_stmt.
    def enterFor_stmt(self, ctx:pyParser.For_stmtContext):
        pass

    # Exit a parse tree produced by pyParser#for_stmt.
    def exitFor_stmt(self, ctx:pyParser.For_stmtContext):
        pass



del pyParser