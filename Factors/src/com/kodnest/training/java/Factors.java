package com.kodnest.training.java;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = scan.nextInt();
		
		
		System.out.println("The factots of " + n);
		for(int i = 1; i <= n; i++) {
			
			if(n%i == 0) {
				System.out.println(i);
			}
		}

	}

}
