package com.Charuli.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Charuli.Model.User;
import com.Charuli.Service.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserService us;
	
	
	@PostMapping("/reg")
	public User registration(@RequestBody User user) {
		return us.registration(user);
		
	}
	
	@PostMapping("/create-acc")
	public String createAccount(@RequestBody User user) {
		return us.createAccount(user);
	}
	
}
