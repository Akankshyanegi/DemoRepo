package com.dell.ecom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //used to create RESTful web services 
public class HomeController {
	
	@RequestMapping("/") //used to map web requests onto specific handler classes and/or handler methods
	public String serverUp(){
		return "Server is running on localhost:8080";
		
		
	}

}
