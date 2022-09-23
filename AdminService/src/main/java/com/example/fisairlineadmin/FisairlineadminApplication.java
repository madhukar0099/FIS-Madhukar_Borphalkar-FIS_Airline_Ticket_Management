package com.example.fisairlineadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(value="com.example.fisairlineadmin.service")
@EnableEurekaClient
public class FisairlineadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(FisairlineadminApplication.class, args);
	}
	

}
