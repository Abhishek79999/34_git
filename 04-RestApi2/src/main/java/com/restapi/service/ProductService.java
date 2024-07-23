package com.restapi.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.enities.Product;
import com.restapi.repository.Productrepository;

@Service
public class ProductService {
	
	@Autowired
	private Productrepository productrepository;
	
	public void createProduct(Product product) {
		product.setIsstock(true);
		product.setBarcode(UUID.randomUUID().toString());
		productrepository.save(product);
		
	}
	
	public Product findProductById(long productid) {
		return productrepository.findById(productid).orElseThrow(()->new RuntimeException("user not found "));
	}
	
	public Product updateProduct(long productid,Product product) {
		Product dbProduct=findProductById(productid);
		dbProduct.setCategory(product.getCategory());
		dbProduct.setDescription(product.getDescription());
		dbProduct.setName(product.getName());
		dbProduct.setPrice(product.getPrice());
		dbProduct.setQuantity(product.getQuantity());
		return productrepository.save(dbProduct);
	}
	
	public Product deleteProduct(long productid) {
		Product dbProduct=findProductById(productid);
		return productrepository.save(dbProduct);
	}
	

}
