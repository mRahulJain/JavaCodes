package L2;

public class Pattern_6 {

	public static void main(String[] args) {
		int nst=1;
		int nsp=3;
		int row=1;
		while(row<=4)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int col=1;
			while(col<=nst)
			{
				System.out.print("*"+" ");
				col++;
			}
			
			System.out.println();
			nst++;
			nsp--;
			row++;
		}

	}

}
