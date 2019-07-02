package H_W;

import java.util.Scanner;

public class Replace_them_all {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int rem;
		int pow = 1;
		int n = N;
		int res = 0;
		if (n == 0) {
			System.out.println("5");
		} else {
			while (n != 0) {
				rem = n % 10;
				n = n / 10;
				if (rem == 0) {
					rem = 5;
				}
				res = res + rem * pow;
				pow = pow * 10;
			}
			System.out.println(res);
		}
	}

}
