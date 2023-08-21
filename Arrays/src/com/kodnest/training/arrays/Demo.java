package com.kodnest.training.arrays;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the no.of Persons ");
		//int n = scan.nextInt();
		
		boolean arr[] = new boolean[scan.nextInt()];
		
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.println(" Is person " + i + " Married ? ");
			arr[i] = scan.nextBoolean();
		}
		
		System.out.println("The Marital status of the presons are...");
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.println("The person " + i + " is Married : " + arr[i]);
		}

	}

}
