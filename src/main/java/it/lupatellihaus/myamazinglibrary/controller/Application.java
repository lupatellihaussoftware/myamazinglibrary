package it.lupatellihaus.myamazinglibrary.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
        "it.lupatellihaus.myamazinglibrary.*"})
@EnableJpaRepositories(basePackages = "it.lupatellihaus.myamazinglibrary.repository")
@EntityScan(basePackages = "it.lupatellihaus.myamazinglibrary.domain")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
