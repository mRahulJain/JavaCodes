package L23;

public class DP_Fibonacci {

	public static void main(String[] args) {
		int n = 7000;
		System.out.println(fibTD(n, new int[n + 1]));
		System.out.println(fibI(n));
		System.out.println(fibISE(n));
	}

	// TopDownDP
	public static int fibTD(int N, int[] strg) {
		if (N == 0 || N == 1) {
			return N;
		}

		if (strg[N] != 0) {
			return strg[N];
		}

		int fnm1 = fibTD(N - 1, strg);
		int fnm2 = fibTD(N - 2, strg);

		int fn = fnm1 + fnm2;

		strg[N] = fn;

		return fn;

	}

	// BottomUpDP    O(n) : TimeAndSpaceComplexity
	public static int fibI(int N) {
		int[] arr = new int[N + 1];

		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		
		return arr[N];
	}
	
	// IterativelySpaceEfficient     O(n): TimeComplexity   O(Constant): SpaceComplexity
	public static int fibISE(int N) {
		int[] arr = new int[2];
		
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2 ; i<=N ; i++) {
			int temp = arr[0]+arr[1];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		
		return arr[1];
	}

}
