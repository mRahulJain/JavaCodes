package L12;

import java.util.Scanner;

public class Substrings_palindrome_TimeSpace {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String str= s.next();
		System.out.println(countPalindromeSS(str));
		

	}
	public static int countPalindromeSS(String str)
	{
		int count=0;
		//odd length subStrings
		for(int axis=0;axis<str.length();axis++)
		{
			for(int orbit=0;axis-orbit>=0 && axis+orbit<str.length();orbit++)
			{
				if(str.charAt(axis-orbit)!=str.charAt(axis+orbit))
				{
					break;
				}
				count++;
			}
		}
		//even length subStrings
		for(double axis=0.5;axis<str.length();axis++)
		{
			for(double orbit=0.5;axis-orbit>=0 && axis+orbit<str.length();orbit++)
			{
				if(str.charAt((int) (axis-orbit))!=str.charAt((int) (axis+orbit)))
				{
					break;
				}
				count++;
			}
		}
		return count;
	}

}
