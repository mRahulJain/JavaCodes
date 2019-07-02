package L1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		if (n % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}

	}

}
