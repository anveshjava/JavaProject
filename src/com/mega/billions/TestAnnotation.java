package com.mega.billions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("bean file loaded");
		College clg = context.getBean("college", College.class);
		System.out.println("college about to start");
		clg.test();
		((AnnotationConfigApplicationContext)context).close();
	}
} 
    