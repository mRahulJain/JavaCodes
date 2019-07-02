package L1;

import java.util.Scanner;

public class SUM_ODD_EVEN_PLACE_DIG {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int e = 0;
		int o = 0;
		int i = 1;
		int r;
		while (N != 0) {
			r = N % 10;
			N = N / 10;
			if (i % 2 == 0) {
				e = e + r;
			} else {
				o = o + r;
			}
			i++;
		}
		System.out.println(o);
		System.out.println(e);

	}

}
