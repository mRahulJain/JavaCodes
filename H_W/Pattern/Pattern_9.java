package Pattern;

import java.util.Scanner;

public class Pattern_9 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int nst=n;
		int nsp=0;
		int row=1;
		while(row<=n)
		{
			int csp=1;
				while(csp<=nsp)
				{
					System.out.print(" ");
					csp++;
				}
				int cst=1;
				while(cst<=2*nst-1)
				{
					if(cst%2==0)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
					cst++;
						
				}
				nst--;
				nsp++;
			System.out.println();
			row++;
		}

	}

}
