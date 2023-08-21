package com.kodnest.training.twodarray;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		int arr[][][]=new int[scan.nextInt()][][];
		
		System.out.println("Enter 1-D length");	
		
		for(int i = 0; i <= arr.length-1; i++) {
				System.out.println("Enter the 2-D length for the 1-D" + i);
				arr[i] = new int[scan.nextInt()][];
				
				for(int j = 0; j <= arr[i].length-1; j++) {
					System.out.println("Enter the 3-D length for the 2-D of 1-D length");
					arr[i][j] = new int[scan.nextInt()];
					}
				}
				
		for(int i=0;i<=arr.length-1;i++)

		{
		
			for(int j=0;j<=arr[i].length-1;j++)

			{
				for(int k = 0; k <= arr[i][j].length-1; k++) {
					
				System.out.println("Enter the Marks of School " + i + " Class " + j + "Student" + j);

				arr[i][j][k]=scan.nextInt();

			}

		}

		System.out.println("Array Contents Are.....");

		for(int i=0;i<=arr.length-1;i++)

		{

			for(int j=0;j<=arr[i].length-1;j++)

			{
				for(int k = 0; k <= arr[i][j].length-1; k++ ) {
					
				System.out.print(arr[i][j][k] + " ");
				}
				
				System.out.println();
			}

			System.out.println(------------);
		}
	}
}

		

	
