package com.paymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PaymentserviceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println("Starting");
		SpringApplication.run(PaymentserviceApplication.class, args);
	}

}
