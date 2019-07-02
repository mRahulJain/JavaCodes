package Pattern;

import java.util.Scanner;

public class Pattern_18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N= s.nextInt();
		int nst=1;
		int row=1;
		int nsp=N-1;
		while(row<=N)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("\t");
				csp++;
			}
			int cst=1;
			int i=row;
			while(cst<=2*row-1)
			{
				if(cst<row)
				{
					System.out.print(i+"\t");
					i++;
				}
				else {
					System.out.print(i+"\t");
					i--;
				}
				cst++;
			}
			nsp--;
			nst=nst+2;
			System.out.println();
			row++;
		}

	}

}
