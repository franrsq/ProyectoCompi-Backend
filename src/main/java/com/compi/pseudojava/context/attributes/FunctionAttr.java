package com.compi.pseudojava.context.attributes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class FunctionAttr extends Attribute {
    private VariableAttr returnType;
    private Map<String, VariableAttr> parameters;

    public FunctionAttr(VariableAttr returnType) {
        this.returnType = returnType;
        this.parameters = new LinkedHashMap<>();
    }

    public VariableAttr retrieve(String name) {
        return parameters.get(name);
    }

    public void enter(String name, VariableAttr variableAttr) {
        parameters.put(name, variableAttr);
    }

    public int parametersSize() {
        return parameters.size();
    }

    public VariableAttr getParamByIndex(int index) {
        if (index > parameters.size() - 1) {
            throw new IndexOutOfBoundsException("Index is greater than parameters size");
        }

        return parameters.get(parameters.keySet().toArray()[index]);
    }

    public VariableAttr getReturnType() {
        return returnType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FunctionAttr that = (FunctionAttr) o;
        return Objects.equals(returnType, that.returnType) && Objects.equals(parameters, that.parameters);
    }
}
