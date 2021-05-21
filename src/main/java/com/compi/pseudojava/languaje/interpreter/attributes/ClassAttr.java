package com.compi.pseudojava.languaje.interpreter.attributes;

import com.compi.generated.PseudoJavaParser;
import com.compi.pseudojava.languaje.Attribute;

import java.util.LinkedList;
import java.util.List;

public class ClassAttr extends Attribute {
    private List<PseudoJavaParser.VariableDeclASTContext> varDeclarations;

    public ClassAttr() {
        varDeclarations = new LinkedList<>();
    }

    public void addVarDeclaration(PseudoJavaParser.VariableDeclASTContext varDecl) {
        varDeclarations.add(varDecl);
    }

    public List<PseudoJavaParser.VariableDeclASTContext> getVarDeclarations() {
        return varDeclarations;
    }
}
