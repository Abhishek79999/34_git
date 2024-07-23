package com.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.enities.User;
import com.restapi.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/user")
@Slf4j
public class UserController {
	
	@Autowired UserService userservice;
	
	@PostMapping
	public void createUser(@RequestBody User user) {
		log.info("UserController::createuser{}{}",user.getEmail(),user.getUsername());
		userservice.createuser(user);
		
	}
	//https://localhost:8080/api/v1/user/67
	@GetMapping("{userid}")
	public User getUserByid(@PathVariable Long userid) {
		log.info("UserController::getUserByid{}{}",userid);

		return userservice.findUserByid(userid);
		
	}
	
	@PutMapping("/userid")
	public void updateUser(@PathVariable Long userid,@RequestBody User user) {
		userservice.updateUser(userid, user);
	}
	@PatchMapping("changepwd/userid")
	public void updatePassword(@PathVariable Long userid,@RequestBody User user) {
		userservice.updatePassword(userid, user);
	}
	@DeleteMapping
	public void deleteuser(@PathVariable Long userid) {
		
		userservice.deleteuser(userid);
		
	}
	
	
	

}
