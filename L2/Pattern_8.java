package L2;

import java.util.Scanner;

public class Pattern_8 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int nst=n;
		int nsp=n-1;
		int row=1;
		while(row<=2*n-1)
		{
			int csp=0;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst=cst+1;
			}
			
			System.out.println();
			if(row<=n-1)
			{
				nsp=nsp-2;
			}
			else
			{
				nsp=nsp+2;
			}
			
			row++;
		}

	}

}