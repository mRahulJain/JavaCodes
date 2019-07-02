package H_W;

import java.util.Scanner;

public class ChewBacca {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		long N= s.nextLong();

		int digits = numberOfDigits(N);
		long pow = 1;
		long r;
		int count = 1;
		long ans = 0;

		while (N != 0) {
			long rem =  N % 10;
			if (count == digits) {
				r = 9 - rem;
				if (r == 0) {
					ans = ans + rem * pow;
				} else if (r < rem) {
					ans = ans + r * pow;
				} else {
					ans = ans + rem * pow;
				}
			} else {
				r = 9 - rem;
				if (r < rem) {
					ans = ans + r * pow;
				} else {
					ans = ans + rem * pow;
				}
			}
			pow = pow * 10;
			N = N / 10;
			count++;
		}
		System.out.println(ans);

	}

	public static int numberOfDigits(long num) {
		int count = 0;
		while (num != 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
//	public static int Decimal_to_Binary(int n)
//	{
//		int binary=0;
//		int rem=0;
//		int power=1;
//		while(n!=0)
//		{
//			rem=n%2;
//			binary=binary+rem*power;
//			power=power*10;
//			n=n/2;
//		}
//		return binary;
//	}

}
