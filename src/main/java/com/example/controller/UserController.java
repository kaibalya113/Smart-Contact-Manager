package com.example.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.User;

@Controller
public class UserController {
	
	@RequestMapping(value= "/do_register", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, Model model) {
		
		user.setRole("ROLE_USER");
		user.setActive(true);
		System.out.println("User: "+ user);
		return "signup";
	}
}
