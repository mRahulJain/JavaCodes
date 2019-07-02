package H_W;

import java.util.Scanner;

public class Max_Circular_sum {

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
			int[] na = new int[arr.length * 2];

			for (int i = 0; i < arr.length; i++) {
				na[i] = arr[i];
				na[i + arr.length] = arr[i];
			}

			int maxSum = 0;

			for (int si = 0; si <= arr.length - 1; si++) {

				for (int ei = si; ei <= si + arr.length - 1; ei++) {

					int subarraySum = 0;

					for (int k = si; k <= ei; k++) {
						subarraySum += na[k];
					}

					if (subarraySum > maxSum) {
						maxSum = subarraySum;
					}
				}
			}

			System.out.println(maxSum);
			count++;
		}
	}

}
