package saturday_marathon;

import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = doubleTheNumber(15);
		System.out.println(num);
	}
	
		public static int doubleTheNumber(int num) {
			return num * 2;
		}
}
