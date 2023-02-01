package com.example.demoporject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSis {

	@GetMapping("/hihi")
	public String jimi(@RequestParam(name="name") String name)
	{
		return name.toUpperCase();
	}
}
