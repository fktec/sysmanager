package com.sysmanager.domain.fibonacci;

public class Fibonacci {

	public Fibonacci() {}
	
	public static long getFibonacciValue(int num) 
	{										
		int current = 0;
        int past = 0;
  
        for (int i = 1; i <= num; i++) 
        {
            if (i == 1) {
                current = 1;
                past = 0;
            } else {
                current += past;
                past = current - past;
            }
        }
        return current;
	}
}
