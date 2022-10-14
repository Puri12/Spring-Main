package com.puri12.springmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMainApplication.class, args);
	}

}
