package L1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		int i = 1;

		while (a <= N) {
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
			i++;

		}

	}

}
