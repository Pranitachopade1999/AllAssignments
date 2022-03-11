package com.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.productservice.models.Product;
import com.productservice.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll()
	{
		return this.productRepository.findAll();
	}
	
	public Product save(@RequestBody Product product)
	{
		return this.productRepository.save(product);
	}
	
	
}
