package L7;

import java.util.Scanner;

public class Sub_Strings {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str= s.next();
		Sub_String(str);

	}
	public static void Sub_String(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	}

}
