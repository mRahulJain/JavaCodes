package L23;

public class DP_MazePath {

	public static void main(String[] args) {
		int n = 2000;
		System.out.println(countmazePathR(0, 0, n, n, new int[n + 1][n + 1]));
		System.out.println(countmazePathI(n, n));
		System.out.println(countmazePathISE(n, n));

	}

	public static int countmazePathR(int cr, int cc, int er, int ec, int[][] strg) {
		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		if (strg[cr][cc] != 0) {
			return strg[cr][cc];
		}

		int ch = countmazePathR(cr, cc + 1, er, ec, strg);
		int cv = countmazePathR(cr + 1, cc, er, ec, strg);

		strg[cr][cc] = ch + cv;

		return ch + cv;
	}

	public static int countmazePathI(int er, int ec) {
		int[][] arr = new int[er + 2][ec + 2];

		for (int row = er; row >= 0; row--) {
			for (int col = ec; col >= 0; col--) {
				if (row == er && col == ec) {
					arr[row][col] = 1;
				} else {
					arr[row][col] = arr[row + 1][col] + arr[row][col + 1];
				}
			}
		}
		return arr[0][0];

	}

	public static int countmazePathISE(int er, int ec) {
		int[] arr = new int[ec + 2];

		for (int row = er; row >= 0; row--) {
			for (int col = ec; col >= 0; col--) {
				if (row == er && col == ec) {
					arr[col] = 1;
				} else {
					arr[col] = arr[col]+arr[col+1];
				}
			}
		}
		return arr[0];

	}

}
