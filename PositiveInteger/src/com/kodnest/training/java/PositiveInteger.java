package com.kodnest.training.java;

import java.util.Scanner;

public class PositiveInteger {

	public static void main(String[] args) {
		// Instantiate Scanner
		// Ask the user to enter the array length
		// Create an integer array by accepting the length
		// Ask user to enter the array length no.of elements
		// 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of an array");
	
		int []arr = new int[scan.nextInt()];
		
		System.out.println("Enter " + arr.length + " elements to store in an array");
		
		for(int i = 0; i <= arr.length-1; i++) {
			
			arr[i] = scan.nextInt();
		}
		
		for(int x : arr) {
			
			if(x >= 0) {
				System.out.print("The Positive Integers : " + x);
			}
		}
			
		scan.close();
	}

}
