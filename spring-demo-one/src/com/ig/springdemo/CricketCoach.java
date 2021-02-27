package com.ig.springdemo;

public class CricketCoach implements Coach{
	private String emailAddress;
	private String team;
	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Cricket coach: inside no arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CC: inside setter");
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach: setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Cricket coach: setTeam");
		this.team = team;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {

		return "Bowl 10 overs";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Criket Coach:" + fortuneService.getFortune();
	}

}
