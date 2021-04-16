package com.compi.pseudojava.context.attributes;

import java.util.Map;
import java.util.Objects;

public class FunctionAttr extends Attribute {
    private VariableAttr returnType;
    private Map<String, VariableAttr> parameters;

    public FunctionAttr(VariableAttr returnType, Map<String, VariableAttr> parameters) {
        this.returnType = returnType;
        this.parameters = parameters;
    }

    public VariableAttr getReturnType() {
        return returnType;
    }

    public void setReturnType(VariableAttr returnType) {
        this.returnType = returnType;
    }

    public Map<String, VariableAttr> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, VariableAttr> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FunctionAttr that = (FunctionAttr) o;
        return Objects.equals(returnType, that.returnType) && Objects.equals(parameters, that.parameters);
    }
}
