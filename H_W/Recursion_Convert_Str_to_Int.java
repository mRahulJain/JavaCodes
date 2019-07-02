package H_W;

import java.util.Scanner;

public class Recursion_Convert_Str_to_Int {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String str = s.next();
		int num = convert(str, 0);
		System.out.println(num);
	}

	public static int convert(String str, int vidx) {
		int n = 0;
		if (vidx == str.length() - 1) {
			char c = str.charAt(str.length() - 1);
			return (int) (c-'0');
		} else {
			int pow = (int) Math.pow(10, str.length() - vidx - 1);
			char ch = str.charAt(vidx);
			n = (int) (ch-'0');
			n = n * pow;
			int pnum = convert(str, vidx + 1);

			n = n + pnum;
		}
		return n;
	}

}
