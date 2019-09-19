package com.sysmanager.domain.fibonacci;

import org.springframework.stereotype.Service;

import com.sysmanager.domain.BaseChallengeService;

@Service
public class FibonacciService extends BaseChallengeService {

	public void printSequenceByNumberOfInteractions(int numberInteractions) 
	{	
		for (int i = 0; i < numberInteractions; i++) {
            System.out.println("[" + i + "]:" + Fibonacci.getFibonacciValue(i));
        }
	}
	
	@Override
	public void executeChallenge() 
	{
		System.out.println("# DESAFIO 3 - SEQUÊNCIA DE FIBONNACI ##");
		printSequenceByNumberOfInteractions(10);		
	}
	
	@Override
	public int order() {
		return 3;
	}
	
}
