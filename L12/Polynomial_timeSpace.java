package L12;

import java.util.Scanner;

public class Polynomial_timeSpace {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int x= s.nextInt();
		int n= s.nextInt();
		System.out.println(recPolynomial(n, x, x));
//		int a=x;
//		int res=0;
//		long start= System.currentTimeMillis();
//		for(int i=n;i>=0;i--)
//		{
//			res=res+i*a;
//			a=a*x;
//		}
//		long end= System.currentTimeMillis();
//		System.out.println(res);
//		System.out.println(end-start);

	}
public static int recPolynomial(int n, int x, int power)
{
	if(n==1)
	{
		return power;
	}
	
	int sp= recPolynomial(n-1, x, power*x);
	int bp= n*power +sp;
	
	return bp;
	
	
}

}
