package L9;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_recursion {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(getBoardPath(0, 10));

	}

	public static ArrayList<String> getBoardPath(int curr, int end) {
		if (curr == end) {
			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("\n");
			return baseRes;
		}

		ArrayList<String> myRes = new ArrayList<>();
		for (int dice = 1; dice <= 6 && curr+dice <= end; dice++) {
			ArrayList<String> recRes = getBoardPath(curr + dice, end);
			for (String val : recRes) {
				myRes.add(dice + val);
			}
		}
		return myRes;
	}

}
