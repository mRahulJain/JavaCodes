package H_W;

import java.util.Scanner;

public class Count_AAA_recursion {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String str= s.next();
		System.out.println(Count_overlapping(str, 0));
		System.out.println(Count_not_overlapping(str,0));
		
	}
	public static int Count_not_overlapping(String str,int vidx)
	{
		int count=0;
		if(vidx>=str.length()-2)
		{
			return 0;
		}
		else
		{
			count= Count_not_overlapping(str, vidx+3);
				if(str.charAt(vidx)==str.charAt(vidx+1) && str.charAt(vidx)==str.charAt(vidx+2))
				{
					count++;
			    }
		}
		return count;
	}
	public static int Count_overlapping(String str, int vidx)
	{
		int count=0;
		if(vidx>=str.length()-2)
		{
			return 0;
		}
		else
		{
			count= Count_overlapping(str, vidx+1);
				if(str.charAt(vidx)==str.charAt(vidx+1) && str.charAt(vidx)==str.charAt(vidx+2))
				{
					count++;
				}
		}
		return count;
	}

}
