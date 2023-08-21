package com.kodnest.array.level1;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of the array");
		int length = scan.nextInt();
		
			int []arr = new int[length];
			
			for(int i = 0; i <= arr.length-1; i++) {
				System.out.println("Enter the element " + i);
				arr[i] = scan.nextInt();
			}
			System.out.println("The Array Contents Are...");
			for(int i = 0; i <= arr.length-1; i++) {
				System.out.print(arr[i] + " ");
			}
			scan.close();
	}
}