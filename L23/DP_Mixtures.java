package L23;

public class DP_Mixtures {

	public static void main(String[] args) {
		int[] arr = { 40, 60, 20, 10 };
		System.out.println(mixturesR(arr, 0, arr.length-1));
		System.out.println(mixturesTD(arr, 0, arr.length-1, new int[arr.length][arr.length]));
		System.out.println(mixturesBU(arr));
	}

	public static int mixturesR(int[] arr, int si, int ei) {
		if (si >= ei) {
			return 0;
		}

		int min = Integer.MAX_VALUE;

		for (int k = si; k < ei; k++) {
			int fc = mixturesR(arr, si, k);
			int sc = mixturesR(arr, k + 1, ei);

			int sw = color(arr, si, k) * color(arr, k + 1, ei);

			int total = fc + sc + sw;

			if (total < min) {
				min = total;
			}

		}
		return min;
	}

	public static int color(int[] arr, int si, int ei) {
		int sum = 0;
		for (int i = si; i <= ei; i++) {
			sum += arr[i];
		}

		return sum % 100;
	}
	
	public static int mixturesTD(int[] arr, int si, int ei, int[][] strg) {
		if (si >= ei) {
			return 0;
		}

		if(strg[si][ei]!=0) {
			return strg[si][ei];
		}
		int min = Integer.MAX_VALUE;

		for (int k = si; k < ei; k++) {
			int fc = mixturesTD(arr, si, k, strg);
			int sc = mixturesTD(arr, k + 1, ei, strg);

			int sw = color(arr, si, k) * color(arr, k + 1, ei);

			int total = fc + sc + sw;

			if (total < min) {
				min = total;
			}
			
			strg[si][ei] = min;
		}
		return min;
	}
	
	public static int mixturesBU(int[] arr) {
		int n = arr.length;
		int[][] strg = new int[n][n];
		
		for(int slide = 1; slide < n ; slide++) {
			for(int si = 0 ; si < n-slide ; si++) {
				int ei = si + slide;
				int min = Integer.MAX_VALUE;

				for (int k = si; k < ei; k++) {
					int fc = strg[si][k];
					int sc = strg[k+1][ei];

					int sw = color(arr, si, k) * color(arr, k + 1, ei);

					int total = fc + sc + sw;

					if (total < min) {
						min = total;
					}
					
					strg[si][ei] = min;
				}
			}
		}
		
		return strg[0][n-1];
	}

}
