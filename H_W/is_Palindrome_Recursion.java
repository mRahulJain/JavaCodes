package H_W;

import java.util.Scanner;

public class is_Palindrome_Recursion {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String str= s.next();
		System.out.println(is_Palindrome(str, 0));
	}
	public static boolean is_Palindrome(String str,int vidx)
	{
		if(vidx==str.length()/2)
		{
			return true;
		}
		else if(str.charAt(vidx)==str.charAt(str.length()-1-vidx))
		{
			if(is_Palindrome(str, vidx+1)==true)
				return true;
		}
		return false;
	}

}
