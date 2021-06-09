package com.compi.pseudojava.languaje.interpreter;

import com.compi.generated.PseudoJavaParser;
import com.compi.generated.PseudoJavaParserBaseVisitor;
import com.compi.pseudojava.languaje.IdentificationTable;
import com.compi.pseudojava.languaje.interpreter.attributes.ClassAttr;
import com.compi.pseudojava.languaje.interpreter.attributes.FunctionAttr;
import com.compi.pseudojava.languaje.interpreter.exceptions.CodeException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interpreter extends PseudoJavaParserBaseVisitor<Object> {
    private static final String VARIABLE_UNDEFINED_EXCEPTION = "Element %s is undefined";
    private static final String ARRAY_INDEX_OUT_OF_BOUNDS_EXCEPTION = "Array index %s for %s is out of bounds";
    private static final String NEGATIVE_ARRAY_SIZE_EXCEPTION = "Negative array size: %s";

    private IdentificationTable<FunctionAttr> functionsTable = new IdentificationTable<>();
    private IdentificationTable<ClassAttr> classesTable = new IdentificationTable<>();
    private IdentificationTable<Instance<Object>> storage = new IdentificationTable<>();

    private final List<String> output = new ArrayList<>();

    @Override
    public Object visitProgramAST(PseudoJavaParser.ProgramASTContext ctx) {
        try {
            super.visitProgramAST(ctx);
        } catch (CodeException ex) {
            output(ex.getMessage());
        }
        return null;
    }

    @Override
    public Object visitStatement(PseudoJavaParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Object visitBlockAST(PseudoJavaParser.BlockASTContext ctx) {
        functionsTable.openScope();
        storage.openScope();
        classesTable.openScope();

        if (ctx.parent instanceof PseudoJavaParser.FunctionDeclASTContext) {
            String funcName = ((PseudoJavaParser.FunctionDeclASTContext) ctx.parent).IDENTIFIER().getText();
            FunctionAttr functionAttr = functionsTable.retrieveCheckAllScopes(funcName);
            for (int i = 0; i < functionAttr.getParametersSize(); i++) {
                storage.enter(functionAttr.getParamNameByIndex(i),
                        new Instance<>(functionAttr.getParamByIndex(i).getValue()));
            }
        }

        Object returnInstance = null;
        for (int i = 0; i < ctx.statement().size() && returnInstance == null; i++) {
            if (ctx.statement(i).return_statement() != null) {
                returnInstance = visit(ctx.statement(i).return_statement());
            } else {
                returnInstance = visit(ctx.statement(i));
            }
        }

        classesTable.closeScope();
        storage.closeScope();
        functionsTable.closeScope();
        return returnInstance;
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
        String funcName = ((PseudoJavaParser.FunctionDeclASTContext) ctx.parent.parent)
                .IDENTIFIER().getText();
        functionsTable.retrieve(funcName).enter(ctx.IDENTIFIER().getText(),
                createDefaultInstance(ctx.type().getText()));
        return null;
    }

    @Override
    public Object visitWhileAST(PseudoJavaParser.WhileASTContext ctx) {
        boolean expressionResult = (boolean) visit(ctx.expression());
        Object returnValue = null;
        while (expressionResult && returnValue == null) {
            returnValue = visit(ctx.block());
            expressionResult = (boolean) visit(ctx.expression());
        }
        return returnValue;
    }

    @Override
    public Object visitIfAST(PseudoJavaParser.IfASTContext ctx) {
        boolean expressionResult = (boolean) visit(ctx.expression());
        Object returnValue = null;
        if (expressionResult) {
            returnValue = visit(ctx.block(0));
        } else {
            if (ctx.block(1) != null) {
                returnValue = visit(ctx.block(1));
            }
        }
        return returnValue;
    }

    @Override
    public Object visitReturnAST(PseudoJavaParser.ReturnASTContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Object visitPrintAST(PseudoJavaParser.PrintASTContext ctx) {
        output(visit(ctx.expression()).toString());
        return null;
    }

    @Override
    public Object visitClassDeclAST(PseudoJavaParser.ClassDeclASTContext ctx) {
        classesTable.enter(ctx.IDENTIFIER().getText(), new ClassAttr());
        return super.visitClassDeclAST(ctx);
    }

    @Override
    public Object visitVariableDeclAST(PseudoJavaParser.VariableDeclASTContext ctx) {
        if (ctx.parent instanceof PseudoJavaParser.ClassDeclASTContext) {
            PseudoJavaParser.ClassDeclASTContext classDeclASTContext =
                    (PseudoJavaParser.ClassDeclASTContext) ctx.parent;
            ClassAttr classAttr = classesTable.retrieve(classDeclASTContext.IDENTIFIER().getText());
            classAttr.addVarDeclaration(ctx);
        } else {
            Instance<Object> instance = null;
            if (ctx.expression() != null) {
                Object value = visit(ctx.expression());
                instance = new Instance<>(value);
            } else {
                instance = createDefaultInstance(ctx.type().getText());
            }
            if (ctx.parent instanceof PseudoJavaParser.AllocASTContext) {
                return instance;
            }
            storage.enter(ctx.IDENTIFIER().getText(), instance);
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
        Instance<Object> instance = storage.retrieveCheckAllScopes(ctx.IDENTIFIER(0).getText());
        // It's accessing to a class member
        if (ctx.IDENTIFIER(1) != null) {
            instance = ((Map<String, Instance<Object>>) instance.getValue())
                    .get(ctx.IDENTIFIER(1).getText());
        }
        instance.setValue(visit(ctx.expression()));
        return null;
    }

    @Override
    public Object visitArrayAssignmentAST(PseudoJavaParser.ArrayAssignmentASTContext ctx) {
        Instance<Object> arrInstance = storage.retrieveCheckAllScopes(ctx.IDENTIFIER().getText());
        if (arrInstance == null) {
            throw new CodeException(String.format(VARIABLE_UNDEFINED_EXCEPTION, ctx.IDENTIFIER()),
                    ctx.start.getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1);
        }
        Object[] array = (Object[]) arrInstance.getValue();
        int index = (int) visit(ctx.expression(0));

        if (index >= array.length) {
            throw new CodeException(String.format(ARRAY_INDEX_OUT_OF_BOUNDS_EXCEPTION,
                    index, ctx.IDENTIFIER()),
                    ctx.start.getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1);
        }

        array[index] = visit(ctx.expression(1));
        return null;
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
        Instance<Object> instance = storage.retrieveCheckAllScopes(ctx.IDENTIFIER(0).getText());
        instance = ((Map<String, Instance<Object>>) instance.getValue())
                .get(ctx.IDENTIFIER(1).getText());
        if (instance.getValue() == null) {
            throw new CodeException(String.format(VARIABLE_UNDEFINED_EXCEPTION, ctx.IDENTIFIER(0)),
                    ctx.start.getLine(), ctx.IDENTIFIER(0).getSymbol().getCharPositionInLine() + 1);
        }
        return instance.getValue();
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
        Object ob = visit(ctx.expression());

        if (ctx.SUM() != null) {
            return ob;
        } else if (ctx.MINUS() != null) {
            if (ob instanceof Integer) {
                return -(int) ob;
            }
            return -(float) ob;
        } else if (ctx.NEAGTE() != null) {
            return !(boolean) ob;
        }
        throw new RuntimeException("Unregistered unary operator");
    }

    @Override
    public Object visitAllocAST(PseudoJavaParser.AllocASTContext ctx) {
        ClassAttr classAttr = classesTable.retrieveCheckAllScopes(ctx.IDENTIFIER().getText());
        Map<String, Instance<Object>> classValue = new HashMap<>();

        for (PseudoJavaParser.VariableDeclASTContext varDecl : classAttr.getVarDeclarations()) {
            varDecl.parent = ctx;
            classValue.put(varDecl.IDENTIFIER().getText(), (Instance<Object>) visit(varDecl));
        }
        return classValue;
    }

    @Override
    public Object visitArrayAllocAST(PseudoJavaParser.ArrayAllocASTContext ctx) {
        return createArray(ctx.simple_type().getText(), (int) visit(ctx.expression()), ctx);
    }

    Object[] createArray(String type, int size, PseudoJavaParser.ArrayAllocASTContext ctx) {
        if (size < 0) {
            throw new CodeException(String.format(NEGATIVE_ARRAY_SIZE_EXCEPTION, size),
                    ctx.start.getLine(), ctx.start.getCharPositionInLine() + 1);
        }
        Object[] objArr = new Object[size];

        for (int i = 0; i < objArr.length; i++) {
            objArr[i] = getDefaultValue(type);
        }

        return objArr;
    }

    @Override
    public Object visitSubExpAST(PseudoJavaParser.SubExpASTContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Object visitFunctionCallAST(PseudoJavaParser.FunctionCallASTContext ctx) {
        String funcName = ctx.IDENTIFIER().getText();
        if (funcName.equals("chr")) {
            return (char) ((int) visit(ctx.actual_params().getChild(0)));
        }
        if (funcName.equals("ord")) {
            return (int) ((char) visit(ctx.actual_params().getChild(0)));
        }
        if (funcName.equals("len")) {
            return ((String) visit(ctx.actual_params().getChild(0))).length();
        }
        FunctionAttr function = functionsTable.retrieveCheckAllScopes(funcName);
        if (ctx.actual_params() != null) {
            visit(ctx.actual_params());
        }
        return visit(function.getContext().block());
    }

    @Override
    public Object visitActualParamsAST(PseudoJavaParser.ActualParamsASTContext ctx) {
        String funcName = ((PseudoJavaParser.FunctionCallASTContext) ctx.parent).IDENTIFIER().getText();
        FunctionAttr function = functionsTable.retrieveCheckAllScopes(funcName);

        for (int i = 0; i < ctx.expression().size(); i++) {
            function.getParamByIndex(i).setValue(visit(ctx.expression(i)));
        }

        return null;
    }

    @Override
    public Object visitArrayLookupAST(PseudoJavaParser.ArrayLookupASTContext ctx) {
        Instance<Object> arrInstance = storage.retrieveCheckAllScopes(ctx.IDENTIFIER().getText());
        if (arrInstance == null) {
            throw new CodeException(String.format(VARIABLE_UNDEFINED_EXCEPTION, ctx.IDENTIFIER()),
                    ctx.start.getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1);
        }
        Object[] array = (Object[]) arrInstance.getValue();
        int index = (int) visit(ctx.expression());

        if (index >= array.length) {
            throw new CodeException(String.format(ARRAY_INDEX_OUT_OF_BOUNDS_EXCEPTION,
                    index, ctx.IDENTIFIER()),
                    ctx.start.getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1);
        }

        return array[index];
    }

    @Override
    public Object visitArrayLengthAST(PseudoJavaParser.ArrayLengthASTContext ctx) {
        Instance<Object> arrInstance = storage.retrieveCheckAllScopes(ctx.IDENTIFIER().getText());
        if (arrInstance == null) {
            throw new CodeException(String.format(VARIABLE_UNDEFINED_EXCEPTION, ctx.IDENTIFIER()),
                    ctx.start.getLine(), ctx.IDENTIFIER().getSymbol().getCharPositionInLine() + 1);
        }
        return ((Object[]) arrInstance.getValue()).length;
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
        return str.substring(1, str.length() - 1)
                .replace("\\\"", "\"")
                .replaceAll("(?<!\\\\)\\\\n", "\n");
    }

    @Override
    public Object visitCharLiteralAST(PseudoJavaParser.CharLiteralASTContext ctx) {
        String tokenText = ctx.CHAR_LITERAL().getText();
        if (tokenText.length() == 4) {
            return tokenText.charAt(2);
        }
        return tokenText.charAt(1);
    }

    private Object getDefaultValue(String type) {
        switch (type) {
            case "boolean":
                return false;
            case "real":
                return 0f;
            case "char":
                return ' ';
            case "int":
                return 0;
            case "string":
                return "";
        }

        return null;
    }

    private Instance<Object> createDefaultInstance(String type) {
        return new Instance<>(getDefaultValue(type));
    }

    private void output(String str) {
        System.out.print(str);
        output.add(str);
    }

    public List<String> getOutput() {
        return output;
    }
}
