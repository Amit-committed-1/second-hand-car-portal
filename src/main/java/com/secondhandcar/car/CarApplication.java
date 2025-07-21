package com.secondhandcar.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {
                int x = 1000;
		float y = 10.45f;
		boolean b = true;
		SpringApplication.run(CarApplication.class, args);
	}

}
