package com.sysmanager;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sysmanager.domain.crypt.Crypt;
import com.sysmanager.domain.fibonacci.Fibonacci;
import com.sysmanager.domain.primenumber.PrimeNumber;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void testAppStart() {
		System.out.println("## Realizando testes na aplicação ##");
	}
	
	@Test
	public void testIfFindTheHighestPrimeNumber() 
	{
		Integer highestPrimeNumber = PrimeNumber.getHighestPrimeNumberByNumbers(10, 55, 93, 95);
		Assert.assertEquals(95, highestPrimeNumber, 0);
	}
	
	@Test(expected = RuntimeException.class)
	public void throwRuntTimeExceptionIfNumbersAreNull() {
		PrimeNumber.getHighestPrimeNumberByNumbers(null);
	}
	
	@Test
	public void testIfSequenceFibonacciIsCorrect() 
	{
		long fibonacciValue = Fibonacci.getFibonacciValue(9);
		Assert.assertEquals(34, fibonacciValue, 0);
	}
	
	@Test
	public void testIfTheTextHasBeenEncryptedAndDecrypted() 
	{
		String text = "SysManager";
		String encryptedText = Crypt.encryptText(text);
		String decryptedText = Crypt.decryptText(encryptedText);
		
		Assert.assertEquals(text, decryptedText);
	}
	
}
