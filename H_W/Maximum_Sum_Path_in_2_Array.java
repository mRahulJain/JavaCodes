package H_W;

import java.util.Scanner;

public class Maximum_Sum_Path_in_2_Array {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int T = s.nextInt();
		int count = 1;
		while (count <= T) {
			int n1= s.nextInt();
			int n2= s.nextInt();
			int[] one = takeInput(n1);
			int[] two = takeInput(n2);

			int i = 0;
			int j = 0;

			int sum1 = 0;
			int sum2 = 0;
			int ans = 0;
			while (i < one.length && j < two.length) {
				if (one[i] < two[j]) {
					sum1 += one[i];
					i++;
				} else if (one[i] > two[j]) {
					sum2 += two[j];
					j++;
				} else {
					ans += Math.max(sum1, sum2) + one[i];
					sum1 = 0;
					sum2 = 0;
					i++;
					j++;
				}
			}
			if (i == one.length) {
				while (j < two.length) {
					sum2 += two[j];
					j++;
				}
				ans += sum2;
			} else if (j == two.length) {
				while (i < one.length) {
					sum1 += one[i];
					i++;
				}
				ans += sum1;
			}
			System.out.println(ans);
			count++;
		}
	}

	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

}
