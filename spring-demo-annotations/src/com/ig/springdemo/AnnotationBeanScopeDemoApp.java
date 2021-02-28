package com.ig.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach_DefaultBeanID", Coach.class);
		
		
		Coach alphaCoach = context.getBean("tennisCoach_DefaultBeanID", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
				
		System.out.println("Pointing to same object: " +result);
		
		System.out.println("Memory location for theCoach: " +theCoach);
		System.out.println("Memory location for alphaCoach: " +alphaCoach);
		
		context.close();
	}

}
