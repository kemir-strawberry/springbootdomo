package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("welcome")
	public String welcome(Model model) {
		
		model.addAttribute("name","Tom");
		System.out.print("this is welcome Controller");
		return "index";
	}

}
