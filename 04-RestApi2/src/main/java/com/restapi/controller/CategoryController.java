package com.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.enities.Category;
import com.restapi.service.CategoryService;

@RestController
@RequestMapping("/api/V1/category")

public class CategoryController {
	
	@Autowired
	private CategoryService categoryservice;
	
	@PostMapping
	public void createcategory(@RequestBody Category category) {
		categoryservice.createCategory(category);
		
		
	}
	
	

}
