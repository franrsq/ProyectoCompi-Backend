package com.compi.pseudojava;

import com.compi.generated.PseudoJavaParser;
import com.compi.generated.PseudoJavaScanner;
import com.compi.pseudojava.languaje.context.ContextAnalyzer;
import com.compi.pseudojava.languaje.interpreter.Interpreter;
import com.compi.pseudojava.models.PseudoJavaErrorListener;
import com.compi.pseudojava.models.Snippet;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class PseudoJavaApplication {
    ContextAnalyzer contextAnalyzer = new ContextAnalyzer();

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        CharStream input = CharStreams.fromFileName("test.txt");
        PseudoJavaScanner inst = new PseudoJavaScanner(input);
        CommonTokenStream tokens = new CommonTokenStream(inst);
        PseudoJavaParser parser = new PseudoJavaParser(tokens);
        PseudoJavaErrorListener errorListener = new PseudoJavaErrorListener();
        parser.addErrorListener(errorListener);
        ParseTree tree = parser.program();
        ContextAnalyzer contextAnalyzer = new ContextAnalyzer();
        contextAnalyzer.visit(tree);

        for (String error : errorListener.getErrors()) {
            System.out.println(error);
        }
        Interpreter interpreter = new Interpreter();
        interpreter.visit(tree);
        /*java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
            treeGUI.get().setVisible(true);*/
        //SpringApplication.run(PseudoJavaApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("*")
                        .allowedHeaders("*");
            }
        };
    }

    @PostMapping("/parseSnippet")
    public ResponseEntity<Map<String, Object>> parseSnippet(@RequestBody Snippet snippet)
            throws IOException, ClassNotFoundException {
        if (snippet.getCode() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        if (snippet.resetAST()) {
            contextAnalyzer = new ContextAnalyzer();
        }
        CharStream input = CharStreams.fromString(snippet.getCode());
        PseudoJavaScanner inst = new PseudoJavaScanner(input);
        CommonTokenStream tokens = new CommonTokenStream(inst);
        PseudoJavaParser parser = new PseudoJavaParser(tokens);
        PseudoJavaErrorListener errorListener = new PseudoJavaErrorListener();
        parser.addErrorListener(errorListener);
        ParseTree tree = parser.program();
        ContextAnalyzer backup = contextAnalyzer.makeClone();
        backup.visit(tree);
        if (backup.getErrors().isEmpty()) {
            contextAnalyzer = backup;
        }

        HashMap<String, Object> map = new HashMap<>(1);
        map.put("errors", Stream.concat(errorListener.getErrors().stream(), backup.getErrors().stream())
                .collect(Collectors.toList()));
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @PostMapping("/resetAST")
    public ResponseEntity<Map<String, Object>> resetAST() {
        contextAnalyzer = new ContextAnalyzer();
        HashMap<String, Object> map = new HashMap<>(1);
        map.put("status", "AST reseted");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
