package com.kodnest.training.sorting;

import java.util.Scanner;

public class SelectionSortApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[] = new int[scan.nextInt()];
		
		System.out.println("Enter the elements");
		for(int i = 0; i <= arr.length-1; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Array Elements Before Swapping : ");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		SelectionSort selectionsort = new SelectionSort();
		selectionsort.Sort(arr);
		
		System.out.println("Array Elememts After Swapping : ");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		scan.close();

	}

}
