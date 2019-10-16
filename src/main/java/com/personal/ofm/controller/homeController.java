package com.personal.ofm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class homeController {
	
	@GetMapping("vista")
	public String home() {
		return "/Home/home";
	}
}
