package com.kodnest.training.java;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the no.of elements in an array");
	        int n = scan.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array");

	        for (int i = 0; i < n; i++) {
	            arr[i] = scan.nextInt();
	        }

	        scan.close();

	        System.out.println("The original is : "+ Arrays.toString(arr));

	        Arrays.sort(arr);

	        System.out.println("The Sorted array is " + Arrays.toString(arr));
	    }

	}


