package com.gmt.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.gmt.*")
public class GymManagementToolApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymManagementToolApplication.class, args);
	}

}
