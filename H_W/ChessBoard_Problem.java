package H_W;

import java.util.Scanner;

public class ChessBoard_Problem {
	static int count =0;
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		count_chess_board(0, 0, n, n, "");
		System.out.println(count);
		chess_board(0, 0, n, n, "");
	}

	public static void chess_board(int cr, int cc, int er, int ec, String ans) {
		// Positive Base Case
		if (cr == er - 1 && cc == ec - 1) {
			System.out.print(ans + "{" + cr + "-" + cc + "} ");
			
			return;
		}
		// Negative Base case
		if (cr >= er || cc >= ec) {
			return;
		}
		// Knight
		chess_board(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");
		chess_board(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");
		// Rook
		if (cr == 0 || cc == 0 || cr == er - 1 || cc == ec - 1) {
			for (int moves = 1; moves < ec; moves++)
				chess_board(cr, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}R");
			for (int moves = 1; moves < er; moves++)
				chess_board(cr + moves, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");
		}
		// Bishop
		if (cr == cc || cr + cc == er - 1) {
			for (int moves = 1; moves < er; moves++) {
				chess_board(cr + moves, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}B");
			}
		}
	}
	
	public static void count_chess_board(int cr, int cc, int er, int ec, String ans) {
		// Positive Base Case
		if (cr == er - 1 && cc == ec - 1) {
//			System.out.print(ans + "{" + cr + "-" + cc + "} ");
			count++;
			return;
		}
		// Negative Base case
		if (cr >= er || cc >= ec) {
			return;
		}
		// Knight
		count_chess_board(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");
		count_chess_board(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");
		// Rook
		if (cr == 0 || cc == 0 || cr == er - 1 || cc == ec - 1) {
			for (int moves = 1; moves < ec; moves++)
				count_chess_board(cr, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}R");
			for (int moves = 1; moves < er; moves++)
				count_chess_board(cr + moves, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");
		}
		// Bishop
		if (cr == cc || cr + cc == er - 1) {
			for (int moves = 1; moves < er; moves++) {
				count_chess_board(cr + moves, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}B");
			}
		}
	}
}
