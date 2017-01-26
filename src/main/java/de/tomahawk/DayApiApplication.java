package de.tomahawk;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DayApiApplication {

	public static void main(String[] args) {
		System.out.println("hallo!");
		
		Product p1 = new Product();
		p1.setName("Beard Shirt");
		p1.setPrice(new BigDecimal(19));
		p1.setCurrency("EUR");
		
		
		SpringApplication.run(DayApiApplication.class, args);
	}
}
