package com.kodnest.training.array.level2;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of the array");
		
		int []arr = new int[scan.nextInt()];
		
		System.out.println("Enter " + arr.length + " elements to store in an array");
		
		for(int i = 0; i <= arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		
		Array array = new Array();
		array.printArray(arr);
		
		scan.close();

	}

}
