package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.UserRepository;
import com.example.model.User;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		
		model.addAttribute("title", "home");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		
		model.addAttribute("title", "about");
		return "about";
	}
	@RequestMapping("/signup")
	public String signup(Model model) {
		
		model.addAttribute("title", "signup");
		model.addAttribute("user", new User());
		return "signup";
	}

	
	 
}
