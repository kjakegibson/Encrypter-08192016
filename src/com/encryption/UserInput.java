package com.encryption;

import java.util.Scanner;


public class UserInput {

	static Scanner sc = new Scanner(System.in);
	static String encrypted = null;
	static String input = null;
	

	
	private static void userInput() {
		
		System.out.println("Hey y'all! This here's an encryption tool!."
				+ "\nPlease enter a message to encrypt.\n");
		input = sc.nextLine();
		
	}
	
	public static void main(String[] args) {
		
		userInput();
		Encryption.encryptor(input);
		
		}
	
	
	
}

