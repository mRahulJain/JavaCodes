package H_W;

import java.util.Scanner;

public class Recursion_keypad_codes {
	static Scanner s= new Scanner(System.in);
	static int count=0;
	public static void main(String[] args) {
		String str= s.next();
		count_result(str);
		System.out.println(count);
		result(str, "");

	}
	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jkl";
		else if (ch == '5')
			return "mno";
		else if (ch == '6')
			return "pqrs";
		else if (ch == '7')
			return "tuv";
		else if (ch == '8')
			return "wx";
		else if (ch == '9')
			return "yz";
		else
			return "";

	}
	public static void result(String ques, String ans)
	{
		if(ques.length()==0)
		{
			System.out.print(" "+ans);
			return;
		}
		String ch= getCode(ques.charAt(0));
		String roq= ques.substring(1);
		
		for(int i=0;i<ch.length();i++)
		{
			char c= ch.charAt(i);
			result(roq, ans+c);
		}
		
		
		
	}
	public static void count_result(String ques)
	{
		if(ques.length()==0)
		{
			count++;
			return;
		}
		String ch= getCode(ques.charAt(0));
		String roq= ques.substring(1);
		
		for(int i=0;i<ch.length();i++)
		{
			char c= ch.charAt(i);
			count_result(roq);
		}
		
		
		
	}
	
	
	
	
	
	
	
	

}
