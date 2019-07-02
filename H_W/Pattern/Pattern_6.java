package Pattern;

import java.util.Scanner;

public class Pattern_6 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int nst=1;
		int row=1;
		while(row<=2*n-1)
		{
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			if(row<n)
			{
				nst++;
			}
			else
			{
				nst--;
			}
			System.out.println();
			row++;
		}

	}

}
