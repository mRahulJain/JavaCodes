package L1;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N1= s.nextInt();
		int N2= s.nextInt();
		int a;
		if(N1<N2)
		{
			N1=N1+N2;
			N2=N1-N2;
			N1=N1-N2;
		}
		a=N1%N2;
		while(a!=0)
		{
			N1=N2;
			N2=a;
			a=N1%N2;
		}
		System.out.println(N2);
		

	}

}

