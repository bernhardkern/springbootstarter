package de.kern.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class SpringbootstarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootstarterApplication.class, args);
    }

}
