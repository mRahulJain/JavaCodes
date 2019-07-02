package H_W;


import java.util.Scanner;

public class Alpha_Score {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		long[] arr = takeInput();
		long x= AlphaScore(arr);
		System.out.println(x%1000000007);
	}

	public static long[] takeInput() {
		long N = s.nextLong();
		long[] arr = new long[(int) N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static long AlphaScore(long[] arr) {
		long sum = 0;
		for (int i = 1; i < arr.length; i++) {
			long psum = 0;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					psum = psum + arr[j];
				}
			}
			sum = sum + psum;
		}
		return sum;
	}

}
