package L2_2;

import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
			int n= s.nextInt();
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
			System.out.println(binary);
	}

}
