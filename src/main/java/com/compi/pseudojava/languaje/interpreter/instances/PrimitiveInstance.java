package com.compi.pseudojava.languaje.interpreter.instances;

public class PrimitiveInstance extends Instance {
    public PrimitiveInstance(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PrimitiveInstance{" +
                "value=" + value +
                '}';
    }
}
