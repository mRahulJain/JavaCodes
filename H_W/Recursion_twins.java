package H_W;

import java.util.Scanner;

public class Recursion_twins {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String str= s.next();
		int result= Result(str,0);
		System.out.println(result);

	}
	public static int Result(String str, int vidx)
	{
		int count=0;
		if(vidx==str.length()-2)
		{
			return 0;
		}
		else
		{
			count= Result(str, vidx+1);
			if(str.charAt(vidx)==str.charAt(vidx+2))
			{
				count++;
			}
			return count;
		}
	}

}
