package com.example.Web.Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping("/hello")
	public void doNothing() {
		
	}

}
