grammar Satuk;

//(arithmetics | print | logical)* ;

prog:  (assignment | if_statement | print | functions | return | class | execute_function)*;

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


assignment: assign_char | assign_string | assign_float_constant | assign_bool | assign_int_ar | assign_int_constant | assign_float_ar | assign_bool_logical | assignment_class | assign_bool_dynamic | assign_char_dynamic | assign_float_dynamic | assign_int_dynamic | assign_string_dynamic | assignment_function;

assign_bool: 'bool' VARIABLE (ASSIGN BOOL)? SEMICOLON;

assign_bool_logical: VARIABLE ASSIGN logical_instructions SEMICOLON;

assign_bool_dynamic: VARIABLE ASSIGN BOOL SEMICOLON;

assign_string: 'string' VARIABLE (ASSIGN STRING)? SEMICOLON;

assign_string_dynamic: VARIABLE ASSIGN STRING SEMICOLON;

assign_char: 'char' VARIABLE (ASSIGN CHAR)? SEMICOLON;

assign_char_dynamic: VARIABLE ASSIGN CHAR SEMICOLON;

assign_int_constant: 'int' VARIABLE (ASSIGN INT)? SEMICOLON;

assign_int_ar: VARIABLE ASSIGN arithmetics_int SEMICOLON;

assign_int_dynamic: VARIABLE ASSIGN INT SEMICOLON;

assign_float_constant: 'float' VARIABLE (ASSIGN FLOAT)? SEMICOLON;

assign_float_dynamic: VARIABLE ASSIGN FLOAT SEMICOLON;

assign_float_ar: VARIABLE ASSIGN arithmetics_float SEMICOLON;

assignment_class: VARIABLE VARIABLE (ASSIGN 'new' VARIABLE LPAREN ((VARIABLE | FLOAT | INT | STRING | CHAR | BOOL) (COMMA (VARIABLE | FLOAT | INT | STRING | CHAR | BOOL))*)* RPAREN)? SEMICOLON;

assignment_function: ('string' | 'char' | 'int' | 'float' | 'bool' | VARIABLE)? VARIABLE ASSIGN execute_function;


arithmetics: arithmetics_int | arithmetics_float;

arithmetics_int: INT ((ADD | SUB | MUL | DIV) INT)+;

arithmetics_float: FLOAT ((ADD | SUB | MUL | DIV) FLOAT)+;


logical_instructions: logical_bool | logical_numeric | logical_text | logical_var;

logical_bool: NOT? BOOL ((NOTEQUAL | EQUAL) BOOL)? ((OR | AND) logical_instructions)*;

logical_numeric: (FLOAT | INT) (LE | GE | LT | GT | EQUAL | NOTEQUAL) (FLOAT | INT)  ((OR | AND) logical_instructions)*;

logical_text: (STRING | CHAR) (EQUAL | NOTEQUAL) (STRING | CHAR) ((OR | AND) logical_instructions)*;

logical_var: NOT? VARIABLE ((LE | GE | LT | GT | EQUAL | NOTEQUAL) VARIABLE)? ((OR | AND) logical_instructions)*;



if_statement: 'if' LPAREN logical_instructions RPAREN LBRACE prog RBRACE ('else if' LPAREN logical_instructions RPAREN LBRACE prog RBRACE)* ('else' LBRACE prog RBRACE)?;


print: 'display' LPAREN (arithmetics | logical_instructions | VARIABLE | STRING | CHAR | INT | FLOAT | BOOL) RPAREN SEMICOLON;


functions: function | constructor;

function: ('void' | 'string' | 'char' | 'int' | 'float' | 'bool' | VARIABLE) VARIABLE LPAREN (('string' | 'char' | 'int' | 'float' | 'bool' | VARIABLE) VARIABLE (COMMA ('string' | 'char' | 'int' | 'float' | 'bool' | VARIABLE) VARIABLE)*)* RPAREN LBRACE prog RBRACE;

constructor: VARIABLE LPAREN (('string' | 'char' | 'int' | 'float' | 'bool' | VARIABLE) VARIABLE (COMMA ('string' | 'char' | 'int' | 'float' | 'bool' | VARIABLE) VARIABLE)*)* RPAREN LBRACE prog RBRACE;


return: 'return' (arithmetics | logical_instructions | VARIABLE | STRING | CHAR | INT | FLOAT | BOOL) SEMICOLON;

class: 'class' VARIABLE LBRACE (assignment | functions)* RBRACE;

execute_function: (VARIABLE DOT)* VARIABLE LPAREN ((VARIABLE | FLOAT | INT | STRING | CHAR | BOOL) (COMMA (VARIABLE | FLOAT | INT | STRING | CHAR | BOOL))*)* RPAREN SEMICOLON;


