package L9;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_recursion_02 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(coinToss(1));
		
	}

	public static ArrayList<String> coinToss(int vidx) {
		if (vidx == 3) {
			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("T");
			baseRes.add("H");
			return baseRes;
		}
		ArrayList<String> recRes = coinToss(vidx + 1);
		ArrayList<String> myRes = new ArrayList<>();

		char ch1 = 'T';
		char ch2 = 'H';
		for (String val : recRes) {
//			for (int i = 0; i <= val.length(); i++) {
				String ans1= val.substring(0, 0)+ch1+val.substring(0);
				String ans2= val.substring(0, 0)+ch2+val.substring(0);
				
				myRes.add(ans1);
				myRes.add(ans2);
//			}
		}
		return myRes;
	}

}
