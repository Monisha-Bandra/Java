package com.kodnest.training.array.level2;

import java.util.Scanner;

public class Program1 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the length of the array");
			
			int []arr = new int[scan.nextInt()];
			
			System.out.println("Enter " + arr.length + " elements to store in an array");
			
			for(int i = 0; i <= arr.length-1; i++) {
				arr[i] = scan.nextInt();
			}
		
			for(int x : arr) {
				System.out.println(x + " ");
			}
			
			System.out.println("----------------------------");
			
			System.out.println("Enter 2 indexes whose elements need to be swapped");
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			int temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
			
			for(int a : arr) {
				System.out.print(a + " ");
			}
			
			scan.close();
	}

}
