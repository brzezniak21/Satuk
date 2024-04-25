grammar Satuk;

//(arithmetics | print | logical)* ;

prog:  assignment;

LPAREN     : '(';
RPAREN     : ')';
LBRACE     : '{';
RBRACE     : '}';
LBRACK     : '[';
RBRACK     : ']';
SEMICOLON  : ';';
COMMA      : ',';
DOT        : '.';

ASSIGN         : '=';
GT             : '>';
LT             : '<';
NOT            : '!';
QUESTION       : '?';
EQUAL          : '==';
LE             : '<=';
GE             : '>=';
NOTEQUAL       : '!='|'=!';
AND            : '&&';
OR             : '||';
INC            : '++';
DEC            : '--';
ADD            : '+';
SUB            : '-';
MUL            : '*';
DIV            : '/';
MOD            : '%';
ADD_ASSIGN     : '+=';
SUB_ASSIGN     : '-=';
MUL_ASSIGN     : '*=';
DIV_ASSIGN     : '/=';
WS: [ \t\r\n]+ -> skip;

INT     : [0-9]+;
STRING  : '"'[a-zA-Z0-9_ ]+'"';
BOOL    : 'true' | 'false';
FLOAT   : ('0' '.' [0-9]+ | [1-9][0-9]* '.' [0-9]*) | ('0' '.' [0-9]*);
CHAR    : '\''[a-zA-Z0-9]'\'';
VARIABLE : [a-zA-Z]+[0-9]*;

assignment: assign_int | assign_char | assign_string | assign_float | assign_bool;

assign_bool: 'bool' VARIABLE ASSIGN BOOL SEMICOLON;

assign_float: 'float' VARIABLE ASSIGN FLOAT SEMICOLON;

assign_string: 'string' VARIABLE ASSIGN STRING SEMICOLON;

assign_char: 'char' VARIABLE ASSIGN CHAR SEMICOLON;

assign_int: 'int' VARIABLE ASSIGN INT SEMICOLON;
