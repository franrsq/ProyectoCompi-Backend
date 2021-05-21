package com.compi.pseudojava.languaje.interpreter;

import java.util.Arrays;

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
        if (value instanceof Object[]) {
            return "Instance{" +
                    "value=" + Arrays.toString((Object[]) value) +
                    '}';
        }
        return "Instance{" +
                "value=" + value +
                '}';
    }
}
