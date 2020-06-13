package compiler;


import grammar.LanguageParser;
import grammar.LanguageParserBaseVisitor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValueVisitor extends LanguageParserBaseVisitor<Value> {
    Map<String, Value> memory = new HashMap<>();

    double DOUBLE_COMPARE = 0.00000000000001;

/*    @Override
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
    }*/

    @Override
    public Value visitAssignment(LanguageParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = visit(ctx.expr());
        return memory.put(id, value);
    }

    @Override
    public Value visitType(LanguageParser.TypeContext ctx) {
        return null;
    }

    @Override
    public Value visitIf_stat(LanguageParser.If_statContext ctx) {
        LanguageParser.Condition_blockContext conditions =  ctx.condition_block();

        boolean evaluatedBlock = false;

        for(LanguageParser.Condition_blockContext condition : conditions) {

            Value evaluated = this.visit(condition.expr());

            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.stat_block());
                break;
            }
        }

        if(!evaluatedBlock && ctx.stat_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.stat_block());
        }

        return new Value(new Object());
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
/*        Value value = this.visit(ctx.expr());

        while(value.asBoolean()) {

            // evaluate the code block
            this.visit(ctx.stat_block());

            // evaluate the expression
            value = this.visit(ctx.expr());
        }

        return Value.VOID;*/
        return null;
    }

    @Override
    public Value visitFor_stat(LanguageParser.For_statContext ctx) {
        return null;
    }

    @Override
    public Value visitDo_while_stat(LanguageParser.Do_while_statContext ctx) {
        return null;
    }

    @Override
    public Value visitPrint(LanguageParser.PrintContext ctx) {
        Value value = this.visit(ctx.expr());
        System.out.println(value);
        return value;
    }

    @Override
    public Value visitNotExpr(LanguageParser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }

/*    @Override
    public Value visitAtomExpr(LanguageParser.AtomExprContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }*/

    @Override
    public Value visitMultiplicationExpr(LanguageParser.MultiplicationExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LanguageParser.MUL:
                return new Value(left.asDouble() * right.asDouble());
            case LanguageParser.DIV:
                return new Value(left.asDouble() / right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + LanguageParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitAdditiveExpr(LanguageParser.AdditiveExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LanguageParser.ADD:
                return left.isString() && right.isString() ?
                        new Value(left.asString() + right.asString()) :
                        new Value(left.asDouble() + right.asDouble());

            case LanguageParser.SUB:
                return new Value(left.asDouble() - right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + LanguageParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitRelationalExpr(LanguageParser.RelationalExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LanguageParser.LT:
                return new Value(left.asDouble() < right.asDouble());
            case LanguageParser.LTEQ:
                return new Value(left.asDouble() <= right.asDouble());
            case LanguageParser.GT:
                return new Value(left.asDouble() > right.asDouble());
            case LanguageParser.GTEQ:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + LanguageParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitEqualityExpr(LanguageParser.EqualityExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LanguageParser.EQUAL:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) < DOUBLE_COMPARE) :
                        new Value(left.equals(right));
            case LanguageParser.NOTEQUAL:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) >= DOUBLE_COMPARE) :
                        new Value(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + LanguageParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitAndExpr(LanguageParser.AndExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpr(LanguageParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    @Override
    public Value visitParExpr(LanguageParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public Value visitNumberAtom(LanguageParser.NumberAtomContext ctx) {
        System.out.println(LanguageParser.DOULOT_VALUE);
        return new Value(Double.valueOf(ctx.getText()));
/*        switch (Integer.valueOf(ctx.children.get(0).getText())) {
            case LanguageParser.DOULOT_VALUE:
                return new Value(Double.valueOf(ctx.getText()));
            case LanguageParser.WHOLE_VALUE:
                return new Value(Integer.valueOf(ctx.getText()));
            default:
                throw new RuntimeException("unknown operator: " + LanguageParser.tokenNames[ctx.invokingState]);
        }*/
    }

    @Override
    public Value visitBooleanAtom(LanguageParser.BooleanAtomContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitIdAtom(LanguageParser.IdAtomContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }

    @Override
    public Value visitStringAtom(LanguageParser.StringAtomContext ctx) {
        return new Value(ctx.getText());
    }

    @Override
    public Value visitNilAtom(LanguageParser.NilAtomContext ctx) {
        return new Value(null);
    }
}
