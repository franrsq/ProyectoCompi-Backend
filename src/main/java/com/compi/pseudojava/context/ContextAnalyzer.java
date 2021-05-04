package com.compi.pseudojava.context;

import com.compi.generated.PseudoJavaParser;
import com.compi.generated.PseudoJavaParserBaseVisitor;
import com.compi.pseudojava.context.attributes.ClassAttr;
import com.compi.pseudojava.context.attributes.FunctionAttr;
import com.compi.pseudojava.context.attributes.VariableAttr;
import com.compi.pseudojava.context.exceptions.ContextException;
import org.antlr.v4.runtime.RuleContext;

public class ContextAnalyzer extends PseudoJavaParserBaseVisitor<Object> {
    private static final String ERROR_ALREADY_DEFINED
            = "%s is already defined in the current scope";
    private static final String ERROR_NOT_FOUND
            = "can't find %s in the current scope";
    private static final String ERROR_PARAMETERS_SIZE_MATCH
            = "function %s requires %s parameters";
    private static final String ERROR_NOT_INSTANCE
            = "%s it's not an instance of a class";
    private static final String ERROR_NOT_MEMBER_CLASS
            = "%s it's not a member of class %s";
    private static final String ERROR_OPERATOR_TYPE
            = "Operator %s is not compatible with %s and %s";
    private static final String ERROR_EXPECTING_EXPRESSION
            = "Expecting expression of type %s but found %s expression";
    private static final String ERROR_RETURN_NOT_FUNCTION
            = "return statement must be in a function";
    private static final String ERROR_FUNCTION_PARAMS
            = "Expecting call to %s but received %s";

    private IdentificationTable<VariableAttr> variables;
    private IdentificationTable<FunctionAttr> functions;
    private IdentificationTable<ClassAttr> classes;

    public ContextAnalyzer() {
        variables = new IdentificationTable<>();
        functions = new IdentificationTable<>();
        classes = new IdentificationTable<>();

        FunctionAttr chr = new FunctionAttr(new VariableAttr("char", false));
        chr.enter("i", new VariableAttr("int", false));
        FunctionAttr ord = new FunctionAttr(new VariableAttr("int", false));
        chr.enter("ch", new VariableAttr("char", false));

        // TODO: preguntar
        FunctionAttr len = new FunctionAttr(new VariableAttr("int", false));
        chr.enter("a", new VariableAttr("string", false));

        functions.enter("chr", chr);
        functions.enter("ord", ord);
        functions.enter("len", len);
    }

    @Override
    public Object visitProgramAST(PseudoJavaParser.ProgramASTContext ctx) {
        return super.visitProgramAST(ctx);
    }

    @Override
    public Object visitStatement(PseudoJavaParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Object visitBlockAST(PseudoJavaParser.BlockASTContext ctx) {
        variables.openScope();
        classes.openScope();
        Object object = super.visitBlockAST(ctx);
        variables.closeScope();
        classes.closeScope();
        return object;
    }

    @Override
    public Object visitFunctionDeclAST(PseudoJavaParser.FunctionDeclASTContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        if (functions.retrieve(identifier) != null) {
            showError(String.format(ERROR_ALREADY_DEFINED, "function " + identifier),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
        } else {
            if (ctx.type() instanceof PseudoJavaParser.SmpTypeASTContext) {
                functions.enter(identifier,
                        new FunctionAttr(new VariableAttr(ctx.type().getText(), false)));
            } else if (ctx.type() instanceof PseudoJavaParser.ArrTypeASTContext) {
                functions.enter(identifier,
                        new FunctionAttr(new VariableAttr(ctx.type().getText(), true)));
            } else {
                if (classes.retrieveCheckAllScopes(ctx.type().getText()) != null) {
                    functions.enter(identifier,
                            new FunctionAttr(new VariableAttr(ctx.type().getText(), false)));
                } else {
                    showError(String.format(ERROR_NOT_FOUND, "class " + ctx.type().getText()),
                            ctx.start.getLine(),
                            ctx.start.getCharPositionInLine());
                }
            }
        }
        return super.visitFunctionDeclAST(ctx);
    }

    @Override
    public Object visitFormalParamsAST(PseudoJavaParser.FormalParamsASTContext ctx) {
        return super.visitFormalParamsAST(ctx);
    }

    @Override
    public Object visitFormalParamAST(PseudoJavaParser.FormalParamASTContext ctx) {
        if (ctx.parent.parent instanceof PseudoJavaParser.FunctionDeclASTContext) {
            String parentFunction =
                    ((PseudoJavaParser.FunctionDeclASTContext) ctx.parent.parent).IDENTIFIER().getText();
            if (functions.retrieve(parentFunction).retrieve(ctx.IDENTIFIER().getText()) != null) {
                showError(String.format(ERROR_ALREADY_DEFINED, "param " + ctx.IDENTIFIER().getText()),
                        ctx.start.getLine(),
                        ctx.start.getCharPositionInLine());
            } else {
                if (ctx.type() instanceof PseudoJavaParser.SmpTypeASTContext) {
                    functions.retrieve(parentFunction).enter(ctx.IDENTIFIER().getText(),
                            new VariableAttr(ctx.type().getText(), false));
                } else if (ctx.type() instanceof PseudoJavaParser.ArrTypeASTContext) {
                    functions.retrieve(parentFunction).enter(ctx.IDENTIFIER().getText(),
                            new VariableAttr(ctx.type().getText(), true));
                } else {
                    if (classes.retrieveCheckAllScopes(ctx.type().getText()) != null) {
                        functions.retrieve(parentFunction).enter(ctx.IDENTIFIER().getText(),
                                new VariableAttr(ctx.type().getText(), false));
                    } else {
                        showError(String.format(ERROR_NOT_FOUND, "class " + ctx.type().getText()),
                                ctx.start.getLine(),
                                ctx.start.getCharPositionInLine());
                    }
                }
            }
        }
        return super.visitFormalParamAST(ctx);
    }

    @Override
    public Object visitWhileAST(PseudoJavaParser.WhileASTContext ctx) {
        return super.visitWhileAST(ctx);
    }

    @Override
    public Object visitIfAST(PseudoJavaParser.IfASTContext ctx) {
        return super.visitIfAST(ctx);
    }

    // TODO: validate function always must return
    @Override
    public Object visitReturnAST(PseudoJavaParser.ReturnASTContext ctx) {
        RuleContext functionParent = ctx;
        do {
            functionParent = functionParent.parent;
        } while (functionParent != null
                && !(functionParent instanceof PseudoJavaParser.FunctionDeclASTContext));
        if (functionParent == null) {
            showError(ERROR_RETURN_NOT_FUNCTION,
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
            return null;
        }

        try {
            VariableAttr expresionAttr = (VariableAttr) visit(ctx.expression());
            String funcId = ((PseudoJavaParser.FunctionDeclASTContext) functionParent).IDENTIFIER().getText();
            VariableAttr funcAttr = functions.retrieve(funcId).getReturnType();
            if (!funcAttr.equals(expresionAttr)) {
                showError(String.format(ERROR_EXPECTING_EXPRESSION, funcAttr, expresionAttr),
                        ctx.start.getLine(),
                        ctx.start.getCharPositionInLine());
            }
        } catch (ContextException ignored) {
        }

        return null;
    }

    @Override
    public Object visitPrintAST(PseudoJavaParser.PrintASTContext ctx) {
        return super.visitPrintAST(ctx);
    }

    @Override
    public Object visitClassDeclAST(PseudoJavaParser.ClassDeclASTContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        if (classes.retrieve(identifier) != null) {
            showError(String.format(ERROR_ALREADY_DEFINED, "class " + identifier),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
        } else {
            classes.enter(identifier, new ClassAttr());
        }

        variables.openScope();
        classes.openScope();
        Object object = super.visitClassDeclAST(ctx);
        variables.closeScope();
        classes.closeScope();

        return object;
    }

    @Override
    public Object visitVariableDeclAST(PseudoJavaParser.VariableDeclASTContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        ClassAttr parentClass = null;

        if (ctx.parent instanceof PseudoJavaParser.ClassDeclASTContext) {
            parentClass = classes.retrieveCheckAllScopes(
                    ((PseudoJavaParser.ClassDeclASTContext) ctx.parent).IDENTIFIER().getText());
        }

        if (variables.retrieve(identifier) != null ||
                (parentClass != null && parentClass.retrieve(identifier) != null)) {
            showError(String.format(ERROR_ALREADY_DEFINED, "variable " + identifier),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
        } else {
            if (ctx.type() instanceof PseudoJavaParser.SmpTypeASTContext) {
                if (parentClass != null) {
                    parentClass.enter(identifier, new VariableAttr(ctx.type().getText(), false));
                } else {
                    variables.enter(identifier, new VariableAttr(ctx.type().getText(), false));
                }
            } else if (ctx.type() instanceof PseudoJavaParser.ArrTypeASTContext) {
                String type = ctx.type().getText().substring(0, ctx.type().getText().indexOf('[')).trim();
                if (parentClass != null) {
                    parentClass.enter(identifier,
                            new VariableAttr(type, true));
                } else {
                    variables.enter(identifier,
                            new VariableAttr(type, true));
                }
            } else {
                if (classes.retrieveCheckAllScopes(ctx.type().getText()) != null) {
                    variables.enter(identifier, new VariableAttr(ctx.type().getText(), false));
                } else {
                    showError(String.format(ERROR_NOT_FOUND, "class " + ctx.type().getText()),
                            ctx.start.getLine(),
                            ctx.start.getCharPositionInLine());
                }
            }
        }

        visit(ctx.type());
        VariableAttr variableAttr = variables.retrieveCheckAllScopes(identifier);
        if (ctx.expression() != null) {
            try {
                VariableAttr expresionAttr = (VariableAttr) visit(ctx.expression());
                if (!expresionAttr.equals(variableAttr)) {
                    showError(String.format(ERROR_EXPECTING_EXPRESSION, variableAttr, expresionAttr),
                            ctx.start.getLine(),
                            ctx.start.getCharPositionInLine());
                }
            } catch (ContextException ignored) {
            }
        }
        return null;
    }

    @Override
    public Object visitSmpTypeAST(PseudoJavaParser.SmpTypeASTContext ctx) {
        return super.visitSmpTypeAST(ctx);
    }

    @Override
    public Object visitArrTypeAST(PseudoJavaParser.ArrTypeASTContext ctx) {
        return super.visitArrTypeAST(ctx);
    }

    @Override
    public Object visitIdTypeAST(PseudoJavaParser.IdTypeASTContext ctx) {
        return super.visitIdTypeAST(ctx);
    }

    @Override
    public Object visitSimple_type(PseudoJavaParser.Simple_typeContext ctx) {
        return super.visitSimple_type(ctx);
    }

    @Override
    public Object visitArrayTypeAST(PseudoJavaParser.ArrayTypeASTContext ctx) {
        return super.visitArrayTypeAST(ctx);
    }

    @Override
    public Object visitAssignmentAST(PseudoJavaParser.AssignmentASTContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        VariableAttr variableAttr = variables.retrieveCheckAllScopes(identifier);

        if (variableAttr == null) {
            showError(String.format(ERROR_NOT_FOUND, "variable " + identifier),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
        }

        try {
            VariableAttr expresionAttr = (VariableAttr) visit(ctx.expression());
            if (!expresionAttr.equals(variableAttr)) {
                showError(String.format(ERROR_EXPECTING_EXPRESSION, variableAttr, expresionAttr),
                        ctx.start.getLine(),
                        ctx.start.getCharPositionInLine());
            }
        } catch (ContextException ignored) {
        }

        return null;
    }

    @Override
    public Object visitArrayAssignmentAST(PseudoJavaParser.ArrayAssignmentASTContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        if (variables.retrieveCheckAllScopes(identifier) == null) {
            showError(String.format(ERROR_NOT_FOUND, "variable " + identifier),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
        }

        return super.visitArrayAssignmentAST(ctx);
    }

    @Override
    public Object visitExpressionAST(PseudoJavaParser.ExpressionASTContext ctx) {
        VariableAttr smpExpAttr = (VariableAttr) visit(ctx.simple_expression(0));
        VariableAttr smpExpAttr2;
        VariableAttr returnType = smpExpAttr;
        for (int i = 1; i < ctx.simple_expression().size(); i++) {
            String op = (String) visit(ctx.relational_op(i - 1));
            smpExpAttr2 = (VariableAttr) visit(ctx.simple_expression(i));
            returnType = checkOperators(smpExpAttr, smpExpAttr2, op, ctx.start.getLine(),
                    ctx.relational_op(i - 1).start.getCharPositionInLine() + 1);
        }
        return returnType;
    }

    @Override
    public Object visitSimpleExpAST(PseudoJavaParser.SimpleExpASTContext ctx) {
        VariableAttr termAttr = (VariableAttr) visit(ctx.term(0));
        VariableAttr termAttr2;
        VariableAttr returnType = termAttr;
        for (int i = 1; i < ctx.term().size(); i++) {
            String op = (String) visit(ctx.additive_op(i - 1));
            termAttr2 = (VariableAttr) visit(ctx.term(i));
            returnType = checkOperators(termAttr, termAttr2, op, ctx.start.getLine(),
                    ctx.additive_op(i - 1).start.getCharPositionInLine() + 1);
        }
        return returnType;
    }

    @Override
    public Object visitTermAST(PseudoJavaParser.TermASTContext ctx) {
        VariableAttr factorAttr = (VariableAttr) visit(ctx.factor(0));
        VariableAttr factorAttr2;
        VariableAttr returnType = factorAttr;
        for (int i = 1; i < ctx.factor().size(); i++) {
            String op = (String) visit(ctx.multiplicative_op(i - 1));
            factorAttr2 = (VariableAttr) visit(ctx.factor(i));
            returnType = checkOperators(factorAttr, factorAttr2, op, ctx.start.getLine(),
                    ctx.multiplicative_op(i - 1).start.getCharPositionInLine() + 1);
        }
        return returnType;
    }

    @Override
    public Object visitLiteralFactAST(PseudoJavaParser.LiteralFactASTContext ctx) {
        return super.visitLiteralFactAST(ctx);
    }

    @Override
    public Object visitIdFactAST(PseudoJavaParser.IdFactASTContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        VariableAttr variable = variables.retrieveCheckAllScopes(identifier);
        if (variable == null) {
            showError(String.format(ERROR_NOT_FOUND, "variable " + identifier),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
            throw new ContextException("Variable not found");
        }
        return variable;
    }

    @Override
    public Object visitObjectFactAST(PseudoJavaParser.ObjectFactASTContext ctx) {
        String instanceId = ctx.IDENTIFIER(0).getText();
        VariableAttr instance = variables.retrieveCheckAllScopes(instanceId);

        // Doesn't exists
        if (instance == null) {
            showError(String.format(ERROR_NOT_FOUND, "variable " + instanceId),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
            throw new ContextException("Variable not found");
        }
        // It's not an instance of a class
        ClassAttr classAttr = classes.retrieveCheckAllScopes(instance.getType());
        if (classAttr == null) {
            showError(String.format(ERROR_NOT_INSTANCE, "Variable " + instanceId),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
            throw new ContextException("Variable is not an instance");
        }
        // Class doesn't contain the member
        String memberId = ctx.IDENTIFIER(1).getText();
        VariableAttr member = classAttr.retrieve(memberId);
        if (member == null) {
            showError(String.format(ERROR_NOT_MEMBER_CLASS, "Variable " + instanceId, instance.getType()),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
            throw new ContextException("Variable not found in class");
        }

        return member;
    }

    @Override
    public Object visitFuncCallFactAST(PseudoJavaParser.FuncCallFactASTContext ctx) {
        return super.visitFuncCallFactAST(ctx);
    }

    @Override
    public Object visitArrLookUpFactAST(PseudoJavaParser.ArrLookUpFactASTContext ctx) {
        return super.visitArrLookUpFactAST(ctx);
    }

    @Override
    public Object visitArrLengthFactAST(PseudoJavaParser.ArrLengthFactASTContext ctx) {
        return super.visitArrLengthFactAST(ctx);
    }

    @Override
    public Object visitSubExpFactAST(PseudoJavaParser.SubExpFactASTContext ctx) {
        return super.visitSubExpFactAST(ctx);
    }

    @Override
    public Object visitArrAllocFactAST(PseudoJavaParser.ArrAllocFactASTContext ctx) {
        return super.visitArrAllocFactAST(ctx);
    }

    @Override
    public Object visitAllocFactAST(PseudoJavaParser.AllocFactASTContext ctx) {
        return super.visitAllocFactAST(ctx);
    }

    // TODO: preguntar que es
    @Override
    public Object visitUnaryFactAST(PseudoJavaParser.UnaryFactASTContext ctx) {
        return super.visitUnaryFactAST(ctx);
    }

    @Override
    public Object visitUnaryAST(PseudoJavaParser.UnaryASTContext ctx) {
        return super.visitUnaryAST(ctx);
    }

    @Override
    public Object visitAllocAST(PseudoJavaParser.AllocASTContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        if (classes.retrieveCheckAllScopes(identifier) == null) {
            showError(String.format(ERROR_NOT_FOUND, "class " + identifier),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
            throw new ContextException("Class not found");
        }

        return new VariableAttr(identifier, false);
    }

    @Override
    public Object visitArrayAllocAST(PseudoJavaParser.ArrayAllocASTContext ctx) {
        return new VariableAttr(ctx.simple_type().getText(), true);
    }

    @Override
    public Object visitSubExpAST(PseudoJavaParser.SubExpASTContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Object visitFunctionCallAST(PseudoJavaParser.FunctionCallASTContext ctx) {
        FunctionAttr functionAttr = functions.retrieve(ctx.IDENTIFIER().getText());
        if (functionAttr == null) {
            showError(String.format(ERROR_NOT_FOUND, "function " + ctx.IDENTIFIER().getText()),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
            throw new ContextException("Function not found");
        }
        // Check parameters size
        PseudoJavaParser.ActualParamsASTContext actualParams =
                (PseudoJavaParser.ActualParamsASTContext) ctx.actual_params();
        int actualParamsSize = actualParams == null ? 0 : actualParams.expression().size();
        if (functionAttr.parametersSize() != actualParamsSize) {
            showError(String.format(ERROR_PARAMETERS_SIZE_MATCH, ctx.IDENTIFIER().getText(),
                    functionAttr.parametersSize()),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
            throw new ContextException("Function parameters size don't match");
        }

        if (actualParams != null) {
            visit(actualParams);
        }

        return functionAttr.getReturnType();
    }

    @Override
    public Object visitActualParamsAST(PseudoJavaParser.ActualParamsASTContext ctx) {
        return super.visitActualParamsAST(ctx);
    }

    @Override
    public Object visitArrayLookupAST(PseudoJavaParser.ArrayLookupASTContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        VariableAttr variable = variables.retrieveCheckAllScopes(identifier);
        if (variable == null) {
            showError(String.format(ERROR_NOT_FOUND, "variable " + identifier),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
            throw new ContextException("Variable not found");
        }

        try {
            VariableAttr expresionnAttr = (VariableAttr) visit(ctx.expression());
            if (!expresionnAttr.getType().equals("int") || expresionnAttr.isArray()) {
                showError(String.format(ERROR_EXPECTING_EXPRESSION, "int", expresionnAttr),
                        ctx.start.getLine(),
                        ctx.start.getCharPositionInLine());
            }
        } catch (ContextException ignored) {
        }

        return variable;
    }

    @Override
    public Object visitArrayLengthAST(PseudoJavaParser.ArrayLengthASTContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        if (variables.retrieveCheckAllScopes(identifier) == null) {
            showError(String.format(ERROR_NOT_FOUND, "variable " + identifier),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
            throw new ContextException("Variable not found");
        }

        return new VariableAttr("int", false);
    }

    @Override
    public Object visitRelational_op(PseudoJavaParser.Relational_opContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitAdditive_op(PseudoJavaParser.Additive_opContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitMultiplicative_op(PseudoJavaParser.Multiplicative_opContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitIntLiteralAST(PseudoJavaParser.IntLiteralASTContext ctx) {
        return new VariableAttr("int", false);
    }

    @Override
    public Object visitRealLiteralAST(PseudoJavaParser.RealLiteralASTContext ctx) {
        return new VariableAttr("real", false);
    }

    @Override
    public Object visitBoolLiteralAST(PseudoJavaParser.BoolLiteralASTContext ctx) {
        return new VariableAttr("boolean", false);
    }

    @Override
    public Object visitStrLiteralAST(PseudoJavaParser.StrLiteralASTContext ctx) {
        return new VariableAttr("string", false);
    }

    @Override
    public Object visitCharLiteralAST(PseudoJavaParser.CharLiteralASTContext ctx) {
        return new VariableAttr("char", false);
    }

    private void showError(String error, int line, int col) {
        System.out.println(String.format("line %s:%s %s", line, col, error));
    }

    private VariableAttr checkOperators(VariableAttr variableAttr1, VariableAttr variableAttr2,
                                        String operator, int line, int col) {
        // String concatenation
        if (operator.equals("+")
                && (variableAttr1.getType().equals("string") && !variableAttr1.isArray())
                && variableAttr1.equals(variableAttr2)) {
            return variableAttr1;
        }
        // Basic operations (int) (int)
        if ((operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))
                && (variableAttr1.getType().equals("int") && !variableAttr1.isArray())
                && variableAttr1.equals(variableAttr2)) {
            return variableAttr1;
        }
        // Relational (int) (boolean)
        if ((operator.equals("<") || operator.equals(">") || operator.equals("<=") || operator.equals(">="))
                && (variableAttr1.getType().equals("int") && !variableAttr1.isArray())
                && variableAttr1.equals(variableAttr2)) {
            return new VariableAttr("boolean", false);
        }
        // AND, OR (int and boolean) (boolean)
        if ((operator.equals("&&") || operator.equals("||"))
                && ((variableAttr1.getType().equals("int")
                || variableAttr1.getType().equals("boolean")) && !variableAttr1.isArray())
                && variableAttr1.equals(variableAttr2)) {
            return new VariableAttr("boolean", false);
        }
        // Equality (all types) (boolean)
        if ((operator.equals("==") || operator.equals("!=")) && variableAttr1.equals(variableAttr2)) {
            return new VariableAttr("boolean", false);
        }
        showError(String.format(ERROR_OPERATOR_TYPE, operator, variableAttr1.getType(),
                variableAttr2.getType()),
                line,
                col);
        throw new ContextException("Parameters are not compatible with operator");
    }
}
