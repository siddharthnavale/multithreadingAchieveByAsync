package com.multithreading.multithreading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.multithreading.multithreading.sevice.StoringService;

@SpringBootApplication
public class MultithreadingApplication implements CommandLineRunner{
	
	@Autowired
	private StoringService storingService;

	public static void main(String[] args) {
		SpringApplication.run(MultithreadingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		storingService.addValues();
		
	}

}
