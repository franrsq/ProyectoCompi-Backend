package com.compi.pseudojava.models;

import javax.persistence.Entity;

@Entity
public class Snippet {
    private String code;
    private boolean resetAST;

    public Snippet() {

    }

    public Snippet(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean resetAST() {
        return resetAST;
    }

    public void setResetAST(boolean resetAST) {
        this.resetAST = resetAST;
    }
}