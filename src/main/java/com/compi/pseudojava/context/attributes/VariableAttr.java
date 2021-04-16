package com.compi.pseudojava.context.attributes;

import java.util.Objects;

public class VariableAttr extends Attribute {
    private String type;
    private boolean isArray;

    public VariableAttr(String type, boolean isArray) {
        this.type = type;
        this.isArray = isArray;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isArray() {
        return isArray;
    }

    public void setArray(boolean array) {
        isArray = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariableAttr that = (VariableAttr) o;
        return isArray == that.isArray && Objects.equals(type, that.type);
    }
}
