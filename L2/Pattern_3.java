package L2;

import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int nst=2*N-1;
		int nsp=0;
		int row=1;
		while(row<=N)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int col=1;
			while(col<=nst)
			{
				System.out.print("*");
				col++;
			}
			
			nst=nst-2;
			nsp=nsp+1;
			row=row+1;
			System.out.println();
		}

	}

}
