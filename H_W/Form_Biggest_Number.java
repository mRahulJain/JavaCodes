package H_W;

import java.util.Scanner;

public class Form_Biggest_Number {

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

			sort(arr);

			for (int val : arr) {
				System.out.print(val);
			}
			System.out.println();
			count++;
		}
	}

	public static void sort(int[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - counter - 1; j++) {

				if (compare(arr[j], arr[j + 1]) > 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public static int compare(int num1, int num2) {

		String val1s = num1 + "" + num2;
		String val2s = num2 + "" + num1;

		int val1int = Integer.parseInt(val1s);
		int val2int = Integer.parseInt(val2s);

		if (val1int > val2int) {
			return -1;
		} else {
			return 1;
		}
	}
}
