package L10;

import java.util.Scanner;

public class Print_SS {
	static Scanner s= new Scanner(System.in);
	static int count=0;
	public static void main(String[] args) {
		String str= s.next();
		numprintSS(str);
		System.out.println(count);
		printSS(str, "");

	}
	public static void numprintSS(String ques)
	{
		if(ques.length()==0)
		{
			count++;
			return;
		}
		
		char ch= ques.charAt(0);
		String roq= ques.substring(1);
		
		numprintSS(roq);			//no
		numprintSS(roq);		    //yes
	}
	public static void printSS(String ques, String ans)
	{
		if(ques.length()==0)
		{
			System.out.print(" "+ans);
			return;
		}
		
		char ch= ques.charAt(0);
		String roq= ques.substring(1);
		
		printSS(roq, ans);			//no
		printSS(roq, ans+ch);		//yes
	}

}
