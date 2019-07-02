package L2_2;

import java.util.Scanner;

public class Decimal_to_Octal {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int rem=0;
		int power=1;
		int octal=0;
		while(N!=0)
		{
			rem=N%8;
			octal=octal+rem*power;
			power=power*10;
			N=N/8;
		}
		System.out.println(octal);

	}

}
