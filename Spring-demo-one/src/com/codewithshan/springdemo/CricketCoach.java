package com.codewithshan.springdemo;

public class CricketCoach implements Coach {

	//setting up new fields for email id and team
	
	private String team;
	private String email;
	
	
	private FortuneService fortuneService;
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("CricketCoach:Set Team Name");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		System.out.println("CricketCoach:Set email address");
	}

	@Override
	public String getDailyFortune() {
		return "today is your luckiest day";
	}

//create a no args constructor
	public CricketCoach(){
		System.out.println("CricketCoach: inside no-arg Constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
		
	}
//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach:Setter method");
		this.fortuneService = fortuneService;
	}
	
	
}
