package com.ig.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("theTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	@Qualifier("happyFortuneService")
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
