package com.example.JenkinsSonarQube;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	// considered a security hotspot by SonarQube
	@CrossOrigin
	@GetMapping("/hello")
	public String get(@RequestParam(defaultValue = "anonymous") String name) {
		return "Hello " + name;
	}
}
