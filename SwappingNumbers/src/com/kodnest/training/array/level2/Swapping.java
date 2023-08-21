package com.kodnest.training.array.level2;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("The Numbers Before Swapping Are " + num1 + " " + num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("The Numbers After Swapping Are " + num1 + " " + num2);
		
		scan.close();
	}

}
