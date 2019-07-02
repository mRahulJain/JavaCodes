package H_W;

import java.util.Scanner;

public class Recursion_balanced {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String str = s.next();
		int x = result1(str, 0);
		int y = result2(str, 0);
		int z = result3(str, 0);
		if (x == 0 && y == 0 && z == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static int result1(String str, int vidx) {
		int count = 0;
		if (vidx == str.length()) {
			return 0;
		} else {
			count = result1(str, vidx + 1);
			if (str.charAt(vidx) == ']') {
				count++;
			} else if (str.charAt(vidx) == '[') {
				count--;
			}
			return count;
		}
	}

	public static int result2(String str, int vidx) {
		int count = 0;
		if (vidx == str.length()) {
			return 0;
		} else {

			count = result2(str, vidx + 1);
			if (str.charAt(vidx) == '}') {
				count++;
			} else if (str.charAt(vidx) == '{') {
				count--;
			}
			return count;
		}
	}

	public static int result3(String str, int vidx) {
		int count = 0;
		if (vidx == str.length()) {
			return 0;
		} else {
			count = result3(str, vidx + 1);
			if (str.charAt(vidx) == ')') {
				count++;
			} else if (str.charAt(vidx) == '(') {
				count--;
			}
			return count;
		}
	}

	public static boolean balanced(String str, String ans) {
		if (str.length() == 0) {
			if (ans.length() == 0)
				return true;
			else
				return false;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		if (ch == '(' || ch == '{' || ch == '[') {
			ans += ch;
		} else if (ch == ')' || ch == '}' || ch == ']') {
			if (ans.length() != 0) {
				char last = ans.charAt(ans.length() - 1);
				if (last == '{' && ch != '}') {
					return false;
				} else if (last == '(' && ch != ')') {
					return false;
				} else if (last == '[' && ch != ']') {
					return false;
				}
				ans = ans.substring(0, ans.length() - 1);
			} else {
				return false;
			}
		}
		return balanced(ros, ans);
	}
}
