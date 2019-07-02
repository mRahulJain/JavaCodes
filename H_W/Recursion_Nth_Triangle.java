package H_W;

import java.util.Scanner;

public class Recursion_Nth_Triangle {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int N= s.nextInt();
		int i= NthTriangle(N);
		System.out.println(i);
	}
	public static int NthTriangle(int n)
	{
		int i=0;
		int j=0;
		if(n==1)
		{
			return 1;
		}
		else
		{
			j= n + NthTriangle(n-1);
		}
		return j;
	}

}
