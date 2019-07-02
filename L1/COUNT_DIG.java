package L1;

import java.util.Scanner;

public class COUNT_DIG {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int Digit = s.nextInt();
		int a;
		int count = 0;
		if (Digit >= 0 && Digit <= 9) {
			while (N != 0) {
				a = N % 10;
				N = N / 10;
				if (a == Digit) {
					count++;
				}
			}
			System.out.println(count);
		} else {
			System.out.println("Enter Digit");
		}

	}

}
