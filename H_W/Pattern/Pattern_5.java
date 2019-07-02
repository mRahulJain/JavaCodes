package Pattern;

import java.util.Scanner;

public class Pattern_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 2 * n - 1;
		int nsp = 0;
		int row = 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nst = nst - 2;
			nsp++;
			row++;
		}
	}
}
