package com.kodnest.training.java;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the first array");
        int n1 = scan.nextInt();
        int[] arr1 = new int[n1];
        
        System.out.println("Enter the elements of first array");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        
        System.out.println("Enter the size of the second array");
        int n2 = scan.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter the elements of the second array");
       
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }

        boolean isEqual = Arrays.equals(arr1, arr2);

        if (isEqual) {
            System.out.println("The two arrays are equal");
        } else {
            System.out.println("The two arrays are not equal");
        }
	}
}
