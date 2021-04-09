package com.compi.pseudojava.models;

import javax.persistence.Entity;

@Entity
public class Snippet {
    private String code;

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
}