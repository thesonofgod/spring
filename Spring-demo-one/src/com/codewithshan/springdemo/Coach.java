package com.codewithshan.springdemo;

public interface Coach {
	
	public default String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}

	public String getDailyFortune();
} 
