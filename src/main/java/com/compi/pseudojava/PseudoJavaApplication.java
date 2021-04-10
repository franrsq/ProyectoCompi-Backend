package com.compi.pseudojava;

import com.compi.generated.PseudoJavaParser;
import com.compi.generated.PseudoJavaScanner;
import com.compi.pseudojava.models.PseudoJavaErrorListener;
import com.compi.pseudojava.models.Snippet;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class PseudoJavaApplication {
    public static void main(String[] args) {
        SpringApplication.run(PseudoJavaApplication.class, args);
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
