package com.rmax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rmax.model.User;
import com.rmax.service.EmployeeService;
import com.rmax.service.UserService;

@Controller
@RequestMapping("/")
@ComponentScan("com.rmax")
public class RmaxController {
	@Autowired
    UserService userService;
	
	@RequestMapping(value="login",method = RequestMethod.GET)
	public String login(ModelMap model) {
		return "login";
	}
	
	@RequestMapping(value="/signUp", method = RequestMethod.GET)
	public String signUp(ModelMap model) {
		return "signUp";
	}
	
	@RequestMapping(value="registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("userRegistration") User user) {
		//@ModelAttribute("userRegistration") User user,
		//@RequestBody MultiValueMap<String, String> userMap
		//User user = new User();
		//user.setName(userMap.getFirst("name"));
		//System.out.println("-->"+userMap.get("name"));
		System.out.println("name-->"+user.getName());
		System.out.println("emain-->"+user.getEmail());
		System.out.println("gender-->"+user.getGender());
		System.out.println("dob-->"+user.getDob());
		System.out.println("mobile-->"+user.getMobile());
		System.out.println("username-->"+user.getUsername());
		System.out.println("password-->"+user.getPassword());
		
		userService.addUser(user);
		//model.addAttribute("message", "User registered successfully");
		
		return "login";
	}
}
