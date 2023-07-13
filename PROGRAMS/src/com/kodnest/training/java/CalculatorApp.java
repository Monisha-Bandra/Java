package com.kodnest.training.java;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Calculator cal = new Calculator();
		
			System.out.println("Hello User! Welcome to the Calculator App...");
			System.out.println("+ ----> Addition");
			System.out.println("- ----> Subtraction");
			System.out.println("* ----> Multiplication");
			System.out.println("/ ----> Division");
			System.out.println("% ----> Remainder");
			System.out.println("^ ----> Square");
			System.out.println("! ----> Stop");
			
			System.out.println("Enter your choice :");
			char ch = scan.next().charAt(0);
			
			while(true) {
			
				switch(ch) {
				
				case '+' : cal.Addition();
					break;
				case '-' : cal.Subtraction();
					break;
				case '*' : cal.Multiplication();
					break;
				case '/' : cal.Division();
					break;
				case '%' : cal.findRemainder();
					break;
				case '^' : cal.findSquare();
					break;
				case '!' : System.out.println("Aree yaar pls go to nearby Eye Hospital");
					return;
				default : System.out.println("Tata Bye Bye See Uuuuuu");
						
				}
			}
	}
	
}

		


		
		