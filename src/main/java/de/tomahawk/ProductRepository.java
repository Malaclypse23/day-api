package de.tomahawk;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Long> {
	
	List<Product> findByActive(Boolean active);
	List<Product> findByProductType(ProductTypeEnum productType);
	

}
