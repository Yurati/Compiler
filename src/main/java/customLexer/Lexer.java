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

        // Begin matching tokens
        Matcher matcher = tokenPatterns.matcher(input);
        while (matcher.find()) {
            if (matcher.group(TokenType.NUMBER.name()) != null) {
                tokens.add(new Token(TokenType.NUMBER, matcher.group(TokenType.NUMBER.name())));
            } else if (matcher.group(TokenType.ADD.name()) != null) {
                tokens.add(new Token(TokenType.ADD, matcher.group(TokenType.ADD.name())));
            } else if (matcher.group(TokenType.SUB.name()) != null) {
                tokens.add(new Token(TokenType.SUB, matcher.group(TokenType.SUB.name())));
            } else if (matcher.group(TokenType.MUL.name()) != null) {
                tokens.add(new Token(TokenType.MUL, matcher.group(TokenType.MUL.name())));
            } else if (matcher.group(TokenType.DIV.name()) != null) {
                tokens.add(new Token(TokenType.DIV, matcher.group(TokenType.DIV.name())));
            } else if (matcher.group(TokenType.NEWLINE.name()) != null) {
                tokens.add(new Token(TokenType.NEWLINE, ""));
            } else if (matcher.group(TokenType.WHITESPACE.name()) != null) {
                continue;
            } else if (matcher.group(TokenType.WHOLE.name()) != null) {
                tokens.add(new Token(TokenType.WHOLE, matcher.group(TokenType.WHOLE.name())));
            } else if (matcher.group(TokenType.DOULOT.name()) != null) {
                tokens.add(new Token(TokenType.DOULOT, matcher.group(TokenType.DOULOT.name())));
            } else if (matcher.group(TokenType.BOOELAN.name()) != null) {
                tokens.add(new Token(TokenType.BOOELAN, matcher.group(TokenType.BOOELAN.name())));
            } else if (matcher.group(TokenType.INSCRIPTION.name()) != null) {
                tokens.add(new Token(TokenType.INSCRIPTION, matcher.group(TokenType.INSCRIPTION.name())));
            } else if (matcher.group(TokenType.FUNC.name()) != null) {
                tokens.add(new Token(TokenType.FUNC, matcher.group(TokenType.FUNC.name())));
            } else if (matcher.group(TokenType.UNLESS.name()) != null) {
                tokens.add(new Token(TokenType.UNLESS, matcher.group(TokenType.UNLESS.name())));
            } else if (matcher.group(TokenType.ANDWHILE.name()) != null) {
                tokens.add(new Token(TokenType.ANDWHILE, matcher.group(TokenType.ANDWHILE.name())));
            } else if (matcher.group(TokenType.AGAINST.name()) != null) {
                tokens.add(new Token(TokenType.AGAINST, matcher.group(TokenType.AGAINST.name())));
            } else if (matcher.group(TokenType.DONT.name()) != null) {
                tokens.add(new Token(TokenType.DONT, matcher.group(TokenType.DONT.name())));
            } else if (matcher.group(TokenType.NOTTHISTIME.name()) != null) {
                tokens.add(new Token(TokenType.NOTTHISTIME, matcher.group(TokenType.NOTTHISTIME.name())));
            } else if (matcher.group(TokenType.IRRELEVANT.name()) != null) {
                tokens.add(new Token(TokenType.IRRELEVANT, matcher.group(TokenType.IRRELEVANT.name())));
            }
        }

        return tokens;
    }
}
