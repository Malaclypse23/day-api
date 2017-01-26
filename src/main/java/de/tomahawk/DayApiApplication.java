package de.tomahawk;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DayApiApplication {

	private static final Logger log = LoggerFactory.getLogger(DayApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DayApiApplication.class, args);
	}
	
	
 	@Bean
	public CommandLineRunner demo(ProductRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Product("Beard T-Shirt M", ProductTypeEnum.TSHIRT, SizeEnum.M, new BigDecimal(18), CurrencyEnum.EUR));
			repository.save(new Product("Beard T-Shirt L", ProductTypeEnum.TSHIRT, SizeEnum.L, new BigDecimal(18), CurrencyEnum.EUR));
			repository.save(new Product("Beard T-Shirt XL", ProductTypeEnum.TSHIRT, SizeEnum.XL, new BigDecimal(18), CurrencyEnum.EUR));
			repository.save(new Product("Beard Print", ProductTypeEnum.PRINT, SizeEnum.A4, new BigDecimal(12), CurrencyEnum.EUR));
			
			for (Product product : repository.findAll()) {
				log.info(product.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Product product = repository.findOne(1L);
			log.info("Product found with findOne(1L):");
			log.info("--------------------------------");
			log.info(product.toString());
			log.info("");

			// fetch customers by last name
			log.info("Alle T-Shirts finden:");
			log.info("--------------------------------------------");
			for (Product p : repository.findByProductType(ProductTypeEnum.TSHIRT)) {
				log.info(p.toString());
			}
			log.info("");
		};
	}

}
