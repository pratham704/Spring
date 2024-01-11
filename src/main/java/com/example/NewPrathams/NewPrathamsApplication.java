package com.example.NewPrathams;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class NewPrathamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewPrathamsApplication.class, args);
	}

	@RestController
	public static class HeyController {

		@GetMapping("/")
		public String emptyBro() {
			return "wassup";
		}

		@GetMapping("/hey")
		public String getHey() {
			return "Pratham here";
		}

		@PostMapping("/add")
		public int addNumbers(@RequestParam int num1, @RequestParam int num2) {
			return num1 + num2;
		}



	}
}
