package H_W;

import java.util.Scanner;

public class Count_Set_Bits {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int T= s.nextInt();
		int count=1;
			while(count<=T)
			{
				int cnt=0;
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
				while(binary!=0)
				{
					if(binary%10==1)
					{
						cnt++;
					}
					binary=binary/10;
				}
				System.out.println(cnt);
				count++;
			}
	}

}
