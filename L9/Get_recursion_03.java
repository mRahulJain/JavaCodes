package L9;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_recursion_03 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(mazePath(0, 0, 2, 2));
	}

	public static ArrayList<String> mazePath(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}

		ArrayList<String> myRes = new ArrayList<>();
		if (cc < ec) {
			ArrayList<String> recResH = mazePath(cr, cc + 1, er, ec);
			for (String val : recResH) {
				myRes.add("H" + val);
			}
		}

		if (cr < er) {
			ArrayList<String> recResV = mazePath(cr + 1, cc, er, ec);
			for (String val : recResV) {
				myRes.add("V" + val);
			}
		}
		return myRes;
	}
}
