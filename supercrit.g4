// Grammar developed for PoPL: CS 4450 Final Project
// team: supercritical pitchfork ;   members: Pete Canfield, Cloe Jones, Matt Stroud
// 12/15/21

// Grammar for Antlr4 on Python3 target

grammar supercrit;


////////////////////////////////////////////////////////
//////////////////// Parser Rules //////////////////////
////////////////////////////////////////////////////////

// Defines the relations between the tokens 
// Base of the entire parser is the file which is composed of a block and then the end-of-file
//file: block EOF ;

// A block will be the most general Python3 code which will be any number of statements strung together
//block: statement*;

// A statement will be composed of the project requirements: if, while, for, assignment, arithmetic, conditionals, variables, etc.
//statement
    //: assignment
    //| if_block
    //| while_block
    //| for_block
    //;
// if/else blocks
// I want to define a tab block that will be used for if,while, and for loops. It is a tab followed by a statement any number of times.

//tab_block
    //: (TAB statement)*;

//if_block
    //: IF condition COLON NEWLINE tab_block (ELIF condition COLON NEWLINE tab_block)* (ELSE COLON NEWLINE tab_block)?
    //;

// Variable definitions


// while and for Loops  
//while_block
    //: WHILE condition COLON NEWLINE tab_block
    //;

//for_block
    //: FOR condition COLON NEWLINE tab_block
    //;
// Arithmetic operators (+, -, *, /, %, ^)  

/*start : expr | <EOF> ;
expr : '-' expr     # UMINUS
   | expr mulop expr # MULOPGRP
   | expr addop expr # ADDOPGRP
   | '(' expr ')'   # PARENGRP
   | NUMBER      # DOUBLE
   ;

addop : '+' | '-' ;

mulop : '*' | '/' | '%' | '^';*/

// Assignment operators (=, +=, -=, *=, /=, ^=, %=)  

// Conditional statements(<, <=, >, >=, ==, !=, and, or, not)  



// Support for comments 

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
fragment INT:                           // option for negative numbers, must start with nonzero number and continue with any digit or just be 0. This allows for negative 0 which is...
    MINUS? NONZERO DIGIT*               // apparently allowed in Python3 so this works.
    | '0'
    ;
fragment DECIMAL:'.' DIGIT+;
fragment FLOAT:                         // Either have  """.""" or """. numbers for floats
    INT? DECIMAL 
    | INT '.'
    ;
fragment NUMBER: INT | FLOAT;

// Defining whitespace and newlines
WHITESPACE: (' ' | NEWLINE | INDENT) ;
fragment NEWLINE: ('\r'? '\n' | '\r')+ ;
fragment INDENT: '\t';

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
TAB: [\t];
// Variable definitions- Rules for Python variables: must start with a letter or underscore character. cannot start with a number fragment
// case sensitive, only alpha-numeric A-z, 0-9
VAR: [a-zA-Z_] [a-zA-Z_0-9]*;

// while and for Loops  
WHILE: 'while';
FOR: 'for';

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

// Support for comments 

COMMENT: '#' ~[\r\n\f]*;       // Anything after a # except a carriage return, new line, form feed 


// expression
//    : multiplyingExpression ((PLUS | MINUS) multiplyingExpression)*
//    ;

// multiplyingExpression
//    : number ((TIMES | DIV) number)*
//    ;
