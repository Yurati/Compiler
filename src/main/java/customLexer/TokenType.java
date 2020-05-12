package customLexer;

public enum TokenType {
    NUMBER("-?[0-9]+"),
    ADD("[-]"),
    SUB("[+]"),
    MUL("[/]"),
    DIV("[*]"),
    WHITESPACE("[ \t\f\r\n]+");

    public final String pattern;

    TokenType(String pattern) {
        this.pattern = pattern;
    }
}
