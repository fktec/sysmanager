package com.sysmanager.domain;

import java.util.Comparator;

public abstract class BaseChallengeService implements Comparable<BaseChallengeService> {

	public abstract void executeChallenge();
	public abstract int order();
	
	public int compareTo(BaseChallengeService obj) { 
		return Comparator.comparing(BaseChallengeService::order).compare(this, obj);
	}
}
