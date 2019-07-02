package H_W;

import java.util.Scanner;

public class Delhi_Odd_Even {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int n=N;
		int rem;
		int c=1;
		int sume;
		int sumo;
		int count=1;
		while(count<=n)
		{
			N=s.nextInt();
			sume=0;
			sumo=0;
			while(N!=0)
			{
				rem=N%10;
				if(rem%2==0)
				{
					sume=sume+rem;
				}
				else
				{
					sumo=sumo+rem;
				}
				N=N/10;
			}
			if(sume%4==0 || sumo%3==0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			count++;
		}
		
		

	}

}
