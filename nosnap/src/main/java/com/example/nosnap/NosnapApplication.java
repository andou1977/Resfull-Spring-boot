package com.example.nosnap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.nosnap.repository")
@SpringBootApplication
public class NosnapApplication {

	public static void main(String[] args) {
		SpringApplication.run(NosnapApplication.class, args);
	}

}
