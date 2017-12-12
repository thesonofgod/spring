package com.codewithshan.springdemo;

public class BaseballCoach implements Coach {
	
	public String getDailyWorkout() {
		return  "Spend 30 min on batting practice";
	}
	
	//define a private 
	private FortuneService fortuneService;

	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune	
		return fortuneService.getFortune();
	}

}
