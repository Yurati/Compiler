parser grammar LanguageParser;

options {
    tokenVocab=LanguageLexer;
}

parse
 : block EOF
 ;

block
 : stat*
 ;

stat
 : assignment
 | if_stat
 | while_stat
 | for_stat
 | do_while_stat
 | print
 | OTHER {System.err.println("Unknown character: " + $OTHER.text);}
 ;

assignment
 : FUNC type ID ASSIGN expr SEMICOLON
 | ID ASSIGN expr SEMICOLON
 ;

type
: WHOLE
| DOULOT
| INSCRIPTION
;

if_stat
 : UNLESS condition_block (ELSE stat_block)?
 ;

condition
 : LPAREN expr RPAREN
 ;

condition_block
 : condition stat_block
 ;

stat_block
 : LBRACE block RBRACE
 | stat
 ;

while_stat
 : NOTTHISTIME condition_block
 ;

for_stat
 : AGAINST for_condition
 ;

for_condition
 : LPAREN assignment expr SEMICOLON assignment RPAREN stat_block
 ;

do_while_stat
 : DONT stat_block NOTTHISTIME condition block
 ;

print
 : PRINT expr SEMICOLON
 ;

expr
 : BANG expr                             #notExpr
 | expr op=(MUL | DIV) expr              #multiplicationExpr
 | expr op=(ADD | SUB) expr              #additiveExpr
 | expr op=(LTEQ | GTEQ | LT | GT) expr  #relationalExpr
 | expr op=(EQUAL | NOTEQUAL) expr       #equalityExpr
 | expr AND expr                         #andExpr
 | expr OR expr                          #orExpr
 | atom                                  #atomExpr
 ;

atom
 : LPAREN expr RPAREN            #parExpr
 | (WHOLE_VALUE | DOULOT_VALUE)  #numberAtom
 | (TRUE | FALSE)                #booleanAtom
 | ID                            #idAtom
 | INSCRIPTION_VALUE             #stringAtom
 | NOPELITERAL                   #nilAtom
 ;




