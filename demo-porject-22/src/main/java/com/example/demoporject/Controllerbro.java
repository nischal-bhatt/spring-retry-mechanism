package com.example.demoporject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerbro {

	@Autowired
	ServiceClass sc;
	
	@GetMapping("/hey")
	public String sendToAnotherService()
	{
		
		return sc.callAnotherApi();
		
		
		
	}
	
}
