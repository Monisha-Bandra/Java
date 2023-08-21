package com.kodnest.array.level1;

import java.util.Scanner;

public class Program2 {

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
		for(int a : arr) {
			int addedValue = a + 5;
			System.out.print(addedValue+ " ");
		}
		scan.close();

	}

}
