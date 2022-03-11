package com.productservice.models;

import java.math.BigDecimal;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value="ProductCollection")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
	@Id
	private String productId;
	private String productName;
	private String 	productDesc;
	private BigDecimal productPrice;
	
	
	
}
