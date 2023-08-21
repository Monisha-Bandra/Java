package com.kodnest.training.java;

import java.util.Scanner;

public class Main {

	public static void getProduct(String productCode) {
		
		String productName = " ";
		
		if(productCode.equals("P01")) {
			productName = "Coco Cola";
		}
		else if(productCode.equals("P02")) {
			productName = "Pepsi";
		}
		else if(productCode.equals("P03")) {
			productName = "Fanta";
		}
		else {
			productName = "Invalid Code";
		}
		
		System.out.println("ProductName: "  + productName); 
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Product Code");
		String code = scan.next();
		getProduct(code);
		
		scan.close();
	}
}