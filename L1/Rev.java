package L1;

import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int b;
		int rev = 0;
		while (n != 0) {
			b = n % 10;
			n = n / 10;
			rev = rev * 10 + b;
		}
		System.out.println(rev);

	}

}
