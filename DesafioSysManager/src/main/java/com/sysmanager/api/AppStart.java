package com.sysmanager.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.sysmanager.app.model.challenge.ChallengeService;

@Component
public class AppStart implements ApplicationRunner {

	@Autowired
	private ChallengeService challengeService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		challengeService.executeAllChallenges();
	}

}
	