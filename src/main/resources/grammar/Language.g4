grammar Language;
compiler : statement+;

statement : let | print ;
let : 'func' (Whole | Doulot | Boolean | Inscription) VariableName '==' (IntegerNumber | DoubleNumber | String);
print : 'show' VariableName ;

Semicolon : ';' ;
Comma : ',' ;
Asterisk : '*' ;
Plus : '+' ;
Dot : '.' ;
Dash : '-' ;
Slash: '/' ;
CourlyBracketL : '{' ;
CourlyBracketR : '}' ;

WS : [ \r\n\t]+ -> skip;
Whole: 'whole';
Doulot: 'doulot';
Boolean: 'boolean';
Inscription: 'inscription';
VariableName: [a-z_]+;

String : [a-zA-Z]+ ;
IntegerNumber: [0-9]+;
DoubleNumber: [0-9]+Dot[0-9]+;