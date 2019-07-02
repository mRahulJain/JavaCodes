package H_W;

import java.util.Scanner;

public class Sudoku {


		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {

			int[][] board = takeInput();

			Sudoku(0, 0, board);

		}

		private static void pattern(int row, int col, int n) {

			if (row > n) {
				return;
			}

			if (col > n) {
				System.out.println();
				pattern(row + 1, 1, n);
				return;
			}

			System.out.print("*");

			pattern(row, col + 1, n);

		}

		public static boolean Sudoku(int row, int col, int[][] board) {

			if (row == board.length) {
				display(board);
				return true;
			}
			if (col >= board[0].length) {
				return Sudoku(row + 1, 0, board);
			}

			if (board[row][col] != 0) {
				return Sudoku(row, col + 1, board);
			}

			for (int i = 1; i <= 9; i++) {

				if (isItSafe(row, col, board, i)) {
					board[row][col] = i;

					boolean res = Sudoku(row, col + 1, board);

					if (res) {
						return true;
					}

					board[row][col] = 0;
				}
			}

			return false;
		}

		public static boolean isItSafe(int row, int col, int[][] board, int value) {

			return isItSafeRow(row, board, value) && isItSafeCol(col, board, value) && isItSafeCell(row, col, board, value);

		}

		public static boolean isItSafeRow(int row, int[][] board, int value) {

			for (int i = 0; i < board[0].length; i++) {

				if (board[row][i] == value) {
					return false;
				}
			}

			return true;

		}

		public static boolean isItSafeCol(int col, int[][] board, int value) {

			for (int i = 0; i < board.length; i++) {

				if (board[i][col] == value) {
					return false;
				}
			}

			return true;

		}

		public static boolean isItSafeCell(int row, int col, int[][] board, int value) {

			int rs = row - row % 3;
			int cs = col - col % 3;

			for (int i = rs; i < rs + 3; i++) {

				for (int j = cs; j < cs + 3; j++) {

					if (board[i][j] == value) {
						return false;
					}
				}
			}

			return true;
		}

		private static void display(int[][] board) {

			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
		}

		public static int[][] takeInput() {

			int rows = scn.nextInt();

			int[][] arr = new int[rows][rows];

			for (int row = 0; row < arr.length; row++) {

				for (int col = 0; col < arr[row].length; col++) {

					arr[row][col] = scn.nextInt();

				}
			}
			return arr;
		}

}
