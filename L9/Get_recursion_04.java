package L9;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_recursion_04 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(getMazeD(0, 0, 2, 2));
	}

	public static ArrayList<String> getMazeD(int cr, int cc, int er, int ec) {
		if(cr==er && cc==ec)
		{
			ArrayList<String> baseRes= new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}
		
		ArrayList<String> myRes= new ArrayList<>();
		if(cc<ec)
		{
			ArrayList<String> recResH= getMazeD(cr, cc+1, er, ec);
			for(String val:recResH)
			{
				myRes.add("H"+val);
			}
		}
		
		if(cr<er)
		{
			ArrayList<String> recResV= getMazeD(cr+1, cc, er, ec);
			for(String val:recResV)
			{
				myRes.add("V"+val);
			}
		}
		
		if(cc<ec && cr<er)
		{
			ArrayList<String> recResD= getMazeD(cr+1, cc+1, er, ec);
			for(String val: recResD)
			{
				myRes.add("D"+val);
			}
		}
		return myRes;
	}

}
