package L3;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int minF=s.nextInt();
		int maxF= s.nextInt();
		int step=s.nextInt();
		int i;
		for(i=minF;i<=maxF;i=i+step)
		{
			int c= (int) ((5.0/9)*(i-32));
			System.out.println(i+"\t"+c);
		}

	}

}
