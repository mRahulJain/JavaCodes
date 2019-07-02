package Pattern;

import java.util.Scanner;

public class Pattern_17 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int nst=N;
		int nsp=0;
		int row=1;
		while(row<=N)
		{
			if(row==1 || row==N)
			{
				nst=N;
				int cst=1;
				while(cst<=nst)
				{
					System.out.print("*");
					cst++;
				}
			}
			else
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
			}
			if(row<N/2)
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
