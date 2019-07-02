package H_W;

import java.util.Scanner;

public class Sum_of_digits_recursion {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int N= s.nextInt();
		int sum= reverse(N);
		System.out.println(sum);

	}
	public static int reverse(int N)
	{
		int n=0;
		int p=0;
		if(N/10==0)
		{
			return N%10;
		}
		else
		{
			n= N%10;
			N=N/10;
			p= reverse(N);
		}
		
		
		return n+p;
	}

}
