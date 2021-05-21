package com.compi.pseudojava.languaje.interpreter;

import com.compi.generated.PseudoJavaParser;
import com.compi.generated.PseudoJavaParserBaseVisitor;
import com.compi.pseudojava.languaje.IdentificationTable;
import com.compi.pseudojava.languaje.interpreter.attributes.FunctionAttr;
import com.compi.pseudojava.languaje.interpreter.instances.Instance;
import com.compi.pseudojava.languaje.interpreter.instances.PrimitiveInstance;

public class Interpreter extends PseudoJavaParserBaseVisitor<Object> {
    private IdentificationTable<FunctionAttr> functionsTable = new IdentificationTable<>();
    private IdentificationTable<Instance> storage = new IdentificationTable<>();

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
        functionsTable.openScope();
        storage.openScope();
        Object object = super.visitBlockAST(ctx);
        storage.openScope();
        functionsTable.closeScope();
        return object;
    }

    @Override
    public Object visitFunctionDeclAST(PseudoJavaParser.FunctionDeclASTContext ctx) {
        functionsTable.enter(ctx.IDENTIFIER().getText(), new FunctionAttr(ctx));
        if (ctx.formal_params() != null) {
            return visit(ctx.formal_params());
        }
        return null;
    }

    @Override
    public Object visitFormalParamsAST(PseudoJavaParser.FormalParamsASTContext ctx) {
        return super.visitFormalParamsAST(ctx);
    }

    @Override
    public Object visitFormalParamAST(PseudoJavaParser.FormalParamASTContext ctx) {
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
        output(visit(ctx.expression()).toString());
        return null;
    }

    @Override
    public Object visitClassDeclAST(PseudoJavaParser.ClassDeclASTContext ctx) {
        return super.visitClassDeclAST(ctx);
    }

    @Override
    public Object visitVariableDeclAST(PseudoJavaParser.VariableDeclASTContext ctx) {
        Instance value = null;
        if (ctx.expression() != null) {
            value = assignVariable(ctx.type(), ctx.expression());
        } else {
            value = createDefaultInstance(ctx.type().getText());
        }

        storage.enter(ctx.IDENTIFIER().getText(), value);
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
        return super.visitAssignmentAST(ctx);
    }

    @Override
    public Object visitArrayAssignmentAST(PseudoJavaParser.ArrayAssignmentASTContext ctx) {
        return super.visitArrayAssignmentAST(ctx);
    }

    @Override
    public Object visitExpressionAST(PseudoJavaParser.ExpressionASTContext ctx) {
        Object ob1 = visit(ctx.simple_expression(0));
        for (int i = 1; i < ctx.simple_expression().size(); i++) {
            Object ob2 = visit(ctx.simple_expression(i));
            ob1 = relationalOp(ob1, ob2, ctx.relational_op(i - 1).getText());
        }
        return ob1;
    }

    private Object relationalOp(Object ob1, Object ob2, String op) {
        switch (op) {
            case "<":
                if (ob1 instanceof Float) {
                    return (Float) ob1 < (Float) ob2;
                }
                return (Integer) ob1 < (Integer) ob2;
            case ">":
                if (ob1 instanceof Float) {
                    return (Float) ob1 > (Float) ob2;
                }
                return (Integer) ob1 > (Integer) ob2;
            case "<=":
                if (ob1 instanceof Float) {
                    return (Float) ob1 <= (Float) ob2;
                }
                return (Integer) ob1 <= (Integer) ob2;
            case ">=":
                if (ob1 instanceof Float) {
                    return (Float) ob1 >= (Float) ob2;
                }
                return (Integer) ob1 >= (Integer) ob2;
            case "==":
                return ob1.equals(ob2);
            case "!=":
                return !ob1.equals(ob2);
        }

        throw new RuntimeException("Cannot apply " + op + " between "
                + ob1.getClass().getSimpleName() + " and " + ob2.getClass().getSimpleName());
    }

    @Override
    public Object visitSimpleExpAST(PseudoJavaParser.SimpleExpASTContext ctx) {
        Object ob1 = visit(ctx.term(0));
        for (int i = 1; i < ctx.term().size(); i++) {
            Object ob2 = visit(ctx.term(i));
            ob1 = additiveOp(ob1, ob2, ctx.additive_op(i - 1).getText());
        }
        return ob1;
    }

    private Object additiveOp(Object ob1, Object ob2, String op) {
        switch (op) {
            case "+":
                if (ob1 instanceof Float) {
                    return (Float) ob1 + (Float) ob2;
                }
                if (ob1 instanceof String) {
                    return ob1 + (String) ob2;
                }
                return (Integer) ob1 + (Integer) ob2;
            case "-":
                if (ob1 instanceof Float) {
                    return (Float) ob1 - (Float) ob2;
                }
                return (Integer) ob1 - (Integer) ob2;
            case "||":
                return (Boolean) ob1 || (Boolean) ob2;
        }

        throw new RuntimeException("Cannot apply " + op + " between "
                + ob1.getClass().getSimpleName() + " and " + ob2.getClass().getSimpleName());
    }

    @Override
    public Object visitTermAST(PseudoJavaParser.TermASTContext ctx) {
        Object ob1 = visit(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            Object ob2 = visit(ctx.factor(i));
            ob1 = multiplicativeOp(ob1, ob2, ctx.multiplicative_op(i - 1).getText());
        }
        return ob1;
    }

    private Object multiplicativeOp(Object ob1, Object ob2, String op) {
        switch (op) {
            case "*":
                if (ob1 instanceof Float) {
                    return (Float) ob1 * (Float) ob2;
                }
                return (Integer) ob1 * (Integer) ob2;
            case "/":
                if (ob1 instanceof Float) {
                    return (Float) ob1 / (Float) ob2;
                }
                return (Integer) ob1 / (Integer) ob2;
            case "&&":
                return (Boolean) ob1 && (Boolean) ob2;
        }

        throw new RuntimeException("Cannot apply " + op + " between "
                + ob1.getClass().getSimpleName() + " and " + ob2.getClass().getSimpleName());
    }

    @Override
    public Object visitLiteralFactAST(PseudoJavaParser.LiteralFactASTContext ctx) {
        return super.visitLiteralFactAST(ctx);
    }

    @Override
    public Object visitIdFactAST(PseudoJavaParser.IdFactASTContext ctx) {
        return storage.retrieveCheckAllScopes(ctx.IDENTIFIER().getText()).getValue();
    }

    @Override
    public Object visitObjectFactAST(PseudoJavaParser.ObjectFactASTContext ctx) {
        return super.visitObjectFactAST(ctx);
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
        return super.visitAllocAST(ctx);
    }

    @Override
    public Object visitArrayAllocAST(PseudoJavaParser.ArrayAllocASTContext ctx) {
        return super.visitArrayAllocAST(ctx);
    }

    @Override
    public Object visitSubExpAST(PseudoJavaParser.SubExpASTContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Object visitFunctionCallAST(PseudoJavaParser.FunctionCallASTContext ctx) {
        FunctionAttr function = functionsTable.retrieveCheckAllScopes(ctx.IDENTIFIER().getText());
        return visit(function.getContext().block());
    }

    @Override
    public Object visitActualParamsAST(PseudoJavaParser.ActualParamsASTContext ctx) {
        return super.visitActualParamsAST(ctx);
    }

    @Override
    public Object visitArrayLookupAST(PseudoJavaParser.ArrayLookupASTContext ctx) {
        return super.visitArrayLookupAST(ctx);
    }

    @Override
    public Object visitArrayLengthAST(PseudoJavaParser.ArrayLengthASTContext ctx) {
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
    public Object visitIntLiteralAST(PseudoJavaParser.IntLiteralASTContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    @Override
    public Object visitRealLiteralAST(PseudoJavaParser.RealLiteralASTContext ctx) {
        return Float.parseFloat(ctx.getText());
    }

    @Override
    public Object visitBoolLiteralAST(PseudoJavaParser.BoolLiteralASTContext ctx) {
        return Boolean.parseBoolean(ctx.getText());
    }

    @Override
    public Object visitStrLiteralAST(PseudoJavaParser.StrLiteralASTContext ctx) {
        String str = ctx.getText();
        return str.substring(1, str.length() - 1).replace("\\\"", "\"");
    }

    @Override
    public Object visitCharLiteralAST(PseudoJavaParser.CharLiteralASTContext ctx) {
        String tokenText = ctx.CHAR_LITERAL().getText();
        if (tokenText.length() == 4) {
            return tokenText.charAt(2);
        }
        return tokenText.charAt(1);
    }

    private Instance assignVariable(PseudoJavaParser.TypeContext type,
                                    PseudoJavaParser.ExpressionContext expression) {
        Object value = visit(expression);
        if (type instanceof PseudoJavaParser.SmpTypeASTContext) {
            return new PrimitiveInstance(value);
        }

        throw new RuntimeException("Type: " + type.getText() + " is not a valid type");
    }

    private Instance createDefaultInstance(String type) {
        switch (type) {
            case "boolean":
                return new PrimitiveInstance(false);
            case "real":
                return new PrimitiveInstance(0f);
            case "char":
                return new PrimitiveInstance(' ');
            case "int":
                return new PrimitiveInstance(0);
            case "string":
                return new PrimitiveInstance("");
        }

        throw new RuntimeException("Unknown primitive: " + type);
    }

    private void output(String str) {
        System.out.print(str);
    }
}
