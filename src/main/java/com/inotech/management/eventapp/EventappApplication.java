package com.inotech.management.eventapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@Configuration
//@EnableSwagger2
public class EventappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventappApplication.class, args);
	}
/*	@Bean
	@Primary
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.inotech.management.eventapp.controller"))
				.paths(PathSelectors.any())
				.build();
	}
	*/

}
