package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleDevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleDevOpsApplication.class, args);
		System.out.println(display());
	}
	public static String display() {
		return "DevOps Graded.........";
	}

}
