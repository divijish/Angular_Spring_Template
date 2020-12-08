package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {

	
	@GetMapping("/index")
	public String homePage() {
		
		return "index.html";
	}

}
