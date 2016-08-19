package com.encryption;

public class Encryption {
	

	
	public static void encryptor(String message) {
		
		char letter;
		
		for (int i = 0; i < message.length(); i++){
			letter = message.charAt(i);
			int ascii = (int) letter;
			
			System.out.print(ascii + " ");
		}
			
	}

}
