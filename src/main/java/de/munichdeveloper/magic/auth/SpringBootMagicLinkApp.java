package de.munichdeveloper.magic.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories({"de.munichdeveloper.user"})
@EntityScan(basePackages = {"de.munichdeveloper.user"})
@ComponentScan(basePackages = {"de.munichdeveloper.user", "de.munichdeveloper.magic"})
public class SpringBootMagicLinkApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMagicLinkApp.class, args);
    }

}