package L2;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int i,j,k;
		for(i=1;i<=N;i++)
		{
			
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=N;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
