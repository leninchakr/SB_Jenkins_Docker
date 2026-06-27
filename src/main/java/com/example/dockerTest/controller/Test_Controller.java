package com.example.dockerTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Test_Controller {

	@GetMapping("/test/1")
	public String test_1() {
		return "Test-1";
	}

	@GetMapping("/test/2")
	public String test_2() {
		return "Test-2";
	}

	@GetMapping("/test/3")
	public String test_3() {
		return "Test-3g";
	}

}
