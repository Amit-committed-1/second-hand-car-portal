package com.secondhandcar.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {
                int x = 1000;
		String name = "Mike";
		String email = "mike@gmail.com";
		String mobile = "9337364533"
		SpringApplication.run(CarApplication.class, args);
	}

}
