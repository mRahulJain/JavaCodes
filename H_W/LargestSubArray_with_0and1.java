package H_W;

import java.util.Scanner;

public class LargestSubArray_with_0and1 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int T = s.nextInt();
		while (T > 0) {
			int[] arr = takeInput();
			result(arr);
			T--;
		}
	}

	public static void result(int[] arr) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < arr.length; i++) {
			int coZ = 0;
			int coO = 0;
			if (arr[i] == 0) {
				coZ = 1;
				coO = 0;
			} else {
				coZ = 0;
				coO = 1;
			}
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] == 0) {
					coZ++;
				} else {
					coO++;
				}

				if (coZ == coO) {
					if ((j - i) > (b - a)) {
						a = i;
						b = j;
					}
				}
				j++;

			}
			
		}
		if (a == 0 && b == 0) {
			System.out.println("None");
		} else {
			System.out.println(a + " " + b);
		}

	}

	public static int[] takeInput() {
		int N = s.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

}
