package L12;

import java.util.Scanner;

public class power_timeSpace {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int x= s.nextInt();
		int n= s.nextInt();
		System.out.println(power(x, n));

	}
	public static int power(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		
		int ans=0;
		int recRes= power(x, n/2);
		
		if(n%2==0)
		{
			ans= ans+ recRes*recRes;
		}
		else
		{
			ans= ans+ recRes*recRes*x;
		}
		
		return ans;
	}

}
