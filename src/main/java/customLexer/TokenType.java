package customLexer;

public enum TokenType {
    NUMBER("-?[0-9]+"),
    ADD("[-]"),
    SUB("[+]"),
    MUL("[/]"),
    DIV("[*]"),
    WHITESPACE("[ \t\f\r]+"),
    NEWLINE("[\n]+"),
    WHOLE("whole"),
    DOULOT("doulot"),
    BOOELAN("boolean"),
    INSCRIPTION("inscription"),
    FUNC("func"),
    UNLESS("unless"),
    ANDWHILE("and"),
    AGAINST("against"),
    DONT("dont"),
    NOTTHISTIME("not this time"),
    IRRELEVANT("irrelevant");

    public final String pattern;

    TokenType(String pattern) {
        this.pattern = pattern;
    }
}
