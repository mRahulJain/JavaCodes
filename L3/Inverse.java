package L3;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int inv=0;
		int cnt=1;
		while(n!=0)
		{
			int rem=n%10;
			inv= inv+cnt*(int)Math.pow(10, rem-1);
			cnt++;
			n=n/10;
		}
		System.out.println(inv);
	
	}

}
