parser grammar PseudoJavaParser;

options {
    tokenVocab = PseudoJavaScanner;
}

program                     : (statement)*                          #programAST             ;
statement                   : variable_declaration SEMICOLON
        | class_declaration SEMICOLON
        | assignment SEMICOLON
        | array_assignment SEMICOLON
        | print_statement SEMICOLON
        | if_statement
        | while_statement
        | return_statement SEMICOLON
        | function_declaration
        | block                                                                             ;
block                       : CUR_OPEN_BRACE (statement)* CUR_CLOSE_BRACE                   #blockAST;
function_declaration        : type IDENTIFIER
    OPEN_PARENTHESIS (formal_params)? CLOSED_PARENTHESIS block                              #functionDeclAST;
formal_params               : formal_param (COMMA formal_param)*                            #formalParamsAST;
formal_param                : type IDENTIFIER                                               #formalParamAST;
while_statement             : WHILE OPEN_PARENTHESIS expression CLOSED_PARENTHESIS block    #whileAST;
if_statement                : IF OPEN_PARENTHESIS expression CLOSED_PARENTHESIS block
                              (ELSE block)?                                                 #ifAST;
return_statement            : RETURN expression                                             #returnAST;
print_statement             : PRINT expression                                              #printAST;
class_declaration           : CLASS IDENTIFIER
                    CUR_OPEN_BRACE (variable_declaration SEMICOLON)* CUR_CLOSE_BRACE        #classDeclAST;
variable_declaration        : type IDENTIFIER (ASSIGN expression)?                          #variableDeclAST;
type                        : simple_type                                                   #smpTypeAST
                                | array_type                                                #arrTypeAST
                                | IDENTIFIER                                                #idTypeAST;
simple_type                 : BOOLEAN
                                | CHAR
	                            | INT
	                            | STRING                                                    #simpleTypeAST;
array_type                  : simple_type OPEN_BRACKET CLOSED_BRACKET                       #arrayTypeAST;
assignment                  : IDENTIFIER ASSIGN expression                                  #assignmentAST;
array_assignment            : IDENTIFIER
                            OPEN_BRACKET expression CLOSED_BRACKET ASSIGN expression        #arrayAssignmentAST;
expression                  : simple_expression (relational_op simple_expression)*          #expressionAST;
simple_expression           : term (additive_op term)*                                      #simpleExpAST;
term                        : factor (multiplicative_op factor)*                            #termAST;
factor                      : literal                                                       #literalFactAST
                                | IDENTIFIER                                                #factorIDFactAST
                                | function_call                                             #funcCallFactAST
                                | array_lookup                                              #arrLookUpFactAST
                                | array_length                                              #arrLengthFactAST
                                | sub_expression                                            #subExpFactAST
                                | array_allocation_expression                               #arrAllocFactAST
                                | allocation_expression                                     #allocFactAST
                                | unary                                                     #unaryFactAST;
unary                       : (SUM| MINUS | NEAGTE ) (expression)*                          #unaryAST;
allocation_expression       : NEW IDENTIFIER  OPEN_PARENTHESIS CLOSED_PARENTHESIS           #allocAST;
array_allocation_expression : NEW simple_type OPEN_BRACKET expression CLOSED_BRACKET        #arrayAllocAST;
sub_expression              : OPEN_PARENTHESIS expression CLOSED_PARENTHESIS                #subExpAST;
function_call               : IDENTIFIER
                            OPEN_PARENTHESIS (actual_params)? CLOSED_PARENTHESIS            #functionCallAST;
actual_params               : expression (COMMA expression)*                                #actualParamsAST;
array_lookup                : IDENTIFIER OPEN_BRACKET expression CLOSED_BRACKET             #arrayLookupAST;
array_length                : IDENTIFIER DOT LENGTH                                         #arrayLengthAST;
relational_op               : LESS_THAN | GREATER_THAN | EQUAL | DISTINCT
                                | LESS_OR_EQUAL_THAN | GREATER_OR_EQUAL_THAN                #relationalOpAST;
additive_op                 : SUM | MINUS | OR                                              #additiveOpAST;
multiplicative_op           : MULTIPLICATION | SLASH | AND                                  #multOpAST;
literal                     : INT_LITERAL
                                | REAL_LITERAL
                                | TRUE | FALSE
                                | STRING_LITERAL                                            #literalAST;
