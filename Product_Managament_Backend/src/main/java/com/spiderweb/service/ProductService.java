package com.spiderweb.service;

import java.util.List;

import com.spiderweb.pojo.Product;

public interface ProductService {
	
	public Product saveProduct(Product product);
	
	public List<Product> getAllProducts();
	
	public Product getProductById(Integer id);
	
	public String deleteProduct(Integer id);

}	
