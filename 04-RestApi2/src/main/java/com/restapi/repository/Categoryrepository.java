package com.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.enities.Category;

public interface Categoryrepository extends JpaRepository<Category,Long> {
	
	

}
