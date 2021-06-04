package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleDevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleDevOpsApplication.class, args);
	}
	public String display() {
		return "DevOps Graded.........";
	}

}
