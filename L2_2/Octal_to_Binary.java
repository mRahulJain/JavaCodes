package L2_2;

import java.util.Scanner;

public class Octal_to_Binary {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int rem=0;
		int power=1;
		int decimal=0;
		int binary=0;
		while(N!=0)
		{
			rem=N%10;
			decimal=decimal+rem*power;
			power=power*8;
			N=N/10;
		}
		power=1;
		while(decimal!=0)
		{
			rem=decimal%2;
			binary=binary+rem*power;
			power=power*10;
			decimal=decimal/2;
		}
		System.out.println(binary);

	}

}
