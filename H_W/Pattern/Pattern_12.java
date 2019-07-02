package Pattern;

import java.util.Scanner;

public class Pattern_12 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int nst=n;
		int nsp=1;
		int row=1;
		while(row<=2*n+1)
		{
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			if(row<=n)
			{
				nst--;
				nsp=nsp+2;
			}
			else
			{
				nst++;
				nsp=nsp-2;
			}
			System.out.println();
			row++;
		}

	}

}
