package Pattern;

import java.util.Scanner;

public class Pattern_19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int nst = 1;
		int nsp = N - 1;
		int row = 1;
		int r = 1;
		int i;
		int p;
		while (row <= 2 * N - 1) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
			int cst = 1;
			if (row <= N) {
				i = row;
				p = i;
			} else {
				i = N - row % N;
				p = i;
			}
			while (cst <= 2 * r - 1) {

				if (cst < p) {
					System.out.print(i + "\t");
					i++;
				} else {
					System.out.print(i + "\t");
					i--;
				}
				cst++;
			}
			if (row < N) {
				nst = nst + 2;
				r++;
				nsp--;
			} else {
				nst = nst - 2;
				r--;
				nsp++;
			}
			System.out.println();
			row++;
		}

	}

}
