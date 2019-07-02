package Pattern;

import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int nst=1;
		int nsp=n-1;
		int row=1;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nst++;
			nsp--;
			row++;
		}

	}

}
