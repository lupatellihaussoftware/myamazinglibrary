package it.lupatellihaus.myamazinglibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
//@SpringBootApplication(scanBasePackages = {
//        "it.lupatellihaus.myamazinglibrary.*"})
//@EnableJpaRepositories(basePackages = "it.lupatellihaus.myamazinglibrary.repository")
//@EntityScan(basePackages = "it.lupatellihaus.myamazinglibrary.
// ")
public class Application {

    public static void main(String[] args) {
        System.setProperty("server.servlet.context-path", "/25readers");
        SpringApplication.run(Application.class, args);
    }
}
