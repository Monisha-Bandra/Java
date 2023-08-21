package com.kodnest.training.java;

import java.util.Scanner;


public class PowerofMath {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter the base");
        int base = scan.nextInt();
        
        System.out.print("Enter the exponent");
        int exponent = scan.nextInt();

        double power = Math.pow(base, exponent);
        System.out.println(base + " to the power " + exponent + " is " + power);
        
        scan.close();
    }
}
