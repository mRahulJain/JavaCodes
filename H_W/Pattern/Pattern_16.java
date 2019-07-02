package Pattern;

import java.util.Scanner;

public class Pattern_16 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		int row=1;
		while(row<=N)
		{
			int cst=1;
			while(cst<=row)
			{
				System.out.print(a+"\t");
				sum=a+b;
				a=b;
				b=sum;
				cst++;
			}
			System.out.println();
			row++;
		}

	}

}
