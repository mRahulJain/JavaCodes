package H_W;

import java.util.Scanner;

public class String_odd_even_Char {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String str= s.next();
		change(str);

	}
	public static void change(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			int ascii= (int) ch;
				if(i%2==0)
				{
					ch=(char) (ascii+1);
				}
				else
				{
					ch=(char) (ascii-1);
				}
				System.out.print(ch);
		}
	}
}
