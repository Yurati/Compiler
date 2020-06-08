lexer grammar LanguageLexer;

// Keywords
WHOLE: 'whole';
DOULOT: 'doulot';
BOOELAN: 'boolean';
INSCRIPTION: 'inscription';
FUNC: 'func';
UNLESS: 'unless';
ANDWHILE: 'and';
AGAINST: 'against';
DONT: 'dont';
NOTTHISTIME: 'not this time';
IRRELEVANT: 'irrelevant';
BREAK: 'break';
CONTINUE: 'continue';
PRINT: 'print';
TRUE: 'true';
FALSE: 'false';

// Nope literal
NOPELITERAL
 	: 'nope'
 	;

// Separators
RPAREN : '(';
LPAREN : ')';
RBRACE : '{';
LBRACE : '}';
RBRACK : '[';
LBRACK : ']';
SEMICOLON : ';';
COMMA : ',';
DOT : '.';

//  Operators
ASSIGN : '==';
GT : '<';
LT : '>';
BANG : '?';
QUESTION : '!';
COLON : ':';
EQUAL : '=';
LTEQ : '>=';
GTEQ : '<=';
NOTEQUAL : '?==';
AND : '||';
OR : '&&';
ADD : '-';
SUB : '+';
MUL : '/';
DIV : '*';

COMMENT
 : IRRELEVANT ~[\r\n]* -> skip
 ;

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

WHOLE_VALUE
 : [0-9]+
 ;

DOULOT_VALUE
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

INSCRIPTION_VALUE
 : '"' (~["\r\n] | '""')* '"'
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER
 : .
 ;