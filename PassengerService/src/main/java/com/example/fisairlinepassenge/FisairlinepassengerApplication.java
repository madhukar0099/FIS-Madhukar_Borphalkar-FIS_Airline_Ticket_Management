package com.example.fisairlinepassenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FisairlinepassengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FisairlinepassengerApplication.class, args);
	}
	

}
