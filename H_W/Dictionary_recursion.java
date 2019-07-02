package H_W;

import java.util.Scanner;

public class Dictionary_recursion {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
printPermutation2("abc", "");
		

	}
	public static void printPermutation(String ques, String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length();i++)
		{
			char ch= ques.charAt(i);
			String roq=ques.substring(0,i)+ques.substring(i+1);
			printPermutation(roq, ans+ch);
		}
		
		
	}
	public static void printPermutation2(String ques, String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		
		char ch= ques.charAt(0);
		String roq= ques.substring(1);
		
		for(int i=0;i<=ans.length();i++)
		{
			String newAns= ans.substring(0, i)+ch+ans.substring(i);
			printPermutation2(roq, newAns);
		}

	}

}
