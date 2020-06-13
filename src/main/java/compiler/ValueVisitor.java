package compiler;


import grammar.LanguageParser;
import grammar.LanguageParserBaseVisitor;

import java.util.HashMap;
import java.util.Map;

public class ValueVisitor extends LanguageParserBaseVisitor<Value> {
    private Map<String, Value> memory = new HashMap<>();

    @Override
    public Value visitAssignment(LanguageParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = visit(ctx.expr());
        return memory.put(id, value);
    }

    @Override
    public Value visitIf_stat(LanguageParser.If_statContext ctx) {

        LanguageParser.Condition_blockContext conditionBlock =  ctx.condition_block();

        boolean evaluatedBlock = false;

        Value evaluated = this.visit(conditionBlock.condition());

        if(evaluated.asBoolean()) {
            evaluatedBlock = true;
            // evaluate this block whose expr==true
            this.visit(conditionBlock.stat_block());
        }

        if(!evaluatedBlock && ctx.stat_block() != null) {
            this.visit(ctx.stat_block());
        }

        return new Value();
    }

    @Override
    public Value visitWhile_stat(LanguageParser.While_statContext ctx) {

        LanguageParser.Condition_blockContext conditionBlock =  ctx.condition_block();

        Value value = this.visit(conditionBlock.condition());

        while(value.asBoolean()) {

            // evaluate the code block
            this.visit(conditionBlock.stat_block());

            // evaluate the expression
            value = this.visit(conditionBlock.condition());
        }

        return new Value();
    }

    @Override
    public Value visitFor_stat(LanguageParser.For_statContext ctx) {

        LanguageParser.For_conditionContext forCondition =  ctx.for_condition();

        LanguageParser.AssignmentContext assignments1 = forCondition.assignment(1);
        LanguageParser.AssignmentContext assignments2 = forCondition.assignment(2);

        Value val1 = visitAssignment(assignments1);
        Value val2 = visitAssignment(assignments2);
        return new Value();
    }

    @Override
    public Value visitDo_while_stat(LanguageParser.Do_while_statContext ctx) {

        Value value = this.visit(ctx.condition());

        while(value.asBoolean()) {

            // evaluate the code block
            this.visit(ctx.stat_block());

            // evaluate the expression
            value = this.visit(ctx.condition());
        }

        return new Value();
    }

    @Override
    public Value visitCondition(LanguageParser.ConditionContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public Value visitPrint(LanguageParser.PrintContext ctx) {
        Value value = this.visit(ctx.expr());
        if(value.isString()) {
            System.out.println(value.asString().substring(1,value.asString().length()-1));
        }else {
            System.out.println(value);
        }
        return null;
    }

    @Override
    public Value visitNotExpr(LanguageParser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }

    @Override
    public Value visitMultiplicationExpr(LanguageParser.MultiplicationExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case LanguageParser.MUL:
                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() * right.asDouble()) :
                        new Value(left.asInteger() * right.asInteger());
            case LanguageParser.DIV:
                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() / right.asDouble()) :
                        new Value(left.asInteger() / right.asInteger());
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
                if(left.isString() && right.isString()) {
                    return new Value(left.asString() + right.asString());
                } else if(left.isDouble() && right.isDouble()){
                    new Value(left.asDouble() + right.asDouble());
                } else {
                    new Value(left.asInteger() + right.asInteger());
                }
            case LanguageParser.SUB:
                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() - right.asDouble()) :
                        new Value(left.asInteger() - right.asInteger());
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
                return left.isDouble() && right.isDouble() ?
                        new Value(Double.compare(left.asDouble(), right.asDouble()) < 0) :
                        new Value(left.asInteger() < right.asInteger());
            case LanguageParser.LTEQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Double.compare(left.asDouble(), right.asDouble()) <= 0) :
                        new Value(left.asInteger() <= right.asInteger());
            case LanguageParser.GT:
                return left.isDouble() && right.isDouble() ?
                        new Value(Double.compare(left.asDouble(), right.asDouble()) > 0) :
                        new Value(left.asInteger() > right.asInteger());
            case LanguageParser.GTEQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Double.compare(left.asDouble(), right.asDouble()) >= 0) :
                        new Value(left.asInteger() >= right.asInteger());
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
                return new Value(left.equals(right));
            case LanguageParser.NOTEQUAL:
                return new Value(!left.equals(right));
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
        if(ctx.WHOLE_VALUE() == null) {
            return new Value(Double.valueOf(ctx.getText()));
        }else {
            return new Value(Integer.valueOf(ctx.getText()));
        }
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
