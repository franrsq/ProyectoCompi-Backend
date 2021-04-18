package com.compi.pseudojava.context;

import com.compi.generated.PseudoJavaParser;
import com.compi.generated.PseudoJavaParserBaseVisitor;
import com.compi.pseudojava.context.attributes.ClassAttr;
import com.compi.pseudojava.context.attributes.FunctionAttr;
import com.compi.pseudojava.context.attributes.VariableAttr;

public class ContextAnalyzer extends PseudoJavaParserBaseVisitor<Object> {
    private static final String ERROR_ALREADY_DEFINED
            = "%s is already defined in the current scope";
    private static final String ERROR_NOT_FOUND
            = "can't find %s in the current scope";
    private static final String ERROR_PARAMETERS_MATCH
            = "function %s requires %s parameters";

    private IdentificationTable<VariableAttr> variables = new IdentificationTable<>();
    private IdentificationTable<FunctionAttr> functions = new IdentificationTable<>();
    private IdentificationTable<ClassAttr> classes = new IdentificationTable<>();

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

    @Override
    public Object visitReturnAST(PseudoJavaParser.ReturnASTContext ctx) {
        return super.visitReturnAST(ctx);
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
                String type = ctx.type().getText().substring(0, ctx.type().getText().length() - 3);
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

        return super.visitVariableDeclAST(ctx);
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
        if (variables.retrieveCheckAllScopes(identifier) == null) {
            showError(String.format(ERROR_NOT_FOUND, "variable " + identifier),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
        }

        return super.visitAssignmentAST(ctx);
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
        return super.visitExpressionAST(ctx);
    }

    @Override
    public Object visitSimpleExpAST(PseudoJavaParser.SimpleExpASTContext ctx) {
        return super.visitSimpleExpAST(ctx);
    }

    @Override
    public Object visitTermAST(PseudoJavaParser.TermASTContext ctx) {
        return super.visitTermAST(ctx);
    }

    @Override
    public Object visitLiteralFactAST(PseudoJavaParser.LiteralFactASTContext ctx) {
        return super.visitLiteralFactAST(ctx);
    }

    @Override
    public Object visitFactorIDFactAST(PseudoJavaParser.FactorIDFactASTContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        if (variables.retrieveCheckAllScopes(identifier) == null) {
            showError(String.format(ERROR_NOT_FOUND, "variable " + identifier),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
        }

        return super.visitFactorIDFactAST(ctx);
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
        }

        return super.visitAllocAST(ctx);
    }

    @Override
    public Object visitArrayAllocAST(PseudoJavaParser.ArrayAllocASTContext ctx) {
        return super.visitArrayAllocAST(ctx);
    }

    @Override
    public Object visitSubExpAST(PseudoJavaParser.SubExpASTContext ctx) {
        return super.visitSubExpAST(ctx);
    }

    @Override
    public Object visitFunctionCallAST(PseudoJavaParser.FunctionCallASTContext ctx) {
        FunctionAttr functionAttr = functions.retrieve(ctx.IDENTIFIER().getText());
        if (functionAttr == null) {
            showError(String.format(ERROR_NOT_FOUND, "function " + ctx.IDENTIFIER().getText()),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
        } else {
            PseudoJavaParser.ActualParamsASTContext actualParams =
                    (PseudoJavaParser.ActualParamsASTContext) ctx.actual_params();
            int actualParamsSize = actualParams == null ? 0 : actualParams.expression().size();
            if (functionAttr.parametersSize() != actualParamsSize) {
                showError(String.format(ERROR_PARAMETERS_MATCH, ctx.IDENTIFIER().getText(),
                        functionAttr.parametersSize()),
                        ctx.start.getLine(),
                        ctx.start.getCharPositionInLine());
            }
        }
        return super.visitFunctionCallAST(ctx);
    }

    @Override
    public Object visitActualParamsAST(PseudoJavaParser.ActualParamsASTContext ctx) {
        return super.visitActualParamsAST(ctx);
    }

    @Override
    public Object visitArrayLookupAST(PseudoJavaParser.ArrayLookupASTContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        if (variables.retrieveCheckAllScopes(identifier) == null) {
            showError(String.format(ERROR_NOT_FOUND, "variable " + identifier),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
        }

        return super.visitArrayLookupAST(ctx);
    }

    @Override
    public Object visitArrayLengthAST(PseudoJavaParser.ArrayLengthASTContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        if (variables.retrieveCheckAllScopes(identifier) == null) {
            showError(String.format(ERROR_NOT_FOUND, "variable " + identifier),
                    ctx.start.getLine(),
                    ctx.start.getCharPositionInLine());
        }

        return super.visitArrayLengthAST(ctx);
    }

    @Override
    public Object visitRelational_op(PseudoJavaParser.Relational_opContext ctx) {
        return super.visitRelational_op(ctx);
    }

    @Override
    public Object visitAdditive_op(PseudoJavaParser.Additive_opContext ctx) {
        return super.visitAdditive_op(ctx);
    }

    @Override
    public Object visitMultiplicative_op(PseudoJavaParser.Multiplicative_opContext ctx) {
        return super.visitMultiplicative_op(ctx);
    }

    @Override
    public Object visitLiteral(PseudoJavaParser.LiteralContext ctx) {
        return super.visitLiteral(ctx);
    }

    private void showError(String error, int line, int col) {
        System.out.println(String.format("line %s:%s %s", line, col, error));
    }
}
