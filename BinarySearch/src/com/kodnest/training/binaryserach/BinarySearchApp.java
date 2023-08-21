package com.kodnest.training.binaryserach;

import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of an Array");
		int []arr = new int[scan.nextInt()];
		
		System.out.println("Enter the " + arr.length + " no.of elements to store");
		
		for(int i = 0; i <= arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter the key to search");
		
		int key = scan.nextInt();
		
		BinarySearch binarysearch = new BinarySearch();
		int res = binarysearch.findKey(arr, key);
		
		if(res == 1) {
			System.out.println("Key Found");
		}
		else { 
			System.out.println("Key Not Found");
		}
		scan.close();
	}

}
