package com.kodnest;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		
		for(int i = 2; i < n; i++) {
			
			if(n%2 != 0) {
				System.out.println("Given number " + n + " is a Prime");
				return;
			}
			System.out.println("Given number " + n + " is Not a Prime");
			break;
				
		}
		
	}

}
