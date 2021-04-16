package com.compi.pseudojava.context;

import com.compi.pseudojava.context.attributes.Attribute;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class IdentificationTable<T extends Attribute> {
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
}
