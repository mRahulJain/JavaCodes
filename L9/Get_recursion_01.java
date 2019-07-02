package L9;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_recursion_01 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(getPermutation("abc"));

	}
	public static ArrayList<String> getPermutation(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> baseRes= new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}
		
		char ch= str.charAt(0);
		String ros= str.substring(1);
		ArrayList<String> recRes= getPermutation(ros);
		
		ArrayList<String> myRes= new ArrayList<>();
		for(String val:recRes)
		{
			for(int i=0;i<=val.length();i++)
			{
				String ans= val.substring(0, i)+ch+val.substring(i);
				myRes.add(ans);
			}
		}
		return myRes;
	}

}
