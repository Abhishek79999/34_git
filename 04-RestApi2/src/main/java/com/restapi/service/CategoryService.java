package com.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.enities.Category;
import com.restapi.repository.Categoryrepository;

@Service
public class CategoryService {
	@Autowired
	private Categoryrepository categoryrepository;
	
	public void createCategory(Category category) {
		categoryrepository.save(category);
			
		
	}
	public Category fetchCategoryById(Long categoryid) {
		 return categoryrepository.findById(categoryid)
			.orElseThrow(()->new RuntimeException("not found"));
	}
	
	public List<Category> getAllCategory(){
		
		List<Category>lc=categoryrepository.findAll();
		return lc;
		
	}
	public void updateCategory(Long categoryid,Category category ) {
		Category dcat=fetchCategoryById(categoryid);
		
		
		
		
		}
		
	}


