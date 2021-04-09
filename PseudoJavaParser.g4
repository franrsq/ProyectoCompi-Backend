parser grammar PseudoJavaParser;

options {
    tokenVocab = PseudoJavaScanner;
}

program : (statement)*;
statement : variable_declaration SEMICOLON
        | class_declaration SEMICOLON
        | assignment SEMICOLON
        | array_assignment SEMICOLON
        | print_statement SEMICOLON
        | if_statement
        | while_statement
        | return_statement SEMICOLON
        | function_declaration
        | block;
block : CUR_OPEN_BRACE (statement)* CUR_CLOSE_BRACE;
function_declaration : type IDENTIFIER OPEN_PARENTHESIS (formal_params)? CLOSED_PARENTHESIS block;
formal_params : formal_param (COMMA formal_param)*;
formal_param : type IDENTIFIER;
while_statement : WHILE OPEN_PARENTHESIS expression CLOSED_PARENTHESIS block;
if_statement : IF OPEN_PARENTHESIS expression CLOSED_PARENTHESIS block (ELSE block)?;
return_statement : RETURN expression;
print_statement : PRINT expression;
class_declaration : CLASS IDENTIFIER CUR_OPEN_BRACE (variable_declaration SEMICOLON)* CUR_CLOSE_BRACE;
variable_declaration : type IDENTIFIER (ASSIGN expression)?;
type : simple_type
        | array_type
        | IDENTIFIER;
simple_type : BOOLEAN
        | CHAR
	    | INT
	    | STRING;
array_type : simple_type OPEN_BRACKET CLOSED_BRACKET;
assignment : IDENTIFIER ASSIGN expression;
array_assignment : IDENTIFIER OPEN_BRACKET expression CLOSED_BRACKET ASSIGN expression;
expression : simple_expression (relational_op simple_expression)*;
simple_expression : term (additive_op term)*;
term : factor (multiplicative_op factor)*;
factor : literal
        | IDENTIFIER
        | function_call
        | array_lookup
        | array_length
        | sub_expression
        | array_allocation_expression
        | allocation_expression
        | unary;
unary : (SUM| MINUS | NEAGTE ) (expression)*;
allocation_expression : NEW IDENTIFIER  OPEN_PARENTHESIS CLOSED_PARENTHESIS;
array_allocation_expression : NEW simple_type OPEN_BRACKET expression CLOSED_BRACKET;
sub_expression : OPEN_PARENTHESIS expression CLOSED_PARENTHESIS;
function_call : IDENTIFIER OPEN_PARENTHESIS (actual_params)? CLOSED_PARENTHESIS;
actual_params : expression (SEMICOLON expression)*;
array_lookup : IDENTIFIER OPEN_BRACKET expression CLOSED_BRACKET;
array_length : IDENTIFIER DOT LENGTH;
relational_op : LESS_THAN | GREATER_THAN | EQUAL | DISTINCT | LESS_OR_EQUAL_THAN | GREATER_OR_EQUAL_THAN;
additive_op : SUM | MINUS | OR;
multiplicative_op : MULTIPLICATION | SLASH | AND;
literal : INT_LITERAL
        | REAL_LITERAL
        | BOOL_LITERAL
        | STRING_LITERAL;
