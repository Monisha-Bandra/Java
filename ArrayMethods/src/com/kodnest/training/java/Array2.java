package com.kodnest.training.java;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no.of elements in an array");
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter the elements of an array");
        
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        scan.close();
        
        int hashcode = Arrays.hashCode(arr);
        System.out.println("The hash code of the array is: " + hashcode);
	}
}

   