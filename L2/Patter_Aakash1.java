package L2;

import java.util.Scanner;

public class Patter_Aakash1 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int N = s.nextInt();
		int nst = 2*N-1;
		int row = 1;
		int val = N;
		int flag ;
		while(row<=2*N-1) {
			int cst = 1;
			flag = row-1;
			while(cst<=nst) {
				System.out.print(val+" ");
				if(row!=1 && row!=2*N-1) {
					if(flag!=0) {
						val--;
						flag--;
					}
					if(cst>=2*N-row) {
						val++;
					}
				}
				cst++;
			}
			System.out.println();
			row++;
			val = N;
		}

	}

}
