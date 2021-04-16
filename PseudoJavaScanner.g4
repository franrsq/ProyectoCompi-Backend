lexer grammar PseudoJavaScanner;

// PALABRAS RESERVADAS DEL LENGUAJE
WHILE : 'while';
IF : 'if';
ELSE : 'else';
RETURN : 'return';
PRINT : 'print';
CLASS : 'class';
BOOLEAN : 'boolean';
CHAR : 'char';
INT : 'int';
STRING : 'string';
LENGTH : 'length';
TRUE : 'true';
FALSE : 'false';
OR : '||';
AND : '&&';

// SIMBOLOS
CUR_OPEN_BRACE : '{';
CUR_CLOSE_BRACE : '}';
OPEN_PARENTHESIS : '(';
CLOSED_PARENTHESIS : ')';
SEMICOLON : ';';
COMMA : ',';
ASSIGN : '=';
DOT : '.';
SUM : '+';
MINUS : '-';
NEAGTE : '!';
NEW : 'new';
OPEN_BRACKET : '[';
CLOSED_BRACKET : ']';
LESS_THAN : '<';
GREATER_THAN : '>';
EQUAL : '==';
DISTINCT : '!=';
LESS_OR_EQUAL_THAN : '<=';
GREATER_OR_EQUAL_THAN : '>=';
UNDERSCORE : '_';
SLASH : '/';
MULTIPLICATION : '*';
QUOTATION_MARKS : '"';

// COMPLEJAS
WHITESPACES : [ \r\t\n]+ -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
IDENTIFIER : ( UNDERSCORE | LETTER ) (UNDERSCORE | LETTER | DIGIT)*;
INT_LITERAL : DIGIT(DIGIT)*;
REAL_LITERAL : DIGIT(DIGIT)* DOT (DIGIT)*
                    | DOT DIGIT (DIGIT)*;
STRING_LITERAL : QUOTATION_MARKS (PRINTABLE)* QUOTATION_MARKS;

fragment PRINTABLE : DIGIT|LETTER|' '| '!' | '"' | '#' | '$' | '%' | '&'
                    | '\'' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | ':' | ';'
                    | '<' | '=' | '>' | '?' | '@' | '[' | '\\' | ']' | '^' | '_' | '`'
                    | '{' | '|' | '}' | '~';

fragment LETTER : [a-zA-Z];
fragment DIGIT : [0-9];
