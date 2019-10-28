package com.nt.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
  
	public WelcomeController() {
        System.out.println("WelcomeController-0-param constructor");
	}
	
	@RequestMapping("/home")
	public String showHome() {
		System.out.println("WelcomeController.showHome()");
		return "welcome";
	}
}
