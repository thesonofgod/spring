package com.codewithshan.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//spring will automatically register this bean 
@Component //this is the bean id
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFunctionService")
	private FortuneService fortuneService;

	//define a default constructor
public TennisCoach(){
	System.out.println(">>Tennis coach: inside the default constructor");
}

	/*//Creating a setter method 
@Autowired
public void setFortuneService(FortuneService theFortuneService){
	System.out.println(">>Tennis coach: inside the setter method");

	fortuneService =theFortuneService;
}*/

	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "hello tennis coach: Practice your backhand";
	}

	@Override
	public String getDailyFortune() {
		return (fortuneService).getFortune();
	}
	
	
	
}
