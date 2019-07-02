package L2_2;

import java.util.Scanner;

public class Any_to_Any {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int sb= s.nextInt();
		int db= s.nextInt();
		int sn= s.nextInt();
		int rem=0;
		int power=1;
		int decimal=0;
		int req=0;
		while(sn!=0)
		{
			rem=sn%10;
			decimal=decimal+rem*power;
			power=power*sb;
			sn=sn/10;
		}
		power=1;
		while(decimal!=0)
		{
			rem=decimal%db;
			req=req+rem*power;
			power=power*10;
			decimal=decimal/db;
		}
		System.out.println(req);

	}

}
