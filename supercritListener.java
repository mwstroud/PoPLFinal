// Generated from supercrit.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link supercritParser}.
 */
public interface supercritListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link supercritParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(supercritParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link supercritParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(supercritParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link supercritParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(supercritParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link supercritParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(supercritParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link supercritParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(supercritParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link supercritParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(supercritParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link supercritParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(supercritParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link supercritParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(supercritParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link supercritParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(supercritParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link supercritParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(supercritParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link supercritParser#while_block}.
	 * @param ctx the parse tree
	 */
	void enterWhile_block(supercritParser.While_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link supercritParser#while_block}.
	 * @param ctx the parse tree
	 */
	void exitWhile_block(supercritParser.While_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link supercritParser#for_block}.
	 * @param ctx the parse tree
	 */
	void enterFor_block(supercritParser.For_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link supercritParser#for_block}.
	 * @param ctx the parse tree
	 */
	void exitFor_block(supercritParser.For_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link supercritParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(supercritParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link supercritParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(supercritParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link supercritParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(supercritParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link supercritParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(supercritParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link supercritParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(supercritParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link supercritParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(supercritParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link supercritParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(supercritParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link supercritParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(supercritParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link supercritParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(supercritParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link supercritParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(supercritParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link supercritParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(supercritParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link supercritParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(supercritParser.AssignmentContext ctx);
}