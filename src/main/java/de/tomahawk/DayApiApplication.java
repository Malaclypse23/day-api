package de.tomahawk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DayApiApplication {

	public static void main(String[] args) {
		System.out.println("hallo!");
		SpringApplication.run(DayApiApplication.class, args);
	}
}
