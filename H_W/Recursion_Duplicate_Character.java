package H_W;

import java.util.Scanner;

public class Recursion_Duplicate_Character {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String str= s.next();
		Duplicates(str,0);

	}
	public static void Duplicates(String str,int vidx)
	{
		if(vidx==str.length())
		{
			return;
		}
		else
		{
			char ch1= str.charAt(vidx);
			if(vidx<str.length()-1)
			{
				char ch2= str.charAt(vidx+1);
				if(ch1==ch2)
				{
					System.out.print(ch1+"*");
				}
				else
				{
					System.out.print(ch1);
				}
			}
			else
			{
				System.out.print(str.charAt(vidx));
			}
			
			Duplicates(str, vidx+1);
		}
	}

}
