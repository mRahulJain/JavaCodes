package H_W;

import java.util.Scanner;

public class Toggle_Case {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String str= s.next();
		toggle(str);
	}
	public static void toggle(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				ch=Character.toLowerCase(ch);
				
			}
			else
			{
				ch=Character.toUpperCase(ch);
			}
			System.out.print(ch);
		}
		
	}

}
