package H_W;

import java.util.Scanner;

public class String_difference_in_ASCII_codes {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String str= s.next();
		result(str);

	}
	public static void result(String str)
	{
		for(int i=0;i<str.length()-1;i++)
		{
			char ch1= str.charAt(i);
			int ascii1= (int) ch1;
			char ch2= str.charAt(i+1);
			int ascii2= (int) ch2;
			System.out.print(ch1);
			System.out.print(ascii2-ascii1);
		}
		System.out.print(str.charAt(str.length()-1));
	}

}
