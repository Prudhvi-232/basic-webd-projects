package com.iiitl.usrapi.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.iiitl.usrapi.users.model.UserModel;
import com.iiitl.usrapi.users.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
    @GetMapping("/users")
	public List<UserModel> getUsers(){
	  return this.userService.getUsers();
	  
  }
    @GetMapping("users/{userId}")
    public UserModel getUserById(@PathVariable("userId") long userId) {
    	
    	return this.userService.getUserById(userId);
    	
    }
	

}