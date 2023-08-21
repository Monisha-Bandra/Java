package com.kodnest.training.java;

import java.util.Arrays;
import java.util.Scanner;


public class Array4 {
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the size of the array: ");
	        int size = scan.nextInt();
	        int[] arr = new int[size];
	        
	        System.out.println("Enter the value to fill the array");
	        int value = scan.nextInt();
	        Arrays.fill(arr, value);
	        System.out.println("The array is filled with");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
}
