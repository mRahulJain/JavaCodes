package L2;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int nst=1;
		int nsp=N;
		int row=1;
		while(row<=N)
		{
			int csp=N-1;
			while(csp>=nst)
			{
				System.out.print(" ");
				csp=csp-1;
			}
			int col=N;
			while(col>=nsp)
			{
				System.out.print("*");
				col--;
			}
			System.out.println();
			nst++;
			nsp--;
			row=row+1;
		}

	}

}
