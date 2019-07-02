package L3;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N= s.nextInt();
		int rotation= s.nextInt();
		int n=N;
		int cnt=0;
		while(n!=0)
		{
			n=n/10;
			cnt++;
		}
		while(rotation<0)
		{
			if(rotation<0)
			{
				rotation=rotation+cnt;
			}
		}
		if(rotation>cnt)
		{
			if(rotation%cnt==0)
			{
				rotation= rotation%cnt;
			}
			else
			{
				rotation=rotation%cnt -1;
			}
		}
		int rem= N%((int)Math.pow(10,  rotation));
		N=N/((int)Math.pow(10, rotation));
		int res= rem*(int)Math.pow(10, cnt-rotation)+N;
		System.out.println(res);
		
	}

}
