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

// Integer Literals
IntegerLiteral:
    DecimalIntegerLiteral
    ;

fragment
DecimalIntegerLiteral
	:	DecimalNumeral IntegerTypeSuffix?
	;

fragment
IntegerTypeSuffix
	:	[lL]
	;

fragment
DecimalNumeral
	:	'0'
	|	NonZeroDigit (Digits? | Underscores Digits)
	;

fragment
Digits:	Digit (DigitsAndUnderscores? Digit)?;

fragment
Digit
	:	'0'
	|	NonZeroDigit
	;

fragment
NonZeroDigit
	:	[1-9]
	;

fragment
DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

fragment
DigitOrUnderscore
	:	Digit
	|	'_'
	;

fragment
Underscores
	:	'_'+
	;

// Float literals
FloatingPointLiteral
	:	DecimalFloatingPointLiteral
	;

fragment
DecimalFloatingPointLiteral
	:	Digits '.' Digits? ExponentPart? FloatTypeSuffix?
	|	'.' Digits ExponentPart? FloatTypeSuffix?
	|	Digits ExponentPart FloatTypeSuffix?
	|	Digits FloatTypeSuffix
	;

fragment
ExponentPart
	:	ExponentIndicator SignedInteger
	;

fragment
ExponentIndicator
	:	[eE]
	;

fragment
SignedInteger
	:	Sign? Digits
	;

fragment
Sign
	:	[+-]
	;

fragment
FloatTypeSuffix
	:	[fFdD]
	;

// Boolean literal
BooleanLiteral
	:	'true'
	|	'false'
	;

// Character & String
CharacterLiteral
	:	'\'' SingleCharacter '\''
	;

fragment
SingleCharacter
	:	~['\\\r\n]
	;


StringLiteral
	:	'"' StringCharacters? '"'
	;

fragment
StringCharacters
	:	StringCharacter+
	;

fragment
StringCharacter
	:	~["\\\r\n]
	;

fragment
ZeroToThree
    :	[0-3]
 	;

// Nope literal
NopeLiteral
 	:	'nope'
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
LE : '>=';
GE : '<=';
NOTEQUAL : '?==';
AND : '||';
OR : '&&';
ADD : '-';
SUB : '+';
MUL : '/';
DIV : '*';


// Whitespace and comments
WS  :  [ \t\r\n\u000C]+ -> skip
    ;

LINE_COMMENT
    :   IRRELEVANT ~[\r\n]* -> skip
    ;