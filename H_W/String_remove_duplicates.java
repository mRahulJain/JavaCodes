package H_W;

import java.util.Scanner;

public class String_remove_duplicates {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String str= s.next();
		result(str);

	}
	public static void result(String str)
	{
		int j=0;
		for(int i=0;i<str.length()-1;i++)
		{
			char ch= str.charAt(i);
			if(str.charAt(i+1)!=ch)
			{
				System.out.print(ch);
			}
		}
		if(str.charAt(str.length()-1)!=str.charAt(str.length()-2));
		{
			System.out.print(str.charAt(str.length()-1));
		}
	}

}
