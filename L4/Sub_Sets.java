package L4;

import java.util.Scanner;

public class Sub_Sets {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		subsets(N);

	}
	public static void subsets(int N)
	{
		int n=N;
		int rem1;
		int rem2;
		int pow;
		int subs;
		int digits= numberOfDigits(N);
		int i= (int)Math.pow(2, digits);
		for(int j=0;j<i;j++)
		{
			subs=0;
			pow=1;
			n=N;
			int binary= Decimal_to_Binary(j);
			int bin=binary;
			while(n!=0)
			{
				rem1=bin%10;
				rem2=n%10;
				subs=subs+rem1*rem2*pow;
				if(rem1==1)
				{
					pow=pow*10;
				}
				bin=bin/10;
				n=n/10;
			}
			System.out.println(subs);
		}
	}
	public static int numberOfDigits(int num) {
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
	public static int Decimal_to_Binary(int n)
	{
		int binary=0;
		int rem=0;
		int power=1;
		while(n!=0)
		{
			rem=n%2;
			binary=binary+rem*power;
			power=power*10;
			n=n/2;
		}
		return binary;
	}
	 

}
