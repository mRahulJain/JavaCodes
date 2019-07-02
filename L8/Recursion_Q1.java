package L8;

import java.util.Scanner;

public class Recursion_Q1 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int n= s.nextInt();
		Odd_Even(n);

	}
	public static void Odd_Even(int n)
	{
		if(n==0)
			return;
		if(n%2!=0)
		{
			System.out.println(n);
		}
		Odd_Even(n-1);
		if(n%2==0)
		{
			System.out.println(n);
		}
	}

}
