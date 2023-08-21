package com.kodnest.training.java;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		int f = 1;
		for(int i = 1; i <= num; i++) {
			f = f * i;
		}
		System.out.println("The factorial is " + f);
	}

}
