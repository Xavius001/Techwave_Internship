package com.example.client.ClientRestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.client.ClientRestApp.dao.ClientVendor;

@SpringBootApplication
public class ClientRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientRestAppApplication.class, args);
	}
	
	//step 1
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public ClientVendor cVendor() {
		return new ClientVendor();
	}


}
