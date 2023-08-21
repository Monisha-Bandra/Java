package com.kodnest.training.java;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a number");
        int n = scan.nextInt();
        int absoluteValue = Math.abs(n);
        System.out.println("The absolute value of " + n + " is " + absoluteValue);
        
        scan.close();
        
    }
}

