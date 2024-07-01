package com.org.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CollegeMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(CollegeMicroservice1Application.class, args);
	}
	
	  @Bean
	  @LoadBalanced 
	  public RestTemplate restTemplate() { return new RestTemplate();
	  
	  }

}
