package L2;

import java.util.Scanner;

public class Pattern_2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int row=1;
		int nsp=0;
		int nst=N;
		while(row<=N)
		{
			int csp=1;
			while(csp<=nsp)
			{
				
				System.out.print(" ");
				csp= csp+1;
			}
			int col=1;
			while(col<=nst)
			{
				System.out.print("*");
				col=col+1;
			}
			System.out.println();
			nsp=nsp+1;
			nst= nst-1;
			row= row+1;
		}
	}

}
