package com.vacomall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerTestSpringBootApplication {

	@RequestMapping("")
	public String index(){
		return "hello, This is a docker test.";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DockerTestSpringBootApplication.class, args);
	}
}
