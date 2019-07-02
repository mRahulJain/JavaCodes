package H_W;

import java.util.Scanner;

public class Simple_Input {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int sum=0;
		int N= s.nextInt();
		
		while(sum>=0)
		{
			System.out.println(N);
			N= s.nextInt();
			sum=sum+N;
		}
		
	}

}
