package Pattern;

import java.util.Scanner;

public class Pattern_14 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int row=1;
		int val=1;
		while(row<=N)
		{
			int cst=1;
			while(cst<=row)
			{
				System.out.print(val+"\t");
				cst++;
				val++;
			}
			row++;
			System.out.println();
			
		}
	

	}

}
