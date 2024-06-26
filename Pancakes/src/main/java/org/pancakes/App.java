package org.pancakes;

import org.graalvm.polyglot.Context;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.io.File;


@SpringBootApplication
@EnableJpaRepositories
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
