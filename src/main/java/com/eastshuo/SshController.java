package com.eastshuo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SshController {
	@RequestMapping("/helloWorld")
	public String kk(){
		return "lllllllllllllllll";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SshController.class, args);
	}
}
