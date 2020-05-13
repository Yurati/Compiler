package customLexer;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {

    public ArrayList<Token> lex(String input) {
        // The tokens to return
        ArrayList<Token> tokens = new ArrayList<Token>();

        // Lexer logic begins here
        StringBuffer tokenPatternsBuffer = new StringBuffer();
        for (TokenType tokenType : TokenType.values())
            tokenPatternsBuffer.append(String.format("|(?<%s>%s)", tokenType.name(), tokenType.pattern));
        Pattern tokenPatterns = Pattern.compile(tokenPatternsBuffer.substring(1));

        String[] lines = input.split("\n");

        for (int i = 0; i < lines.length; ++i) {
            // Begin matching tokens
            Matcher matcher = tokenPatterns.matcher(lines[i]);
            boolean createNewLine = true;
            while (matcher.find()) {
                if (matcher.group(TokenType.ADD.name()) != null) {
                    tokens.add(new Token(TokenType.ADD, matcher.group(TokenType.ADD.name())));
                } else if (matcher.group(TokenType.NUMBER.name()) != null) {
                    tokens.add(new Token(TokenType.NUMBER, matcher.group(TokenType.NUMBER.name())));
                } else if (matcher.group(TokenType.SUB.name()) != null) {
                    tokens.add(new Token(TokenType.SUB, matcher.group(TokenType.SUB.name())));
                } else if (matcher.group(TokenType.MUL.name()) != null) {
                    tokens.add(new Token(TokenType.MUL, matcher.group(TokenType.MUL.name())));
                } else if (matcher.group(TokenType.DIV.name()) != null) {
                    tokens.add(new Token(TokenType.DIV, matcher.group(TokenType.DIV.name())));
                } else if (matcher.group(TokenType.WHITESPACE.name()) != null) {
                    continue;
                } else if (matcher.group(TokenType.INT.name()) != null) {
                    tokens.add(new Token(TokenType.INT, matcher.group(TokenType.INT.name())));
                } else if (matcher.group(TokenType.DOUBLE.name()) != null) {
                    tokens.add(new Token(TokenType.DOUBLE, matcher.group(TokenType.DOUBLE.name())));
                } else if (matcher.group(TokenType.BOOELAN.name()) != null) {
                    tokens.add(new Token(TokenType.BOOELAN, matcher.group(TokenType.BOOELAN.name())));
                } else if (matcher.group(TokenType.STRING.name()) != null) {
                    tokens.add(new Token(TokenType.STRING, matcher.group(TokenType.STRING.name())));
                } else if (matcher.group(TokenType.FUNC.name()) != null) {
                    tokens.add(new Token(TokenType.FUNC, matcher.group(TokenType.FUNC.name())));
                } else if (matcher.group(TokenType.IF.name()) != null) {
                    tokens.add(new Token(TokenType.IF, matcher.group(TokenType.IF.name())));
                } else if (matcher.group(TokenType.ELSE.name()) != null) {
                    tokens.add(new Token(TokenType.ELSE, matcher.group(TokenType.ELSE.name())));
                } else if (matcher.group(TokenType.FOR.name()) != null) {
                    tokens.add(new Token(TokenType.FOR, matcher.group(TokenType.FOR.name())));
                } else if (matcher.group(TokenType.DO.name()) != null) {
                    tokens.add(new Token(TokenType.DO, matcher.group(TokenType.DO.name())));
                } else if (matcher.group(TokenType.WHILE.name()) != null) {
                    tokens.add(new Token(TokenType.WHILE, matcher.group(TokenType.WHILE.name())));
                } else if (matcher.group(TokenType.IRRELEVANT.name()) != null) {
                    createNewLine = false;
                    break;
                } else if (matcher.group(TokenType.RPAREN.name()) != null) {
                    tokens.add(new Token(TokenType.RPAREN, matcher.group(TokenType.RPAREN.name())));
                } else if (matcher.group(TokenType.LPAREN.name()) != null) {
                    tokens.add(new Token(TokenType.LPAREN, matcher.group(TokenType.LPAREN.name())));
                } else if (matcher.group(TokenType.RBRACE.name()) != null) {
                    tokens.add(new Token(TokenType.RBRACE, matcher.group(TokenType.RBRACE.name())));
                } else if (matcher.group(TokenType.LBRACE.name()) != null) {
                    tokens.add(new Token(TokenType.LBRACE, matcher.group(TokenType.LBRACE.name())));
                } else if (matcher.group(TokenType.RBRACK.name()) != null) {
                    tokens.add(new Token(TokenType.RBRACK, matcher.group(TokenType.RBRACK.name())));
                } else if (matcher.group(TokenType.LBRACK.name()) != null) {
                    tokens.add(new Token(TokenType.LBRACK, matcher.group(TokenType.LBRACK.name())));
                } else if (matcher.group(TokenType.SEMICOLON.name()) != null) {
                    tokens.add(new Token(TokenType.SEMICOLON, matcher.group(TokenType.SEMICOLON.name())));
                } else if (matcher.group(TokenType.COMMA.name()) != null) {
                    tokens.add(new Token(TokenType.COMMA, matcher.group(TokenType.COMMA.name())));
                } else if (matcher.group(TokenType.ASSIGN.name()) != null) {
                    tokens.add(new Token(TokenType.ASSIGN, matcher.group(TokenType.ASSIGN.name())));
                } else if (matcher.group(TokenType.GT.name()) != null) {
                    tokens.add(new Token(TokenType.GT, matcher.group(TokenType.GT.name())));
                } else if (matcher.group(TokenType.LT.name()) != null) {
                    tokens.add(new Token(TokenType.LT, matcher.group(TokenType.LT.name())));
                } else if (matcher.group(TokenType.BANG.name()) != null) {
                    tokens.add(new Token(TokenType.BANG, matcher.group(TokenType.BANG.name())));
                } else if (matcher.group(TokenType.QUESTION.name()) != null) {
                    tokens.add(new Token(TokenType.QUESTION, matcher.group(TokenType.QUESTION.name())));
                } else if (matcher.group(TokenType.COLON.name()) != null) {
                    tokens.add(new Token(TokenType.COLON, matcher.group(TokenType.COLON.name())));
                } else if (matcher.group(TokenType.EQUAL.name()) != null) {
                    tokens.add(new Token(TokenType.EQUAL, matcher.group(TokenType.EQUAL.name())));
                } else if (matcher.group(TokenType.LE.name()) != null) {
                    tokens.add(new Token(TokenType.LE, matcher.group(TokenType.LE.name())));
                } else if (matcher.group(TokenType.GE.name()) != null) {
                    tokens.add(new Token(TokenType.GE, matcher.group(TokenType.GE.name())));
                } else if (matcher.group(TokenType.NOTEQUAL.name()) != null) {
                    tokens.add(new Token(TokenType.NOTEQUAL, matcher.group(TokenType.NOTEQUAL.name())));
                } else if (matcher.group(TokenType.AND.name()) != null) {
                    tokens.add(new Token(TokenType.AND, matcher.group(TokenType.AND.name())));
                } else if (matcher.group(TokenType.OR.name()) != null) {
                    tokens.add(new Token(TokenType.OR, matcher.group(TokenType.OR.name())));
                } else if (matcher.group(TokenType.DOT.name()) != null) {
                    tokens.add(new Token(TokenType.DOT, matcher.group(TokenType.DOT.name())));
                }
            }
            if (createNewLine) tokens.add(new Token(TokenType.NEWLINE, ""));
        }


        return tokens;
    }
}
