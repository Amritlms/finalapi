package com.assessment2.springboot.assessment2.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assessment2.springboot.assessment2.response.Requestuser;
import com.assessment2.springboot.assessment2.response.ResponseUser;
import com.assessment2.springboot.assessment2.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {
	
//	@Autowired
	//private UserService userservice;
	
	@PostMapping("/user")
	public ResponseUser addUser(@Valid @RequestBody Requestuser user) {
		UserService userservice= new UserService();
		return userservice.addOneUser(user);
	}
	
}
