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
            } else if (matcher.group(TokenType.WHITESPACE.name()) != null) continue;
        }

        return tokens;
    }
}
