package L11;

import java.util.Scanner;

public class N_Queens {
	static int count=0;
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int N= s.nextInt();
		countNQueens(new boolean[N][N], 0, "");
		System.out.println(count);
		NQueens(new boolean[N][N], 0, "");
	}

	public static void NQueens(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			System.out.print(ans+" ");
			return;
		}

		for (int col = 0; col < board[0].length; col++) {
			if (isItSafeToPlaceQueen(board, row, col)) {
				board[row][col] = true;
				NQueens(board, row + 1, ans + "{" + (row+1) + "-" + (col+1) + "} ");
				board[row][col] = false;
			}
		}
	}
	public static void countNQueens(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			count++;
			return;
		}

		for (int col = 0; col < board[0].length; col++) {
			if (isItSafeToPlaceQueen(board, row, col)) {
				board[row][col] = true;
				countNQueens(board, row + 1, ans);
				board[row][col] = false;
			}
		}
	}

	public static boolean isItSafeToPlaceQueen(boolean[][] board, int row, int col) {
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}

		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}

		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}

		return true;
	}

}