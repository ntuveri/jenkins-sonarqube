package com.example.jenkins_sonarqube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	// fixed a security hotspot by removing @CrossOrigin
	@GetMapping("/hello")
	public String get(@RequestParam(defaultValue = "anonymous") String name) {
		return "Hello " + name;
	}
}
