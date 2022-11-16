package com.mega.billions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mega.billions")
public class CollegeConfig {
	
	public Teacher mathTeacher() {
		return new MathTeacher();
	}
	
	public Principal principalBean() {
		return new Principal();
		
	}

	public College collegeBean() {
		College clg = new College();
		clg.setTeacher(mathTeacher());
		clg.setPrincipal(principalBean());

		return clg;
	}
}
