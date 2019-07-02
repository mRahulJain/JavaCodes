package L2;

import java.util.Scanner;

public class Pattern_10 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int N = s.nextInt();
		int nst = N;
		int nsp = 0;
		int row = 1;
		
		while(row<=N) {
			
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			
			
			
			
			System.out.println();
			row++;
		}
		

	}

}
