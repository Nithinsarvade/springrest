package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class control {
	@RequestMapping("/home")
	public String home() {
		return "Helloworld...!";
	}
	
	

}
