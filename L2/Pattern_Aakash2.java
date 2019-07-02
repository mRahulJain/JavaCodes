package L2;

import java.util.Scanner;

public class Pattern_Aakash2 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int N = s.nextInt();
		int nst = N;
		int row = 1;
		int multiplier = 0;
		int val = N*multiplier + 1;
		while(row<=N) {
			int cst = 1;
			while(cst<=nst) {
				System.out.print(val+"\t");
				val++;
				cst++;
			}
			if(N%2==0) {
				if(row<N/2) {
					multiplier += 2;
				} else if(row>N/2) {
					multiplier -= 2;
				} else {
					multiplier++;
				}
			} else {
				if(row<=N/2) {
					multiplier += 2;
				} else if(row>N/2+1) {
					multiplier -= 2;
				} else {
					multiplier--;
				}
			}
			val = N*multiplier + 1;
			row++;
			System.out.println();
		}

	}

}
