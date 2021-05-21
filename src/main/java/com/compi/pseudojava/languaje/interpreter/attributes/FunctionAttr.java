package com.compi.pseudojava.languaje.interpreter.attributes;

import com.compi.generated.PseudoJavaParser;
import com.compi.pseudojava.languaje.Attribute;
import com.compi.pseudojava.languaje.interpreter.instances.Instance;

import java.util.Map;

public class FunctionAttr extends Attribute {
    private PseudoJavaParser.FunctionDeclASTContext context;
    private Map<String, Instance> parameters;

    public FunctionAttr(PseudoJavaParser.FunctionDeclASTContext context) {
        this.context = context;
    }

    public PseudoJavaParser.FunctionDeclASTContext getContext() {
        return context;
    }
}
