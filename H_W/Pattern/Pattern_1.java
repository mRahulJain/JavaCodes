package Pattern;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		int nst=n;
		int row=1;
		while(row<=n)
		{
			nst=n;
			while(nst>=1)
			{
				System.out.print("*");
				nst--;
			}
			System.out.println();
			row++;
		}

	}

}
