package com.kodnest.training.arrays;

import java.util.Scanner;

public class ArraySumApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the  First Array length");
		int []arr1 = new int[scan.nextInt()];
		
		System.out.println("Enter the First Array Elements");
		for(int i = 0; i <= arr1.length-1; i++) {
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("Enter the Second Array Length");
		int arr2[] = new int[scan.nextInt()];
		
		System.out.println("Enter the Second Array Elements");
		for(int i = 0; i <= arr2.length-1; i++) {
			arr2[i] = scan.nextInt();
		}
		
		System.out.println("First Array ===>");
		for(int x : arr1) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		System.out.println("Second Array ===>");
		for(int y : arr1) {
			System.out.print(y + " ");
		}
		System.out.println();
		
		Sum sum = new Sum();
		int res[] = sum.findSum(arr1, arr2);
		
		System.out.println("Resultant Array is");
		for(int s : res) {
			System.out.print(s + " ");
		}
		scan.close();
	}

}
