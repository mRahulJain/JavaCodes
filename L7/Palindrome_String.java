package L7;

import java.util.Scanner;

public class Palindrome_String {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String str= s.next();
		System.out.println(isPalindrome(str));

	}
	public static boolean isPalindrome(String str)
	{
		int flag=1;
		for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			return true;
		}
		return false;
	}

}
