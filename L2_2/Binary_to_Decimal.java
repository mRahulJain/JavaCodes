package L2_2;

import java.util.Scanner;

public class Binary_to_Decimal {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int T= s.nextInt();
		int count=1;
		while(count<=T)
		{
			int N= s.nextInt();
			int rem=0;
			int power=1;
			int decimal=0;
			while(N!=0)
			{
				rem=N%10;
				decimal=decimal+rem*power;
				power=power*2;
				N=N/10;
			}
			System.out.println(decimal);
			count++;
		}
	}

}
