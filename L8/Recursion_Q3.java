package L8;

import java.util.Scanner;

public class Recursion_Q3 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int n= s.nextInt();
		System.out.println(fibonacci(n));

	}
	public static int fibonacci(int n)
	{
		if(n==0)
		{
			return 0;
		}
		
		if(n==1)
		{
			return 1;
		}
		int fib= fibonacci(n-1)+fibonacci(n-2);
		return fib;
	}

}
