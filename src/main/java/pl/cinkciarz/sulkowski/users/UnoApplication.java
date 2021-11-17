package pl.cinkciarz.sulkowski.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import pl.cinkciarz.sulkowski.users.endpoint.UsersEndpoint;

@SpringBootApplication
public class UnoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnoApplication.class, args);
    }

}
