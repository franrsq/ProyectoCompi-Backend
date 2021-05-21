package com.compi.pseudojava.languaje.interpreter.exceptions;

public class CodeException extends RuntimeException {
    public CodeException(String message, int line, int column) {
        super("Runtime exception at " + line + ":" + column + ": " + message);
    }
}
