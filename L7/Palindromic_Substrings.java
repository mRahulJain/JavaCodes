package L7;

import java.util.Scanner;

public class Palindromic_Substrings {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str= s.next();
		Print_Palindromic_Substring(str);

	}
	public static void Print_Palindromic_Substring(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				String s1= str.substring(i, j);
				int flag=1;
				for(int k=0,l=s1.length()-1;k<s1.length()/2;k++,l--)
				{
					if(s1.charAt(k)!=s1.charAt(l))
					{
						flag=0;
						break;
					}
				}
				if(flag==1)
				{
					System.out.println(s1);
				}
			}
		}
	}

}
