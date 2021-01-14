package com.example.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.UserRepository;
import com.example.helper.message;
import com.example.model.User;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@RequestMapping(value= "/do_register", method=RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") User user, Model model, BindingResult result ,
			HttpSession session) {
		
		try {
			if(result.hasErrors()) {
				model.addAttribute("user", user);
				return "signup";
			}
			
			user.setRole("ROLE_USER");
			user.setActive(true);
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			
			user.setImageUrl("user.jpeg");
			User user1 = this.userRepository.save(user);
			System.out.println("User: "+ user1);
			
			model.addAttribute("user",new User());
			session.setAttribute("message", new message("Sucessfully Registered", "alert-sucess" ));
			return "signup";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("user", user);
			session.setAttribute("message", new message("something went wrong"+e.getMessage(), "alert-danger" ));
			return "signup";
		}
	}
}
