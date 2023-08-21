package com.kodnest.training.array;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the no.of elements in an array");
		
		int[] arr = new int[scan.nextInt()];
		
		for(int i = 0; i <= arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		
		SumOfArrayElements elemets  = new SumOfArrayElements();
		
		int sum = SumOfArrayElements.findSum(arr);
		System.out.println("Enter the elements of an array");
		
		System.out.println("The Sum of Array Elements is " + sum);

		scan.close();
	}

}
