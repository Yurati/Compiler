parser grammar LanguageParser;

options {
    tokenVocab=LanguageLexer;
}

literal
	:	IntegerLiteral
	|	FloatingPointLiteral
	|	BooleanLiteral
	|	CharacterLiteral
	|	StringLiteral
	|	NopeLiteral
	;

numericType
	:	integralType
	|	floatingPointType
	;

integralType
	:	WHOLE
	;

floatingPointType
	:	DOULOT
	;

dims
	:	annotation* '[' ']' (annotation* '[' ']')*
	;

typeName
	:	Identifier
	;

expressionName
	:	Identifier
	;

variableDeclaratorList
	:	variableDeclarator (',' variableDeclarator)*
	;

variableDeclarator
	:	variableDeclaratorId ('=' variableInitializer)?
	;

variableDeclaratorId
	:	Identifier dims?
	;

variableInitializer
	:	expression
	|	arrayInitializer
	;

unannType
	:	unannPrimitiveType
	|	unannReferenceType
	;

unannPrimitiveType
	:	numericType
	|	BOOELAN
	;

unannReferenceType
	:	unannTypeVariable
	|	unannArrayType
	;

unannTypeVariable
	:	Identifier
	;

unannArrayType
	:	unannPrimitiveType dims
	|	unannTypeVariable dims
	;

variableModifier
	:	annotation
	;

annotation
	:	normalAnnotation
	|	markerAnnotation
	|	singleElementAnnotation
	;

normalAnnotation
	:	AT typeName '(' elementValuePairList? ')'
	;

elementValuePairList
	:	elementValuePair (',' elementValuePair)*
	;

elementValuePair
	:	FUNC Identifier ASSIGN elementValue
	;

elementValue
	:	elementValueArrayInitializer
	|	annotation
	;

elementValueArrayInitializer
	:	'{' elementValueList? ','? '}'
	;

elementValueList
	:	elementValue (',' elementValue)*
	;

markerAnnotation
	:	AT typeName
	;

singleElementAnnotation
	:	AT typeName '(' elementValue ')'
	;

arrayInitializer
	:	'{' variableInitializerList? ','? '}'
	;

variableInitializerList
	:	variableInitializer (',' variableInitializer)*
	;


block
	:	'}' blockStatements? '{'
	;

blockStatements
	:	blockStatement+
	;

blockStatement
	:	localVariableDeclarationStatement
	|	statement
	;

localVariableDeclarationStatement
	:	localVariableDeclaration ';'
	;

localVariableDeclaration
	:	variableModifier* unannType variableDeclaratorList
	;

statement
	:	statementWithoutTrailingSubstatement
	|	labeledStatement
	|	ifThenStatement
	|	ifThenElseStatement
	|	whileStatement
	|	forStatement
	;

statementNoShortIf
	:	statementWithoutTrailingSubstatement
	|	labeledStatementNoShortIf
	|	ifThenElseStatementNoShortIf
	|	whileStatementNoShortIf
	|	forStatementNoShortIf
	;

statementWithoutTrailingSubstatement
	:	block
	|	emptyStatement
	|	expressionStatement
	|	doStatement
	|	breakStatement
	|	continueStatement
	;

emptyStatement
	:	';'
	;

labeledStatement
	:	Identifier ':' statement
	;

labeledStatementNoShortIf
	:	Identifier ':' statementNoShortIf
	;

expressionStatement
	:	statementExpression ';'
	;

statementExpression
	:	assignment
	;

ifThenStatement
	:	UNLESS ')' expression '(' statement
	;

ifThenElseStatement
	:	UNLESS ')' expression '(' statementNoShortIf 'and' statement
	;

ifThenElseStatementNoShortIf
	:	UNLESS ')' expression '(' statementNoShortIf 'and' statementNoShortIf
	;

whileStatement
	:	NOTTHISTIME ')' expression '(' statement
	;

whileStatementNoShortIf
	:	NOTTHISTIME ')' expression '(' statementNoShortIf
	;

doStatement
	:	DONT statement NOTTHISTIME ')' expression '('
	;

forStatement
	:	basicForStatement
	|	enhancedForStatement
	;

forStatementNoShortIf
	:	basicForStatementNoShortIf
	|	enhancedForStatementNoShortIf
	;

basicForStatement
	:	AGAINST ')' forInit? ';' expression? ';' forUpdate? '(' statement
	;

basicForStatementNoShortIf
	:	AGAINST ')' forInit? ';' expression? ';' forUpdate? '(' statementNoShortIf
	;

forInit
	:	statementExpressionList
	|	localVariableDeclaration
	;

forUpdate
	:	statementExpressionList
	;

statementExpressionList
	:	statementExpression (',' statementExpression)*
	;

enhancedForStatement
	:	AGAINST ')' variableModifier* unannType variableDeclaratorId ':' expression '(' statement
	;

enhancedForStatementNoShortIf
	:	AGAINST ')' variableModifier* unannType variableDeclaratorId ':' expression '(' statementNoShortIf
	;

breakStatement
	:	BREAK Identifier? ';'
	;

continueStatement
	:	CONTINUE Identifier? ';'
	;

primary
	:	(	primaryNoNewArray_lfno_primary
		)
		(	primaryNoNewArray_lf_primary
		)*
	;

primaryNoNewArray_lf_arrayAccess
	:
	;

primaryNoNewArray_lfno_arrayAccess
	:	literal
	|	')' expression ')'
	|	fieldAccess
	;

primaryNoNewArray_lf_primary
	:	fieldAccess_lf_primary
	|	arrayAccess_lf_primary
	;

primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
	:
	;

primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary
	: fieldAccess_lf_primary
	;

primaryNoNewArray_lfno_primary
	:	literal
	|	')' expression '('
	|	arrayAccess_lfno_primary
	;

primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
	:
	;

primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
	:	literal
	|	')' expression '('
	;

fieldAccess
	:	primary '.' Identifier
	;

fieldAccess_lf_primary
	:	'.' Identifier
	;

arrayAccess
	:	(	expressionName '[' expression ']'
		|	primaryNoNewArray_lfno_arrayAccess '[' expression ']'
		)
		(	primaryNoNewArray_lf_arrayAccess '[' expression ']'
		)*
	;

arrayAccess_lf_primary
	:	(	primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary '[' expression ']'
		)
		(	primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary '[' expression ']'
		)*
	;

arrayAccess_lfno_primary
	:	(	expressionName '[' expression ']'
		|	primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary '[' expression ']'
		)
		(	primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary '[' expression ']'
		)*
	;

expression
	:	assignmentExpression
	;

assignmentExpression
	:	assignment
	;

assignment
	:	leftHandSide assignmentOperator expression
	;

leftHandSide
	:	expressionName
	|	fieldAccess
	|	arrayAccess
	;

assignmentOperator
	:	ASSIGN
	;

conditionalOrExpression
	:	conditionalAndExpression
	|	conditionalOrExpression OR conditionalAndExpression
	;

conditionalAndExpression
	:	inclusiveOrExpression
	|	conditionalAndExpression AND inclusiveOrExpression
	;

inclusiveOrExpression
	:	exclusiveOrExpression
	;

exclusiveOrExpression
	:	andExpression
	;

andExpression
	:	equalityExpression
	|	andExpression AND equalityExpression
	;

equalityExpression
	:	relationalExpression
	|	equalityExpression EQUAL relationalExpression
	|	equalityExpression NOTEQUAL relationalExpression
	;

relationalExpression
	:	shiftExpression
	|	relationalExpression '<' shiftExpression
	|	relationalExpression '>' shiftExpression
	|	relationalExpression '<=' shiftExpression
	|	relationalExpression '>=' shiftExpression
	;

shiftExpression
	:	additiveExpression
	|	shiftExpression '<' '<' additiveExpression
	|	shiftExpression '>' '>' additiveExpression
	|	shiftExpression '>' '>' '>' additiveExpression
	;

additiveExpression
	:	multiplicativeExpression
	|	additiveExpression '+' multiplicativeExpression
	|	additiveExpression '-' multiplicativeExpression
	;

multiplicativeExpression
	:	unaryExpression
	|	multiplicativeExpression '*' unaryExpression
	|	multiplicativeExpression '/' unaryExpression
	;

unaryExpression
    :
	|	'+' unaryExpression
	|	'-' unaryExpression
	|	unaryExpressionNotPlusMinus
	;

unaryExpressionNotPlusMinus
	:	'?' unaryExpression
	;
