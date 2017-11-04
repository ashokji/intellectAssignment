/**
 * 
 */
package com.intellectassig.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intellectassig.entity.User;
import com.intellectassig.service.IUserService;

@RestController
@RequestMapping("/user/api")
public class UserController {

	@Autowired
	private IUserService userService;
	
	
	@PostMapping(value="/create")
	public String  createUser(@RequestBody User user){
		user.setId(UUID.randomUUID().toString());
		if(userService.createUser(user)){
			return "User Created SuccessFully";
		}else{
			return "Failed to Create";
		}
	}
	
	@PutMapping(value="/update/{userId}")
	public void updateUser(@RequestBody User user, @PathVariable String userId){
		userService.updateUser(user,userId);
	}
	
	@DeleteMapping(value="/delete/{userId}")
	public void deleteUser(@PathVariable String userId){
		userService.daleteUser(userId);
	}
	
	@GetMapping(value="/hello")
	public String hello(){
		return "Hello world !";
	}
}