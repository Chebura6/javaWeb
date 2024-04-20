package org.pancakes;

import org.graalvm.polyglot.Context;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.io.File;

//@Configuration
@SpringBootApplication
public class App {

    public static void main(String[] args) {
//        try (Context context = Context.create()) {
//            // Load and evaluate the JavaScript file
//            File jsFile = new File("path/to/your/javascript/file.js");
//            context.eval(jsFile);
//        }

        SpringApplication.run(App.class, args);
    }

}
