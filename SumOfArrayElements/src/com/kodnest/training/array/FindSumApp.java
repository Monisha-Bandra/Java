package com.kodnest.training.array;

import java.util.Scanner;

public class FindSumApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the array length");
		
		int arr[] = new int[scan.nextInt()];
		
		System.out.println("Enter " + arr.length + " elements");
		
		for(int i = 0; i <= arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		
		ArraySum arraysum = new ArraySum();
		
		int sum = arraysum.findSum(arr);
		
		System.out.println("The Sum of Array Elements is "  +sum);
		
		scan.close();
	}

}
