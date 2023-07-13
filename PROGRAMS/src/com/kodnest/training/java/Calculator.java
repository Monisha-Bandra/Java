package com.kodnest.training.java;

import java.util.Scanner;

public class Calculator {
	
	Scanner scan = new Scanner(System.in);

	void Addition() {
		System.out.println("Enter 2 numners for Addition");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Addition of" + a + "and" + b + "is" + (a+b));
	}
	
	void Subtraction() {
		System.out.println("Enter 2 numners for subtraction");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Subtraction of" + a + "and" + b + "is" + (a-b));
	}
	
	void Multiplication() {
		System.out.println("Enter 2 numners for Multiplication");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Multiplication of" + a + "and" + b + "is" + (a*b));
	}
	
	void Division() {
		System.out.println("Enter 2 numners for Division");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Division of" + a + "and" + b + "is" + (a/b));
	}
	
	void findRemainder() {
		System.out.println("Enter 2 numners for Modular Division");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Remainder of" + a + "and" + b + "is" + (a%b));
	}
	
	void findSquare() {
		System.out.println("Enter a number for finding the Square of a number");
		int a = scan.nextInt();
		System.out.println("Square of" + a  + "is" + (a*a));
	}
	
}
