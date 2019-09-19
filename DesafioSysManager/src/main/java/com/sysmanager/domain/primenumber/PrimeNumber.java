package com.sysmanager.domain.primenumber;

public class PrimeNumber {

	public PrimeNumber () {}
	
	public static Integer getHighestPrimeNumberByNumbers(int ...numbers) 
	{
		if (numbers == null)
			throw new RuntimeException("Valores não podem ser nulos");
			
		int currentHighest = 0; 
		for (int i = 0; i < numbers.length; i++) 
		{
			int num = numbers[i];
			
			if (num % 2 == 1) 
			{
				if (num > currentHighest)
					currentHighest = num;					
			}
		}
		
		return currentHighest;
	}
}
