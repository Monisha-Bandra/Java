package com.kodnest.training.sorting;

public class SelectionSort {

	void Sort(int[]arr) {
		int min, pos, temp;
		for(int i = 0; i <= arr.length-2; i++) {
			min = arr[i];
			pos = i;
			
			for(int j = i + 1; j <= arr.length-1; j++) {
				if(arr[j] < min) {
					min = arr[j];
					pos = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
	}
}
