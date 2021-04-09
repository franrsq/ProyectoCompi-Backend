package com.compi.pseudojava;

import com.compi.generated.PseudoJavaParser;
import com.compi.generated.PseudoJavaScanner;
import com.compi.pseudojava.models.PseudoJavaErrorListener;
import com.compi.pseudojava.models.Snippet;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@RestController
@SpringBootApplication
public class PseudoJavaApplication {
    public static void main(String[] args) {
        SpringApplication.run(PseudoJavaApplication.class, args);
    }

    @PostMapping("/parseSnippet")
    public ResponseEntity<Map<String, Object>> parseSnippet(@RequestBody Snippet snippet) {
        if (snippet.getCode() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        CharStream input = CharStreams.fromString(snippet.getCode());
        PseudoJavaScanner inst = new PseudoJavaScanner(input);
        CommonTokenStream tokens = new CommonTokenStream(inst);
        PseudoJavaParser parser = new PseudoJavaParser(tokens);
        PseudoJavaErrorListener errorListener = new PseudoJavaErrorListener();
        parser.addErrorListener(errorListener);
        ParseTree tree = parser.program();

        System.out.println(snippet.getCode());
        HashMap<String, Object> map = new HashMap<>(1);
        map.put("errors", errorListener.getErrors());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
