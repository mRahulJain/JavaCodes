package L1;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int i;
		int j,k;
		for(i=1;i<=N;i++)
		{
			System.out.println();
			for(j=N-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
		}

	}

}
