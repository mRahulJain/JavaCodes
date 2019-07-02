package H_W;

import java.util.Scanner;

public class GenerateParenthesis {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		GenerateParenthesis(0, 0, n, "");
	}

	public static void GenerateParenthesis(int open, int close, int n, String ans) {

		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}

		if (open > n || close > n || close > open) {
			return;
		}

		GenerateParenthesis(open, close + 1, n, ans + ")");
		GenerateParenthesis(open + 1, close, n, ans + "(");

	}

}
