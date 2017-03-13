package com.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.shop")
public class OnLineShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnLineShopApplication.class, args);
	}
}
