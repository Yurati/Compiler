package compiler;


import grammar.LanguageParser;
import grammar.LanguageParserVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ValueVisitor implements LanguageParserVisitor<Value> {
    @Override
    public Value visitParse(LanguageParser.ParseContext ctx) {
        return null;
    }

    @Override
    public Value visitBlock(LanguageParser.BlockContext ctx) {
        return null;
    }

    @Override
    public Value visitStat(LanguageParser.StatContext ctx) {
        return null;
    }

    @Override
    public Value visitAssignment(LanguageParser.AssignmentContext ctx) {
        return null;
    }

    @Override
    public Value visitType(LanguageParser.TypeContext ctx) {
        return null;
    }

    @Override
    public Value visitIf_stat(LanguageParser.If_statContext ctx) {
        return null;
    }

    @Override
    public Value visitCondition(LanguageParser.ConditionContext ctx) {
        return null;
    }

    @Override
    public Value visitCondition_block(LanguageParser.Condition_blockContext ctx) {
        return null;
    }

    @Override
    public Value visitStat_block(LanguageParser.Stat_blockContext ctx) {
        return null;
    }

    @Override
    public Value visitWhile_stat(LanguageParser.While_statContext ctx) {
        return null;
    }

    @Override
    public Value visitFor_stat(LanguageParser.For_statContext ctx) {
        return null;
    }

    @Override
    public Value visitFor_condition(LanguageParser.For_conditionContext ctx) {
        return null;
    }

    @Override
    public Value visitDo_while_stat(LanguageParser.Do_while_statContext ctx) {
        return null;
    }

    @Override
    public Value visitPrint(LanguageParser.PrintContext ctx) {
        return null;
    }

    @Override
    public Value visitNotExpr(LanguageParser.NotExprContext ctx) {
        return null;
    }

    @Override
    public Value visitMultiplicationExpr(LanguageParser.MultiplicationExprContext ctx) {
        return null;
    }

    @Override
    public Value visitAtomExpr(LanguageParser.AtomExprContext ctx) {
        return null;
    }

    @Override
    public Value visitOrExpr(LanguageParser.OrExprContext ctx) {
        return null;
    }

    @Override
    public Value visitAdditiveExpr(LanguageParser.AdditiveExprContext ctx) {
        return null;
    }

    @Override
    public Value visitRelationalExpr(LanguageParser.RelationalExprContext ctx) {
        return null;
    }

    @Override
    public Value visitEqualityExpr(LanguageParser.EqualityExprContext ctx) {
        return null;
    }

    @Override
    public Value visitAndExpr(LanguageParser.AndExprContext ctx) {
        return null;
    }

    @Override
    public Value visitParExpr(LanguageParser.ParExprContext ctx) {
        return null;
    }

    @Override
    public Value visitNumberAtom(LanguageParser.NumberAtomContext ctx) {
        return null;
    }

    @Override
    public Value visitBooleanAtom(LanguageParser.BooleanAtomContext ctx) {
        return null;
    }

    @Override
    public Value visitIdAtom(LanguageParser.IdAtomContext ctx) {
        return null;
    }

    @Override
    public Value visitStringAtom(LanguageParser.StringAtomContext ctx) {
        return null;
    }

    @Override
    public Value visitNilAtom(LanguageParser.NilAtomContext ctx) {
        return null;
    }

    @Override
    public Value visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Value visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Value visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Value visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
