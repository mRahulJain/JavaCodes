package L5;

import java.util.Scanner;

public class Array_Srch {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.println("Enter the number to be searched: ");
		int item = s.nextInt();
		if (linearSearch(arr, item)) {
			System.out.println("Yes present");
		} else {
			System.out.println("NO");
		}

	}

	public static int[] takeInput() {
		System.out.println("Size ?");
		int n = s.nextInt();
		System.out.println("-----------");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static boolean linearSearch(int[] arr, int item) {
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			return false;
		} else {
			return true;
		}
	}

}
