package com.kodnest.arraymerge;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first array length");;
		
		int arr1[] = new int[scan.nextInt()];
		
		System.out.println("Enter the elements of first array");
		for(int i = 0; i <= arr1.length-1; i++) {
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("Enter the second array length");
		int arr2[] = new int[scan.nextInt()];
	
		System.out.println("Enter the elements of second array");
		for(int i = 0; i <= arr2.length-1; i++) {
			arr2[i] = scan.nextInt();
		}
		
		System.out.println("First Array ====> ");
		for(int x : arr1) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		System.out.println("Second Array ====> ");
		for(int a : arr1) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		Merge merge = new Merge();
		int res[] = merge.mergeArray(arr1, arr2);
		
		System.out.println("Merged Array ===>");
		for(int m : res) {
			System.out.print(m + " ");
		}
		
		scan.close();
	}
}
