package de.tomahawk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DayApiApplication {

	public static void main(String[] args) {
		System.out.println("hallo!");
		Product p1 = new Product();
		p1.setProductType(ProductTypeEnum.TSHIRT);
		p1.setName("Beards Shirt");
		p1.setSize(SizeEnum.L);
		System.out.println(p1);
		SpringApplication.run(DayApiApplication.class, args);
	}
}
