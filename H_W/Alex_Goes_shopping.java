package H_W;

import java.util.Scanner;

public class Alex_Goes_shopping {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = takeInput();

		int q = s.nextInt();

		for (int i = 1; i <= q; i++) {

			int amount = s.nextInt();
			int k = s.nextInt();

			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (amount % arr[j] == 0) {
					count++;
				}
			}

			if (count >= k) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
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
