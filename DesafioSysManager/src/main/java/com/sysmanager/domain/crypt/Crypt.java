package com.sysmanager.domain.crypt;

public class Crypt {
	
	private static final int SECRET_CRYPT_VALUE = 3;

	public Crypt() {}
	
	public static String encryptText(String text) 
	{
		checkText(text);
		
		String encryptedText = "";
		
		for(int i = 0; i < text.length(); i++) 
		{
			int letterNormal = text.charAt(i);
			char encryptedLetter = (char) (letterNormal + SECRET_CRYPT_VALUE);
			
			encryptedText = encryptedText + encryptedLetter;
		}
		return encryptedText;
	}
	
	public static String decryptText(String text) 
	{
		checkText(text);
		
		String decryptedText = "";
		
		for(int i = 0; i < text.length(); i++) 
		{
			int letterNormal = text.charAt(i);
			char encryptedLetter = (char) (letterNormal - SECRET_CRYPT_VALUE);
			
			decryptedText = decryptedText + encryptedLetter;
		}
		return decryptedText;
	}
	
	public static void main (String[] args) 
	{
		String text = "A";
		
		for(int i = 0; i < text.length(); i++) 
		{
			int letterNormal = text.charAt(i);
			System.out.println(letterNormal);
			
			letterNormal += 3;
			System.out.println(letterNormal);
			
			char encryptedLetter = (char) letterNormal; 		
			System.out.println(encryptedLetter);
		}
	}
	
	private static void checkText(String text) 
	{
		if (text == null || text == "")
			throw new RuntimeException("Texto não pode ser nulo ou vazio");
	}
}
;