package com.codewithshan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//Load the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve the spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check to see if they are the same 
		boolean result = (theCoach == alphaCoach);
		System.out.println("Poiting to the same object:" + result);
		System.out.println("\nMemory location for theCoach:"+theCoach);
		System.out.println("\nMemory location for theCoach:"+alphaCoach+"\n");
		
		//close the context
		context.close();
	}

}
