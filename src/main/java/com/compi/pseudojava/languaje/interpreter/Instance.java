package com.compi.pseudojava.languaje.interpreter;

public class Instance<V> {
    private V value;

    public Instance(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Instance{" +
                "value=" + value +
                '}';
    }
}
