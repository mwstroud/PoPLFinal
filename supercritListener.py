# Generated from supercrit.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .supercritParser import supercritParser
else:
    from supercritParser import supercritParser

# This class defines a complete listener for a parse tree produced by supercritParser.
class supercritListener(ParseTreeListener):

    # Enter a parse tree produced by supercritParser#start.
    def enterStart(self, ctx:supercritParser.StartContext):
        pass

    # Exit a parse tree produced by supercritParser#start.
    def exitStart(self, ctx:supercritParser.StartContext):
        pass


    # Enter a parse tree produced by supercritParser#block.
    def enterBlock(self, ctx:supercritParser.BlockContext):
        pass

    # Exit a parse tree produced by supercritParser#block.
    def exitBlock(self, ctx:supercritParser.BlockContext):
        pass


    # Enter a parse tree produced by supercritParser#line.
    def enterLine(self, ctx:supercritParser.LineContext):
        pass

    # Exit a parse tree produced by supercritParser#line.
    def exitLine(self, ctx:supercritParser.LineContext):
        pass


    # Enter a parse tree produced by supercritParser#comment.
    def enterComment(self, ctx:supercritParser.CommentContext):
        pass

    # Exit a parse tree produced by supercritParser#comment.
    def exitComment(self, ctx:supercritParser.CommentContext):
        pass


    # Enter a parse tree produced by supercritParser#tab_block.
    def enterTab_block(self, ctx:supercritParser.Tab_blockContext):
        pass

    # Exit a parse tree produced by supercritParser#tab_block.
    def exitTab_block(self, ctx:supercritParser.Tab_blockContext):
        pass


    # Enter a parse tree produced by supercritParser#if_block.
    def enterIf_block(self, ctx:supercritParser.If_blockContext):
        pass

    # Exit a parse tree produced by supercritParser#if_block.
    def exitIf_block(self, ctx:supercritParser.If_blockContext):
        pass


    # Enter a parse tree produced by supercritParser#while_block.
    def enterWhile_block(self, ctx:supercritParser.While_blockContext):
        pass

    # Exit a parse tree produced by supercritParser#while_block.
    def exitWhile_block(self, ctx:supercritParser.While_blockContext):
        pass


    # Enter a parse tree produced by supercritParser#for_block.
    def enterFor_block(self, ctx:supercritParser.For_blockContext):
        pass

    # Exit a parse tree produced by supercritParser#for_block.
    def exitFor_block(self, ctx:supercritParser.For_blockContext):
        pass


    # Enter a parse tree produced by supercritParser#function.
    def enterFunction(self, ctx:supercritParser.FunctionContext):
        pass

    # Exit a parse tree produced by supercritParser#function.
    def exitFunction(self, ctx:supercritParser.FunctionContext):
        pass


    # Enter a parse tree produced by supercritParser#statement.
    def enterStatement(self, ctx:supercritParser.StatementContext):
        pass

    # Exit a parse tree produced by supercritParser#statement.
    def exitStatement(self, ctx:supercritParser.StatementContext):
        pass


    # Enter a parse tree produced by supercritParser#expr.
    def enterExpr(self, ctx:supercritParser.ExprContext):
        pass

    # Exit a parse tree produced by supercritParser#expr.
    def exitExpr(self, ctx:supercritParser.ExprContext):
        pass


    # Enter a parse tree produced by supercritParser#conditional.
    def enterConditional(self, ctx:supercritParser.ConditionalContext):
        pass

    # Exit a parse tree produced by supercritParser#conditional.
    def exitConditional(self, ctx:supercritParser.ConditionalContext):
        pass


    # Enter a parse tree produced by supercritParser#assignment.
    def enterAssignment(self, ctx:supercritParser.AssignmentContext):
        pass

    # Exit a parse tree produced by supercritParser#assignment.
    def exitAssignment(self, ctx:supercritParser.AssignmentContext):
        pass



del supercritParser