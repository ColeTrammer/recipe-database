package org.jointheleague.recipedatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecipeDatabaseApplication {

	@SuppressWarnings("unused")
	@Autowired
	private DataLoader dataLoader;
	
	public static void main(String[] args) {
		SpringApplication.run(RecipeDatabaseApplication.class, args);
	}
}
