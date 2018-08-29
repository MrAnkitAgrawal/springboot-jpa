package com.spe.demo.springbootjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spe.demo.springbootjpa.services.TourPackageService;
import com.spe.demo.springbootjpa.services.TourService;

@SpringBootApplication
public class SpringbootJpaApplication implements CommandLineRunner {
	@Autowired
	TourPackageService tourPackageService;
	@Autowired
	TourService tourService;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}
	
	
	
}
