package com.kodnest.training.linearsearch;

import java.util.Scanner;

public class SearchApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Array Length");
		int []arr = new int[scan.nextInt()];
		
		System.out.println("Enter " + arr.length + " elements ");
		
		for(int i = 0; i <= arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the Key element to serach");
		int key = scan.nextInt();
		
		Search search = new Search();
		
		boolean res = search.isPresent(arr,  key);
		
		if(res == true) {
			System.out.println("Key Found");
		}
		else {
			System.out.println("Key Not Found");
		}
		
		scan.close();
	}
}

