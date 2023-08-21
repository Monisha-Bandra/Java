package com.kodnest.training.java;

import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int m = scan.nextInt();
		int n =  scan.nextInt();
		
		//int res = GCD.findGCD(m, n);
		
		System.out.println("The GCD of " + m + " and " + n + " is " + GCD.findGCD(m, n));
		
		scan.close();
	}

}
