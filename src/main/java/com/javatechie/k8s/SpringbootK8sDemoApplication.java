package com.javatechie.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sDemoApplication {

	@GetMapping("/message")
	public String displayMessage(){
		return "HELLO TEAMS..message1!!";
	}

	@GetMapping("/message1")
	public String displayMessage(){
		return "HELLO TEAMS..message2!!";
	}
	@GetMapping("/message2")
	public String displayMessage(){
		return "HELLO TEAMS..message3!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sDemoApplication.class, args);
	}

}
