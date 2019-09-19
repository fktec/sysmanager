package com.sysmanager.domain.crypt;

import org.springframework.stereotype.Service;

import com.sysmanager.domain.BaseChallengeService;

@Service
public class CryptService extends BaseChallengeService {

	public void printEncryptAndDecryptText(String text) 
	{
		System.out.println("[TEXTO]: " + text);
		
		String encryptedText = Crypt.encryptText(text);
		System.out.println("[CRIPTOGRAFADO]: " + encryptedText);
		
		String decryptedText = Crypt.decryptText(encryptedText);
		System.out.println("[DESCRIPTOGRAFADO]: " + decryptedText);
	}
	
	@Override
	public void executeChallenge() 
	{
		System.out.println("# DESAFIO 2 - CRIPTOGRAFIA TEXTO ##");
		printEncryptAndDecryptText("SysManager");
	}

	@Override
	public int order() {
		return 2;
	}
}
