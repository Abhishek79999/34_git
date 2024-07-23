package com.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.enities.User;
import com.restapi.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepository userrepository;
	
	
	public void createuser(User user) {
		
		log.info("UserService::createuser{}{}",user.getUsername(),user.getEmail());
		userrepository.save(user);
		log.info("user successfully stored in db");
		
	}
	
	public List<User> fetchAllUser(){
		
		List<User> luser=userrepository.findAll();
		return luser;
		
	}
	
	public User findUserByid(Long userid) {
		return userrepository.findById(userid)
			.orElseThrow(()->new RuntimeException("user not found "));
		
	}
	
	public void deleteuser(Long userid) {
		if(userrepository.existsById(userid)) {
			userrepository.deleteById(userid);
			
		}else {
			throw new RuntimeException("user not found");
		}
	}
    public void updateUser(Long userid,User inuser) {
    	User dbuser=findUserByid(userid) ;
    		
    	dbuser.setEmail(inuser.getEmail());
    	dbuser.setUsername(inuser.getUsername());
    	dbuser.setPassword(inuser.getPassword());
    userrepository.save(dbuser);
    
   }
    public void updatePassword(Long userid,User inuser) {
    	User dbuser=findUserByid(userid) ;
    		dbuser.setPassword(inuser.getPassword());
    userrepository.save(dbuser);
    
   }
    public void delete_another(Long userid) {
    	User dbuser=findUserByid(userid);
    	userrepository.delete(dbuser);
    }
    
    	
    }
	
	

