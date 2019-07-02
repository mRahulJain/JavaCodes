package H_W;

import java.util.Scanner;

public class Strings_string_compression {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String str= s.next();
		result(str);

	}
	public static void result(String str)
	{
		int k=0;
		int j=0;
		for(int i=0;i<str.length()-1;i=i+k)
		{
			k=0;
			j=i+1;
			char ch= str.charAt(i);
			while(str.charAt(j)==ch)
			{
				k++;
				j++;
				if(j>=str.length())
				{
					break;
				}
			}
			System.out.print(ch);
			if(k!=0)
			{
				System.out.print(k+1);
			}
			k++;
		}
		if(str.charAt(str.length()-1)!=str.charAt(str.length()-2))
		{
			System.out.print(str.charAt(str.length()-1));
		}
	}

}
