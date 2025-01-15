grammar py;


NEWLINE: ('\r'? '\n')+;
COMMENT: '#' ~[\r\n]* -> skip;

IF: 'if';
ELIF: 'elif';
ELSE: 'else';
DEF: 'def';
RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';
WHILE: 'while';
IS: 'is';
NOT: 'not';
IN: 'in';
OR: 'or';
AND: 'and';
GLOBAL: 'global';
NONLOCAL: 'nonlocal';
FOR: 'for';
PASS: 'pass';
INT: 'int';
STR: 'str';
FLOAT: 'float';
LIST: 'list';
BOOL: 'bool';

TRUE: 'True';
FALSE: 'False';
NONE: 'None';
NUMBER: [0-9]+ (DOT [0-9]+)?;
STRING: '"' (~["\r\n])* '"' | '\'' (~['\r\n])* '\'';
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

COMMA: ',';
PLUS: '+';
MINUS: '-';
POW: '**';
MULT: '*';
DIV: '/';
DIVI: '//';
ASSIGN: '=';
MOD: '%';
LT: '<';
GT: '>';
LOE: '<=';
GOE: '>=';
EQ: '==';
NEQ: '!=';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';
COLON: ':';
BEGIN: '{';
END: '}';
DOT: '.';
INDICATOR: '->';

WS: [ \t]+ -> skip;


program
    : (statement | COMMENT)* EOF
    ;

statement
    : simple_stmt NEWLINE
    | compound_stmt
    | NEWLINE
    ;

simple_stmt
    : assignment
    | expr
    | global_stmt
    | nonlocal_stmt
    | PASS
    ;

control_stmt
    : RETURN expr?
    | BREAK
    | CONTINUE
    ;

global_stmt
    : GLOBAL IDENTIFIER (COMMA IDENTIFIER)*
    ;

nonlocal_stmt
    : NONLOCAL IDENTIFIER (COMMA IDENTIFIER)*
    ;

type
    : INT
    | STR
    | FLOAT
    | BOOL
    | LIST LBRACKET type RBRACKET
    ;

assignment
    : IDENTIFIER (LBRACKET valued_expr RBRACKET)* ASSIGN expr INDICATOR type
    ;

comparison_op
    : LT | GT | EQ | NEQ | GOE | LOE | IS | IN | NOT IN
    ;

expr
    : valued_expr 
    | logic_expr
    ;

logic_expr
    : logic_term (OR logic_term)*
    ;

logic_term
    : logic_factor (AND logic_factor)*
    ;

logic_factor
    : NOT logic_factor
    | comparison_expr
    ;

comparison_expr
    : valued_expr (comparison_op valued_expr)*
    ;

valued_expr
    : term ((PLUS | MINUS) term)*
    ;

term
    : factor ((MULT | DIV | DIVI | MOD | POW) factor)*
    ;

factor
    : NUMBER
    | STRING
    | TRUE
    | FALSE
    | NONE
    | IDENTIFIER (DOT IDENTIFIER)? LPAREN (expr (COMMA expr)*)? RPAREN
    | IDENTIFIER (LBRACKET valued_expr RBRACKET)*
    | LPAREN expr RPAREN
    | list_expr
    | fstring_expr
    ;

list_expr
    : LBRACKET expr (FOR IDENTIFIER IN expr)+ RBRACKET
    | LBRACKET (expr (COMMA expr)*)? RBRACKET
    ;

key_value_pair
    : expr COLON expr
    ;

fstring_expr
    : 'f' STRING
    ;

compound_stmt
    : if_stmt
    | while_stmt
    | for_stmt
    | funcdef
    ;

block
    : BEGIN NEWLINE (statement | control_stmt)* END
    | BEGIN NEWLINE PASS NEWLINE END
    ;

if_stmt
    : IF logic_expr COLON NEWLINE block 
      (NEWLINE ELIF logic_expr COLON NEWLINE block)* 
      (NEWLINE ELSE COLON NEWLINE block)?
    ;

while_stmt
    : WHILE logic_expr COLON NEWLINE block
    ;

funcdef
    : DEF IDENTIFIER LPAREN (IDENTIFIER INDICATOR type (COMMA IDENTIFIER INDICATOR type)*)? RPAREN COLON NEWLINE block
    ;

for_stmt
    : FOR IDENTIFIER IN expr COLON NEWLINE block
    ;
