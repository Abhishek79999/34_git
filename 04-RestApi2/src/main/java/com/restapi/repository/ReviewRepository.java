package com.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.enities.Review;

public interface ReviewRepository extends JpaRepository<Review,Long> {

}
