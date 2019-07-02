package H_W;

import java.util.Scanner;

public class Sub_Set_problem_recursion {
	static int count = 0;
	static int flag = 0;
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int sum = scn.nextInt();
		System.out.println(splitCount(arr, 0, 0, "", 0, "", sum));
		split(arr, 0, 0, "", 0, "", sum);
	}

	public static void split(int[] arr, int vidx, int sumL, String ansL, int sumR, String ansR, int sum) {
		
		if (vidx == arr.length) {
			if (sumL == sum && sumR == sum) {
				System.out.println(ansL + " " + ansR);
				flag = 1;
			}
			return;
		}
		
		if(flag==1) {
			return;
		}
		split(arr, vidx + 1, sumL + arr[vidx], ansL + arr[vidx] + " ", sumR, ansR, sum);
		if(flag==1) {
			return;
		}
		split(arr, vidx + 1, sumL, ansL, sumR + arr[vidx], ansR + arr[vidx] + " ", sum);
	}

	public static int splitCount(int[] arr, int vidx, int sumL, String ansL, int sumR, String ansR, int sum) {

		if (vidx == arr.length) {
			if (sumL == sum && sumR == sum) {
				count++;
				return count;
			}
			return 0;

		}

		splitCount(arr, vidx + 1, sumL + arr[vidx], ansL + arr[vidx] + " ", sumR, ansR, sum);

		splitCount(arr, vidx + 1, sumL, ansL, sumR + arr[vidx], ansR + arr[vidx] + " ", sum);

		return count;
	}

}
