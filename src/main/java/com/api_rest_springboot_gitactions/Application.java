package com.api_rest_springboot_gitactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public String saludar(){
		return "Ejemplo de git-action";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
