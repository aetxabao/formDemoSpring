package com.example.formDemoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://spring.io/guides/gs/serving-web-content/
 *
 * ./mvnw clean package
 *
 * java -jar target/formDemoSpring-0.0.1-SNAPSHOT.jar
 */
@SpringBootApplication
public class FormDemoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormDemoSpringApplication.class, args);
	}

}
