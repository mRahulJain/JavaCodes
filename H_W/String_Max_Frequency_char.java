package H_W;

import java.util.Scanner;

public class String_Max_Frequency_char {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String str= s.next();
		result(str);

	}
	public static void result(String str)
	{
		int temp=1;
		char ch1=str.charAt(0);
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			char ch= str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				if(ch==str.charAt(j))
				{
					count++;
				}
			}
			if(temp<count)
			{
				ch1=str.charAt(i);
			}
			temp=count;
			
		}
		System.out.println(ch1);
	}
	

}
