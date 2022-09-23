package com.example.fisgateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurations {
	
	@Bean
	public RouteLocator getRoutesLocator(RouteLocatorBuilder rout) {
		return rout.routes()
				.route(p->p.path("/airline/**").uri("lb://adminservice/airline"))
				.route(p->p.path("/airpassenger/**").uri("lb://customer/airpassenger"))
				.build();
	}

}