package com.kodnest.training.array;

import java.util.Scanner;

public class ReplaceNegativesToZeroz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Enter the length of an Array");
			int n[] = new int[scan.nextInt()];
			
			System.out.println("Enter the elements to store");
			
			for(int i = 0; i <= n.length-1; i++) {
				n[i] = scan.nextInt();
			}
			
			System.out.println("The Resultant Array is : ");
			
			for(int i = 0; i <= n.length-1; i++) {
				
				if(n[i] < 0) {
					n[i] = 0;
				}
				System.out.print(n[i] + " ");
			}
			scan.close();
	}

}
