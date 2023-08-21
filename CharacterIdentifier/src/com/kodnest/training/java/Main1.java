package com.kodnest.training.java;

import java.util.Scanner;

public class Main1 {

	public static void identifyChecker(char ch) {
		if(Character.isDigit(ch)) {
			System.out.println("Entered chracter is " + ch + " is a Digit");
		}
		else if(!Character.isLowerCase(ch)) {
			System.out.println("Entered character is " + ch + " is a Special Character");
		}
		else {
			switch(Character.toLowerCase(ch)) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				if(Character.isLowerCase(ch)) {
					System.out.println("Entered character is " + ch + " Lower Case Vowel");
				}
				else {
					System.out.println("Entered character is " + ch + " Upper Case Vowel");
				}
				break;
				default :
					if(Character.isLowerCase(ch)) {
						System.out.println("Entered character is " + ch + " Lower Case COnsonant");
					}
					else {
						System.out.println("Entered character is " + ch + " Upper Case Consonant");
					}	
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = scan.next().charAt(0);
		identifyChecker(ch);
		
		scan.close();
	}

}
