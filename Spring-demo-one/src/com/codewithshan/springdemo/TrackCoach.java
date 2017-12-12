package com.codewithshan.springdemo;

public class TrackCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout(){
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it" + fortuneService.getFortune();
	}
	
	//Add an init method
	public void doMyStartupStuff(){
		System.out.println("trackcoach: inside method doMyStartupStuff");
	}
	//Add a destroy method
	public void doMyCleanupStuff(){
		System.out.println("trackcoach: inside method doMyCleanupStuff");
	}
	
	
}
