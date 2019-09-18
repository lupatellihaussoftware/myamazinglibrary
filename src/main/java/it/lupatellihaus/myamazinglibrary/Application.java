package it.lupatellihaus.myamazinglibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@SpringBootApplication(scanBasePackages = {
//        "it.lupatellihaus.myamazinglibrary.*"})
//@EnableJpaRepositories(basePackages = "it.lupatellihaus.myamazinglibrary.repository")
//@EntityScan(basePackages = "it.lupatellihaus.myamazinglibrary.
// ")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
