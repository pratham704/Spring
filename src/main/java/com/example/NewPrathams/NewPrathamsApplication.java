package com.example.NewPrathams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class NewPrathamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewPrathamsApplication.class, args);
	}
	@RestController
	public static class HeyController {


		@GetMapping("/")
		public String emptybro() {
			return "wassup";
		}

		@GetMapping("/hey")
		public String getHey() {
			return "Pratham here";
		}
	}
}
