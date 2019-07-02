package Pattern;

import java.util.Scanner;

public class Pattern_20 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int nst=1;
		int nsp=2*N-3;
		int row=1;
		while(row<=N)
		{
			int cst=1;
			while(cst<=nst)
			{
				System.out.print(cst+"\t");
				cst++;
			}
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("\t");
				csp++;
			}
			if(row<N)
			{
				cst=row;
				while(cst!=0)
				{
					System.out.print(cst+"\t");
					cst--;
				}
			}
			else
			{
				cst=row-1;
				while(cst!=0)
				{
					System.out.print(cst+"\t");
					cst--;
				}
			}
			nsp=nsp-2;
			nst++;
			System.out.println();
			row++;
		}

	}

}
