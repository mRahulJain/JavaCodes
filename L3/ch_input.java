package L3;

import java.util.Scanner;

public class ch_input {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char ch= s.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println("UPPERCASE");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("lowercase");
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
