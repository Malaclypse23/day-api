package de.tomahawk;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private BigDecimal price;
	
	@Enumerated(EnumType.STRING)
	private CurrencyEnum currency;
	
	@Enumerated(EnumType.STRING)
	private ProductTypeEnum productType;
	
	@Enumerated(EnumType.STRING)
	private SizeEnum size;
	
	private Boolean active;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public CurrencyEnum getCurrency() {
		return currency;
	}
	
	public void setCurrency(CurrencyEnum currency) {
		this.currency = currency;
	}

	public ProductTypeEnum getProductType() {
		return productType;
	}

	public void setProductType(ProductTypeEnum productType) {
		this.productType = productType;
	}

	public SizeEnum getSize() {
		return size;
	}

	public void setSize(SizeEnum size) {
		this.size = size;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
