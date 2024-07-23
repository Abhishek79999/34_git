package com.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.enities.Review;
import com.restapi.service.ReviewService;

@RestController
@RequestMapping("/api/v1/review")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewservice;
	@PostMapping
	public Review createReview(@RequestBody Review review) {
		 return reviewservice.createReview(review);
		
	}

}
