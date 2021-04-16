package com.compi.pseudojava.context.attributes;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ClassAttr extends Attribute {
    private Map<String, VariableAttr> classMembers;

    public ClassAttr() {
        classMembers = new HashMap<>();
    }

    public ClassAttr(Map<String, VariableAttr> classMembers) {
        this.classMembers = classMembers;
    }

    public VariableAttr retrieve(String name) {
        return classMembers.get(name);
    }

    public void enter(String name, VariableAttr variableAttr) {
        classMembers.put(name, variableAttr);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassAttr classAttr = (ClassAttr) o;
        return Objects.equals(classMembers, classAttr.classMembers);
    }
}
