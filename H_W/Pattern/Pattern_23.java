package Pattern;

import java.util.Scanner;

public class Pattern_23 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int nst=1;
		int nsp=N-1;
		int nsp1=-1;
		int nst1=0;
		int val=1;
		int row=1;
		if(N%2==0)
		{
			System.out.println("Wrong choice.");
		}
		else
		{
			while(row<=N)
			{
				int csp=1;
				while(csp<=nsp)
				{
					System.out.print("  ");
					csp++;
				}
				int cst=1;
				while(cst<=nst)
				{
					System.out.print(val+" ");
					cst++;
					val--;
				}
				csp=1;
				while(csp<=nsp1)
				{
					System.out.print("  ");
					csp++;
				}
				cst=1;
				val=1;
				while(cst<=nst1)
				{
					System.out.print(val+" ");
					val++;
					cst++;
				}
				if(row<=N/2)
				{
					nst++;
					nsp=nsp-2;
					val=row+1;
					nsp1=nsp1+2;
					if(row==1)  {
					nst1=nst1+2;  }
					else {
						nst1++;
					}
				}
				else
				{
					nst--;
					nsp=nsp+2;
					val=N-row;
					nsp1=nsp1-2;
					if(row==N-1)
					{
						nst1=nst1-2;
					}
					else
					{
						nst1--;
					}
				}
				System.out.println();
				row++;
			}
		
		}

	}

}
