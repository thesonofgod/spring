package com.codewithshan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	
	public static void main(String[] args){
		//load the spring config file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from the spring container
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		// call method on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		//close the connection
		context.close();
	}
}
