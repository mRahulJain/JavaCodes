package L1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int i = 2;
		int j;
		int flag = 0;
		while(i!=N)
		{
			flag=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(""+i);
			}
			i++;
		}
	}

}
