package H_W;

import java.util.Scanner;

public class RainWaterTrapping {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		int count = 1;
		while (count <= t) {
			int n = scn.nextInt();

			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}

			// left[i] denotes the tallest building from 0 to i
			int[] left = new int[arr.length];
			left[0] = arr[0];

			for (int i = 1; i < arr.length; i++) {
				left[i] = Math.max(left[i - 1], arr[i]);
			}

// right[i] denotes the tallest building from i to arr.length-1
			int[] right = new int[arr.length];
			right[arr.length - 1] = arr[arr.length - 1];

			for (int i = arr.length - 2; i >= 0; i--) {
				right[i] = Math.max(right[i + 1], arr[i]);
			}

			int sum = 0;

			for (int i = 0; i < arr.length; i++) {
				sum += (Math.min(left[i], right[i]) - arr[i]);
			}

			System.out.println(sum);
			count++;
		}


	}

}
