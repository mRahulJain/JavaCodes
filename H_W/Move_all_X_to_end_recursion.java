package H_W;

import java.util.Scanner;

public class Move_all_X_to_end_recursion {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String str= s.next();
		int x=result(str,str.length()-1);
		for(int i=0;i<x;i++)
		{
			System.out.print("x");
		}
	}
	public static int result(String str, int vidx)
	{
		int count=0;
		if(vidx==-1)
		{
			return 0;
		}
		else
		{
			count= result(str, vidx-1);
			if(str.charAt(vidx)!='x')
			{
				System.out.print(str.charAt(vidx));
			}
			else
			{
				count++;
			}
			return count;
		}
	}

}
