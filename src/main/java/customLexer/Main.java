package customLexer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String input = "11 + 22 - 33 \n irrelevant blablabla \n coko2lwie_k";
        Lexer lexer = new Lexer();

        // Create tokens and print them
        ArrayList<Token> tokens = lexer.lex(input);
        for (Token token : tokens)
            System.out.println(token);
    }
}
