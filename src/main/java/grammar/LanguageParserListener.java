// Generated from C:/Users/Lukasz/IdeaProjects/Compiler/src/main/antlr\LanguageParser.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(LanguageParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(LanguageParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LanguageParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LanguageParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(LanguageParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(LanguageParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LanguageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LanguageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(LanguageParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(LanguageParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(LanguageParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(LanguageParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(LanguageParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(LanguageParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(LanguageParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(LanguageParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void enterFor_condition(LanguageParser.For_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void exitFor_condition(LanguageParser.For_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#do_while_stat}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_stat(LanguageParser.Do_while_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#do_while_stat}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_stat(LanguageParser.Do_while_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LanguageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LanguageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(LanguageParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(LanguageParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(LanguageParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(LanguageParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(LanguageParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(LanguageParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(LanguageParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(LanguageParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(LanguageParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(LanguageParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(LanguageParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(LanguageParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(LanguageParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(LanguageParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(LanguageParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(LanguageParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(LanguageParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(LanguageParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(LanguageParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(LanguageParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(LanguageParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(LanguageParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(LanguageParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(LanguageParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(LanguageParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(LanguageParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(LanguageParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link LanguageParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(LanguageParser.NilAtomContext ctx);
}