package H_W;

import java.util.Scanner;

public class Recursion_removeDuplicate_Char {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String str= s.next();
		str= covert(str);
		removeDuplicates(str,0);

	}
	public static void removeDuplicates(String str,int vidx)
	{
		if(vidx==str.length()-1)
		{
			System.out.print(str.charAt(vidx));
		}
		else
		{
			if(str.charAt(vidx)!=str.charAt(vidx+1))
			{
				System.out.print(str.charAt(vidx));
			}
			removeDuplicates(str, vidx+1);
		}
		
	}
	public static String covert(String str)
	{
		String s1= new String();
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=Character.toLowerCase(ch);
			}
		}
		return str;
		
	}

}
