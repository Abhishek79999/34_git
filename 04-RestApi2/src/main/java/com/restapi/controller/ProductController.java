package com.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.enities.Product;
import com.restapi.service.ProductService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
	@Autowired
	private ProductService productservice;
	@PostMapping
	public void createProduct(@RequestBody Product product) {
		productservice.createProduct(product);
		
		}
	@GetMapping("{pid}")
	public Product findProductById(@PathVariable(name="pid") long productid) {
		return productservice.findProductById(productid);
		
	}
	@PutMapping("{pid}")
	public Product updateProduct(@PathVariable long productid, @RequestBody Product product  ) {
		return productservice.updateProduct(productid, product);
	}
	@DeleteMapping("{pid}")
	public Product deleteProduct(@PathVariable long productid) {
		return productservice.deleteProduct(productid);
		
	}

}
