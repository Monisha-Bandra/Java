package com.kodnest.training.java;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the no.of elements");
			int n  = scan.nextInt();
			int [] arr = new int[n];
			System.out.println("Enter" + n + " elements");
			for(int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			System.out.println("The Array is " + Arrays.toString(arr));
			
			scan.close();	
		}
}


