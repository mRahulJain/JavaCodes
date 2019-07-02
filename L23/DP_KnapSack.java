package L23;

public class DP_KnapSack {

	public static void main(String[] args) {
		int[] wt = { 1, 3, 4, 5 };
		int[] price = { 1, 4, 5, 7 };
		int cap = 7;
		System.out.println(KnapsackR(wt, price, 0, cap));
		System.out.println(KnapsackTD(wt, price, 0, cap, new int[price.length][cap + 1]));
		System.out.println(KnapSackBU(wt, price, cap));
	}

	public static int KnapsackR(int[] wt, int[] price, int vidx, int cap) {
		if (vidx == wt.length) {
			return 0;
		}

		int include = 0;
		if (cap >= wt[vidx]) {
			include = KnapsackR(wt, price, vidx + 1, cap - wt[vidx]) + price[vidx];
		}

		int exclude = KnapsackR(wt, price, vidx + 1, cap);
		int ans = Math.max(include, exclude);
		return ans;
	}

	public static int KnapsackTD(int[] wt, int[] price, int vidx, int cap, int[][] strg) {
		if (vidx == wt.length) {
			return 0;
		}
		if (strg[vidx][cap] != 0) {
			return strg[vidx][cap];
		}
		int include = 0;
		if (cap >= wt[vidx]) {
			include = KnapsackR(wt, price, vidx + 1, cap - wt[vidx]) + price[vidx];
		}

		int exclude = KnapsackR(wt, price, vidx + 1, cap);
		int ans = Math.max(include, exclude);
		strg[vidx][cap] = ans;
		return ans;
	}

	public static int KnapSackBU(int[] wt, int[] price, int cap) {
		int nr = wt.length + 1;
		int nc = cap + 1;

		int[][] strg = new int[nr][nc];

		for (int row = 0; row < strg.length; row++) {
			for (int col = 0; col < strg[0].length; col++) {
				if (row == 0 || col == 0) {
					strg[row][col] = 0;
				} else {
					// include
					int include = 0;
					if(col >= wt[row-1]) {
						include = price[row-1] + strg[row-1][col-wt[row-1]];
					}
					
					//exclude
					int exclude = strg[row-1][col];
					
					strg[row][col] = Math.max(include, exclude);
				}
			}
		}
		return strg[nr - 1][nc - 1];
	}

}
