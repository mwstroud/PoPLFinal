// Grammar developed for PoPL: CS 4450 Final Project
// team: supercritical pitchfork ;   members: Pete Canfield, Chloe Jones, Matt Stroud
// 12/15/21

// Grammar for Antlr4 on Python3 target

grammar supercrit;


////////////////////////////////////////////////////////
//////////////////// Parser Rules //////////////////////
////////////////////////////////////////////////////////

// Defines the relations between the tokens 
// Base of the entire parser is the start which is composed of a block and then the end-of-file
start: block* EOF ;


// A block will be the most general Python3 code which will be any number of statements strung together
block
    : line
    | if_block
    | while_block
    | for_block
    ;

// A statement will be composed of the project requirements: if, while, for, and line which are expressions with a newline, etc.
line
    : assignment   
    | comment 
    | NEWLINE
    | WHITESPACE
    | expr NEWLINE 
    ;

// Support for comments 
comment: COMMENT;

// if/else blocks
// I want to define a tab block that will be used for if,while, and for loops. It is a tab followed by a line any number of times.

tab_block
    : (TAB block)*;

if_block
    : IF OPEN_PAR? conditional CLOSE_PAR? COLON NEWLINE tab_block (ELIF OPEN_PAR? conditional CLOSE_PAR? COLON NEWLINE tab_block)* (ELSE COLON NEWLINE tab_block)?
    | IF OPEN_PAR? conditional CLOSE_PAR? COLON NEWLINE tab_block (ELIF conditional COLON NEWLINE tab_block)* (ELSE COLON NEWLINE tab_block)?
    | IF conditional COLON NEWLINE tab_block (ELIF OPEN_PAR? conditional CLOSE_PAR? COLON NEWLINE tab_block)* (ELSE COLON NEWLINE tab_block)?
    | IF conditional COLON NEWLINE tab_block (ELIF conditional COLON NEWLINE tab_block)* (ELSE COLON NEWLINE tab_block)?
    ;

// Variable definitions


// while and for Loops  
while_block
    : WHILE WHITESPACE* OPEN_PAR conditional CLOSE_PAR COLON NEWLINE tab_block
    | WHILE conditional COLON NEWLINE tab_block
    ;

for_block
    : FOR WHITESPACE* OPEN_PAR conditional CLOSE_PAR COLON NEWLINE tab_block
    | FOR conditional COLON NEWLINE tab_block
    ;

// print calls

function
    : 'str' OPEN_PAR expr CLOSE_PAR 
    | 'int' OPEN_PAR expr CLOSE_PAR
    | 'range' OPEN_PAR (expr',')*expr CLOSE_PAR
    | 'print' OPEN_PAR expr CLOSE_PAR
    ;

// operate-able items (int, float, and string). int and float can have any operator act on them. string can just have addition.


// Arithmetic operators (+, -, *, /, %, ^)
statement
    : expr
    | conditional
    | assignment
    ;

////////////////////////////////////////////////// Need to define that an expression is composed of strings or ints or floats.

expr
    : '-' expr
    | VAR
    | INT
    | FLOAT
    | STRING
    | function
    | expr POW expr
    | expr (TIMES | DIV) expr
    | expr (PLUS | MINUS) expr
    | expr MOD expr  
    | expr (EQUAL | NOT_EQUAL) expr
    ;

// Conditional statements(<, <=, >, >=, ==, !=, and, or, not)
boolean
    : OPEN_PAR WHITESPACE* expr WHITESPACE* (LESS | LESS_EQ | GREATER | GREATER_EQ | EQUAL | NOT_EQUAL) WHITESPACE* expr WHITESPACE* CLOSE_PAR
    | WHITESPACE* expr WHITESPACE* (LESS | LESS_EQ | GREATER | GREATER_EQ | EQUAL | NOT_EQUAL) WHITESPACE* expr WHITESPACE*
    | TRUE
    | FALSE
    ;

conditional
    : WHITESPACE* (boolean WHITESPACE* AND WHITESPACE*)* boolean WHITESPACE*
    | WHITESPACE* (boolean WHITESPACE* OR WHITESPACE*)* boolean WHITESPACE*
    | WHITESPACE* boolean WHITESPACE*
    | WHITESPACE* NOT WHITESPACE* boolean WHITESPACE*
    ;


// Assignment operators (=, +=, -=, *=, /=, ^=, %=)
assignment
    : VAR WHITESPACE* (ASSIGN | INCREMENT | DECREMENT | MULT_EQ | DIV_EQ | POW_EQ | MOD_EQ) WHITESPACE* expr
    ;



// BONUS #1: Syntax error message (this is where we did the accept/reject string. If the given code aka. grammar is not a Python language, reject it.
// In other words, throw a syntax error message.)



// BONUS #2: Visualization of your parse tree. If you would like, you can use Graphviz.


////////////////////////////////////////////////////////
//////////////////// Lexer Rules ///////////////////////
////////////////////////////////////////////////////////

// Tokens are defined here

// Defining digits and letters (fragments are good for use in other lexer rules or parser rules in case they are used)
// As far as defining a number, minimally have INT and FLOAT.

fragment DIGIT: [0-9];
fragment NONZERO: [1-9];
fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
INT:                           // option for negative numbers, must start with nonzero number and continue with any digit or just be 0. This allows for negative 0 which is...
    MINUS? NONZERO DIGIT*               // apparently allowed in Python3 so this works.
    | '0'
    ;
fragment DECIMAL:'.' DIGIT+;
FLOAT:                         // Either have  """.""" or """. numbers for floats
    INT? DECIMAL 
    | INT '.'
    ;

STRING: '"'(.)*?'"';
// Defining whitespace and newlines
// Include carriage return and CR+LF for windows, unix, and OSX
WHITESPACE: (' '+ | TAB) ;

NEWLINE: '\r\n' | '\n' | '\r' ;

TAB: '\t'+;

// Defining colons, parenthesis, brackets
COLON: ':';
OPEN_PAR: '(';
CLOSE_PAR: ')';
OPEN_BRAC: '[';
CLOSE_BRAC: ']';

// if/else blocks 
IF: 'if';
ELIF: 'elif';
ELSE: 'else';

// while and for Loops  
WHILE: 'while';
FOR: 'for';
BREAK: 'break';
CONTINUE: 'continue';

// Variable definitions- Rules for Python variables: must start with a letter or underscore character. cannot start with a number fragment
// case sensitive, only alpha-numeric A-z, 0-9
VAR: [a-zA-Z_] [a-zA-Z_0-9]*;
// Arithmetic operators (+, -, *, /, %, ^)  

PLUS: '+';
MINUS: '-';
TIMES: '*';
DIV: '/';
MOD: '%';
POW: '**';

// Assignment operators (=, +=, -=, *=, /=, ^=, %=)  

ASSIGN: '=';
INCREMENT: '+=';
DECREMENT: '-=';
MULT_EQ: '*=';
DIV_EQ: '/=';
POW_EQ: '**=';
MOD_EQ: '%=';


// Conditional statements(<, <=, >, >=, ==, !=, and, or, not)  

LESS: '<';
LESS_EQ: '<=';
GREATER: '>';
GREATER_EQ: '>=';
EQUAL: '==';
NOT_EQUAL: '!=';
AND: 'and';
OR: 'or';
NOT: 'not';
TRUE: 'True';
FALSE: 'False';

// Support for comments 

COMMENT: '#' ~[\r\n]*;       // Anything after a # except a carriage return, new line, form feed 


// expression
//    : multiplyingExpression ((PLUS | MINUS) multiplyingExpression)*
//    ;

// multiplyingExpression
//    : number ((TIMES | DIV) number)*
//    ;
