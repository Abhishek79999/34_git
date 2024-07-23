package com.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.enities.Review;
import com.restapi.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewrepository;
	
	public Review createReview(Review review) {
		
		return reviewrepository.save(review);
		
	}

}
