package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdditionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdditionApplication.class, args);
		
		Addition a=new Addition();
		a.add(23,45);
	}

}

// Maven Build
/*
 * right click on project  run as maven build then type any command 
 * we cane use miltiple at time
 
Clean = delete jar/war in target folder ...
compile = compileing project java to .class file
test = junit ..run and test all tests
package =Packaging of project into jar/war in target folder
install =  project add in repository to use others

*/