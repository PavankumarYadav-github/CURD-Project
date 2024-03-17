package com.spiderweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spiderweb.pojo.Product;

public interface ProductRepository extends JpaRepository<Product,Integer >{
	
	
	
}
