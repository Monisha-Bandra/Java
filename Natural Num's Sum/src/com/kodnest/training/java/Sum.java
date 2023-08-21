package com.kodnest.training.java;

import java.util.Scanner;

public  class Sum {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter N");
		int N = scan.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= N; i++) {
			
			sum = sum + i;
		}
		System.out.println("The sum is " + sum);
		
		

	}

}
