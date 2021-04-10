package com.compi.pseudojava.models;

import com.compi.generated.PseudoJavaParser;
import com.compi.generated.PseudoJavaScanner;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class PseudoJavaErrorListener implements ANTLRErrorListener {
    private final List<String> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
        if (recognizer instanceof PseudoJavaScanner) {
            errors.add("SCANNER ERROR - line " + i + ":" + i1 + " " + s);
        } else if (recognizer instanceof PseudoJavaParser) {
            errors.add("PARSER ERROR - line " + i + ":" + i1 + " " + s);
        } else {
            errors.add(s);
        }
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

    }

    public List<String> getErrors() {
        return errors;
    }
}
