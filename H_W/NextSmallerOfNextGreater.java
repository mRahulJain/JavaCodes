package H_W;

import java.util.Scanner;

public class NextSmallerOfNextGreater {
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

		for (int i = 0; i < arr.length; i++) {
			int flag1 = 0;
			int flag2 = 0;
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] > arr[i]) {
					flag1 = 1;
					break;
				}
				j++;
			}
			int k = j + 1;
			if (flag1 != 0) {
				while (k < arr.length) {
					if (arr[k] < arr[j]) {
						flag2 = 1;
						break;
					}
					k++;
				}
			}
			
			if(flag2==0)
			{
				System.out.println(arr[i]+",-1");
			} else {
				System.out.println(arr[i]+","+arr[k]);
			}

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
