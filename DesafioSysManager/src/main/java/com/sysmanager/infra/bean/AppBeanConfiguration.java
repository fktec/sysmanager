package com.sysmanager.infra.bean;

import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sysmanager.app.model.challenge.ChallengeService;
import com.sysmanager.domain.BaseChallengeService;
import com.sysmanager.domain.crypt.CryptService;
import com.sysmanager.domain.fibonacci.FibonacciService;
import com.sysmanager.domain.primenumber.PrimeNumberService;

@Configuration
public class AppBeanConfiguration {

	@Autowired
	private PrimeNumberService primeNumberService;
	
	@Autowired
	private CryptService cryptService;
	
	@Autowired
	private FibonacciService fibonacciService;
	
	@Bean
	public ChallengeService challengeServiceBean() 
	{
		SortedSet<BaseChallengeService> challengeServices = new TreeSet<>();
		challengeServices.add(primeNumberService);
		challengeServices.add(cryptService);
		challengeServices.add(fibonacciService);
		
		return new ChallengeService(challengeServices);
	}
}
