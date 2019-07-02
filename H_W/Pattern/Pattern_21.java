package Pattern;

import java.util.Scanner;

public class Pattern_21 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int nst=2*N+1;
		int nsp=0;
		int row=1;
		int p=N;
		int val=p;
		int vall=1;
		while(row<=2*N+1)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			val=p;
			while(cst<=nst)
			{
				if(cst<=nst/2)
				{
					System.out.print(val);
					val--;
				}
				else
				{
					System.out.print(val);
					val++;
				}
					cst++;
			}
			if(row<=N)
			{
				nsp++;
				nst= nst-2;
				p=p-1;
			}
			else
			{
				nsp--;
				nst=nst+2;
				p=vall;
				vall++;
				
			}
			System.out.println();
			row++;
		}

	}

}
