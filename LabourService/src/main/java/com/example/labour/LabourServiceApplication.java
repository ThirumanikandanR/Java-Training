package com.example.labour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.labour","com.example.data"})
public class LabourServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabourServiceApplication.class, args);
	}

}
