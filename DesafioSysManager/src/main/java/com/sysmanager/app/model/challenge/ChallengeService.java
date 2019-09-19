package com.sysmanager.app.model.challenge;

import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

import com.sysmanager.domain.BaseChallengeService;

@Service
public class ChallengeService {

	private SortedSet<BaseChallengeService> challengeServices = new TreeSet<>();
	
	public ChallengeService(SortedSet<BaseChallengeService> challengeServices) {
		this.challengeServices = challengeServices;
	}
	
	public void executeAllChallenges() 
	{
		for (BaseChallengeService baseChallengeService : challengeServices) 
		{
			if (baseChallengeService != null) 
			{
				System.out.println();
				baseChallengeService.executeChallenge();
			}
		}
	}
}
