package L23;

public class DP_BoardPath {

	public static void main(String[] args) {
		int N = 1000;
		System.out.println(countboardPathR(0, N, new int[N+1]));
		System.out.println(countboardpathI(N));
		System.out.println(countboardpathISE(N));
	}

	// BottomUp  O(n): TimeAndSpaceComplexity
	public static int countboardPathR(int curr, int end, int[] strg) {

		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (strg[curr] != 0) {
			return strg[curr];
		}

		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count = count + countboardPathR(curr + dice, end, strg);
		}
		strg[curr] = count;
		return count;
	}
	// TopDown  O(n): TimeAndSpaceComplexity
	public static int countboardpathI(int N) {
		int[] arr = new int[N + 6];

		arr[N] = 1;

		for (int i = N - 1; i >= 0; i--) {
			arr[i] = arr[i + 1] + arr[i + 2] + arr[i + 3] + arr[i + 4] + arr[i + 5] + arr[i + 6];
		}

		return arr[0];

	}
	
	//TopDown  O(n): TimeComplexity and O(constant): SpaceComplexity
	public static int countboardpathISE(int N) {
		int[] arr = new int[6];

		arr[0] = 1;

		for (int i = N - 1; i >= 0; i--) {
			int temp = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5];
			
			arr[5] = arr[4];
			arr[4] = arr[3];
			arr[3] = arr[2];
			arr[2] = arr[1];
			arr[1] = arr[0];
			arr[0] = temp;
		}

		return arr[0];

	}
	
	

}
