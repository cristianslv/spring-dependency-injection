package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// create a no-argument constructor
	public CricketCoach() {
		System.out.print("CricketCoach: inside no-arg constructor");
	}

	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.print("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
