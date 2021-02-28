
package com.ig.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach_DefaultBeanID implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach_DefaultBeanID(@Qualifier("happyFortuneService")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	//define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Startup stuff");
	}
	
	//defin destroy method
	@PreDestroy
	public void doMyDestroyStuff() {
		System.out.println("Destroy stuff");
	}

}
