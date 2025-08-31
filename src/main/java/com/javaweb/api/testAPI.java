package com.javaweb.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testAPI {
	@GetMapping(value="/test")
	public String test () {
		return "success";
	}
}
