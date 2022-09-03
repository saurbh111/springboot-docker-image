package com.sample.springbootdockerimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootDockerImageApplication {

	@GetMapping("/")
	public String runImage(){
		return "docker image created and running";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerImageApplication.class, args);
	}

}
