package Pattern;

import java.util.Scanner;

public class Pattern_22 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int nst=1;
		int nsp=2*N-1;
		int row=1;
		int p=N;
		int p1=N;
		int val;
		int vall;
		while(row<=2*N+1)
		{
			int cst=1;
			val=p;
			while(cst<=nst)
			{
				System.out.print(val+" ");
				val--;
				cst++;
			}
			int csp=1;
			while(csp<=nsp)
			{
				
				System.out.print("  ");
				csp++;
			}
			cst=1;
			if(row==N+1)
				vall=1;
			else
				vall=p1;
			while(cst<=nst && vall!=N+1)
			{
				if(row==N+1)
				{
					System.out.print(vall+" ");
					cst++;
					vall++;
				}
			else
			{
				System.out.print(vall+" ");
				cst++;
				vall++;
			}	
			}
			if(row<=N) {
				nst++;
				nsp=nsp-2;
				p1--;
			}
			else {
				nst--;
				nsp=nsp+2;
				p1++;
			}
			System.out.println();
			row++;
		}

	}

}
