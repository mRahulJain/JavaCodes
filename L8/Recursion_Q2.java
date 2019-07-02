package L8;

import java.util.Scanner;

public class Recursion_Q2 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int x= s.nextInt();
		int n= s.nextInt();
		int res= power(x,n);
		System.out.println(res);

	}
	public static int power(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		return power(x,n-1)*x; 
	}

}
