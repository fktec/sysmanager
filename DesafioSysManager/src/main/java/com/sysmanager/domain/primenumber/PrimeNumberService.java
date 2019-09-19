package com.sysmanager.domain.primenumber;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.sysmanager.domain.BaseChallengeService;

@Service
public class PrimeNumberService extends BaseChallengeService {

	public void printHighestPrimeNumberByNumbers(int ...numbers) 
	{	
		System.out.println("Números = " + Arrays.toString(numbers));
		Integer highestPrimeNumber = PrimeNumber.getHighestPrimeNumberByNumbers(numbers);
		System.out.println("Maior número primo = " + highestPrimeNumber);
	}
	
	@Override
	public void executeChallenge() 
	{
		System.out.println("# DESAFIO 1 - MAIOR NÚMERO PRIMO ##");
		printHighestPrimeNumberByNumbers(11, 13, 5, 54);
	}	
	
	@Override
	public int order() {
		return 1;
	}
}
