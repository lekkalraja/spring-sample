package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SampleController {
	
	@GetMapping
	public String sayHi(@RequestParam String name) {
		return "Hello, "+name;
	}
	
	@PostMapping
	@RequestMapping("/save")
	public Employee saveEmp(@RequestBody Employee emp) {
		return emp;		
	}
	
	@PutMapping
	public String getName(@RequestBody Employee emp) {
		return emp.getName();
	}
	
}
