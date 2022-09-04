package com.fullApp.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullApp.userservice.Service.UserService;
import com.fullApp.userservice.entity.User;
import com.fullApp.userservice.model.ResponseTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping( value="/user")
@Slf4j
public class userController {
	
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value="/save")
	public User saveUser(@RequestBody User user) {
		return userService.save(user);
		
	}
	
	  @GetMapping("/get/{userId}")
	  public ResponseTemplate saveUser(@PathVariable Long userId)
	  { 	  
		 
	  return userService.getUserWithDepartment(userId);
	 
	  }
	 

}
