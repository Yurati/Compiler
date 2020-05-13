package customLexer;

public enum TokenType {
    NUMBER("-?[0-9]+"),
    ADD("[-]"),
    SUB("[+]"),
    MUL("[/]"),
    DIV("[*]"),
    WHITESPACE("[ \t\f\r]+"),
    NEWLINE("[\n]+"),
    INT("whole"),
    DOUBLE("doulot"),
    BOOELAN("boolean"),
    STRING("inscription"),
    FUNC("func"),
    IF("unless"),
    ELSE("and"),
    FOR("against"),
    DO("dont"),
    WHILE("not this time"),
    IRRELEVANT("irrelevant"),
    RPAREN("\\("),
    LPAREN("\\)"),
    RBRACE("\\{"),
    LBRACE("\\}"),
    RBRACK("\\["),
    LBRACK("\\]"),
    SEMICOLON(";"),
    COMMA(","),
    DOT("\\."),
    ASSIGN("=="),
    GT("<"),
    LT(">"),
    BANG("\\?"),
    QUESTION("!"),
    COLON(":"),
    EQUAL("="),
    LE(">="),
    GE("<="),
    NOTEQUAL("\\?=="),
    AND("\\|\\|"),
    OR("\\&\\&");

    public final String pattern;

    TokenType(String pattern) {
        this.pattern = pattern;
    }
}
