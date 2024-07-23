package com.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.enities.Product;

public interface Productrepository extends JpaRepository<Product ,Long> {

}
