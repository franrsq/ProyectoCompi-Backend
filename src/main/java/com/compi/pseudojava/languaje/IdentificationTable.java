package com.compi.pseudojava.languaje;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class IdentificationTable<T> implements Serializable {
    private LinkedList<Map<String, T>> scopes = new LinkedList<>();

    public IdentificationTable() {
        scopes.add(new HashMap<>());
    }

    public void enter(String name, T attr) {
        scopes.getFirst().put(name, attr);
    }

    public T retrieve(String name) {
        return scopes.getFirst().get(name);
    }

    public T retrieveCheckAllScopes(String name) {
        for (Map<String, T> scope : scopes) {
            if (scope.get(name) != null) {
                return scope.get(name);
            }
        }

        return null;
    }

    public void openScope() {
        scopes.addFirst(new HashMap<>());
    }

    public void closeScope() {
        if (scopes.size() == 1) {
            throw new IllegalStateException("scopes will be empty");
        }
        scopes.removeFirst();
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < scopes.size(); i++) {
            strBuilder.append("\nScope ").append(i).append("\n");
            scopes.get(i).forEach((key, value) ->
                    strBuilder.append(key).append(": ").append(value).append("\n"));
        }
        return strBuilder.toString();
    }
}
