package com.tasif.Test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ssl")
public class TestController {

	@GetMapping
	public String testApi(HttpServletRequest request) {
		System.out.println("\nApi URL :: " + request.getRequestURL());
		return "api works";
	}

	@PostMapping
	public String postApi(@RequestBody String name) {
		return "welcome " + name;
	}
}
