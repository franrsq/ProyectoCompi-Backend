package com.compi.pseudojava.languaje.interpreter.attributes;

import com.compi.generated.PseudoJavaParser;
import com.compi.pseudojava.languaje.Attribute;
import com.compi.pseudojava.languaje.interpreter.Instance;

import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionAttr extends Attribute {
    private PseudoJavaParser.FunctionDeclASTContext context;
    private Map<String, Instance> parameters;

    public FunctionAttr(PseudoJavaParser.FunctionDeclASTContext context) {
        this.context = context;
        this.parameters = new LinkedHashMap<>();
    }

    public PseudoJavaParser.FunctionDeclASTContext getContext() {
        return context;
    }

    public void enter(String name, Instance<Object> instance) {
        parameters.put(name, instance);
    }

    public Instance<Object> getParamByIndex(int index) {
        if (index > parameters.size() - 1) {
            throw new IndexOutOfBoundsException("Index is greater than parameters size");
        }

        return parameters.get(parameters.keySet().toArray()[index]);
    }

    public String getParamNameByIndex(int index) {
        if (index > parameters.size() - 1) {
            throw new IndexOutOfBoundsException("Index is greater than parameters size");
        }

        return (String) parameters.keySet().toArray()[index];
    }

    public int getParametersSize() {
        return parameters.size();
    }

    @Override
    public String toString() {
        return "FunctionAttr{" +
                "context=" + context +
                ", parameters=" + parameters +
                '}';
    }
}
