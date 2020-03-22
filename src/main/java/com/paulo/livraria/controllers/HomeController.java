package com.paulo.livraria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home/index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "home/login";		
	}
	
	@GetMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("erroLogin", true);
		return "home/login";		
	}
	
}
