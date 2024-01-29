package com.divya.dockerone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {
	 @GetMapping("/print")
	  public String simpleMethod() {
	    
	    return "HELLO WORLD !!";
	  }

}
