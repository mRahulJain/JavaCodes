package L9;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_recursion_05 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(getMazeMM(0, 0, 2, 2));
	}

	public static ArrayList<String> getMazeMM(int cr, int cc, int er, int ec) {
		if(cr==er && cc==ec)
		{
			ArrayList<String> baseRes= new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}
		
		ArrayList<String> myRes= new ArrayList<>();
		for(int i=1;i<=ec;i++)
		{
			if(cc<ec)
			{
				ArrayList<String> recResH= getMazeMM(cr, cc+1, er, ec);
				for(String val:recResH)
				{
					myRes.add("H"+val+i);
				}
			}
		}
		for(int i=1;i<=er;i++)
		{
			if(cr<er)
			{
				ArrayList<String> recResV= getMazeMM(cr+1, cc, er, ec);
				for(String val:recResV)
				{
					myRes.add("V"+val+i);
				}
			}
		}
		return myRes;
	}

}
