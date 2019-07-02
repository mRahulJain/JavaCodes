package L2;

import java.util.Scanner;

public class Pattern_5 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int nst=N;
		int nsp=0;
		int row=1;
		while(row<=2*N-1)
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
				col=col+1;
			}
			System.out.println();
			if(row<=N-1)
			{
				nsp=nsp+2;
			}
			else
			{
				nsp=nsp-2;
			}
			if(row<=N-1)
			{
				nst--;
			}
			else
			{
				nst++;
			}
			row++;
		}
		
	}
}
