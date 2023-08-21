package com.kodnest.training.array;

public class ArraySum {

	int findSum(int []arr) {
		
		int sum = 0;
		
		for(int i = 0; i <= arr.length-1; i++) { 
			sum += arr[i];
		}
		return sum;
	}
}
