package com.example.icm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class IcmApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcmApplication.class, args);
	}

	@GetMapping("/test")
	public String test() {
		return "xing liu the best";
	}
}
