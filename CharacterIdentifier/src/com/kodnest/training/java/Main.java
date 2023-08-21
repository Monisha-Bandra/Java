package com.kodnest.training.java;

import java.util.Scanner;

public class Main {

	public static void identifyCharacter(char ch) {
		if(Character.isLowerCase(ch)) {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch ==  'o' || ch ==  'u') {
				System.out.println("Lower Case Vowel");
			}
			else {
				System.out.println("Lower Case COnsonant");
			}
		}
		else if(Character.isUpperCase(ch)) {
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println("Upper Case Vowel");
			}
			else {
				System.out.println("Upper Case Consonant");
			}
		}
		else if(Character.isDigit(ch)) {
			System.out.println("digit");
		}
		else {
			System.out.println("Special Character");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = scan.next().charAt(0);
		identifyCharacter(ch);
		
		scan.close();
	}
	
}

