package H_W;

import java.util.Scanner;

public class Split_Array {
	static Scanner s = new Scanner(System.in);
	static int count = 0;

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.println(CountSplit(arr, 0, 0, "", 0, ""));
		split(arr, 0, 0, "", 0, "");

	}

	public static int[] takeInput() {
		int N = s.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void split(int[] arr, int vidx, int sumL, String ansL, int sumR, String ansR) {
		if (vidx == arr.length) {
			if (sumL == sumR) {
				System.out.println(ansL + " and " + ansR);
				count++;
			}
			return;
		}

		split(arr, vidx + 1, sumL + arr[vidx], ansL + arr[vidx] + " ", sumR, ansR);
		split(arr, vidx + 1, sumL, ansL, sumR + arr[vidx], ansR + arr[vidx] + " ");
	}

	public static int CountSplit(int[] arr, int vidx, int sumL, String ansL, int sumR, String ansR) {
		if (vidx == arr.length) {
			if (sumL == sumR) {
				count++;
				return count;
			}
			return 0;
		}

		CountSplit(arr, vidx + 1, sumL + arr[vidx], ansL + arr[vidx] + " ", sumR, ansR);
		CountSplit(arr, vidx + 1, sumL, ansL, sumR + arr[vidx], ansR + arr[vidx] + " ");

		return count;
	}

}
