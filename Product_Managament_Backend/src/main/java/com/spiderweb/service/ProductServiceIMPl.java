package com.spiderweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spiderweb.pojo.Product;
import com.spiderweb.repository.ProductRepository;

@Service
public class ProductServiceIMPl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		
		return productRepository.findById(id).get();
	}

	@Override
	public String deleteProduct(Integer id) {
		
		if(productRepository.existsById(id)) {
			productRepository.deleteById(id);
			return "Product with "+id+" Deleted Successfully!";
		}
		
	    return "Product with ID " + id + " not found";
	    
		
		
	}
	
	

}
