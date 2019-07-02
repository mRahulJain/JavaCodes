package Pattern;

import java.util.Scanner;

public class Pattern_11 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int nst=n;
		int nsp=n-1;
		int row=1;
		while(row<=2*n-1)
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
			if(row<n)
			{
				nst--;
				nsp--;
			}
			else
			{
				nst++;
				nsp++;
			}
			System.out.println();
			row++;
		}

	}

}
