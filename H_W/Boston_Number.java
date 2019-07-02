package H_W;

import java.util.Scanner;

public class Boston_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int digitSum = SumOfDigits(N);
		int factorSum = 0;
		int onum = N;
		for (int i = 2; i <= Math.sqrt(onum); i++) {
			while (N % i == 0) {
				N = N / i;
				factorSum += SumOfDigits(i);
			}
		}

		if (N >= 2) {
			factorSum += SumOfDigits(N);
		}
		System.out.println(digitSum == factorSum);
	}

	public static boolean isPrime(int n) {
		int i = 2;
		while (i <= Math.sqrt(n)) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int SumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum += digit;
			n = n / 10;
		}
		return sum;
	}

}
