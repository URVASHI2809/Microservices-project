package com.rakuten.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/print")
public class PrintController {
	@GetMapping
	String print() {
		return "printed";
	}
	@PostMapping
	String request() {
		return "Received request";
	}
}
