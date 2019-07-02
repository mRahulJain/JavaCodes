package H_W;

import java.util.Scanner;

public class Binary_Search {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = takeInput();
		int item = s.nextInt();
		int i = Binary_Search(arr, item);
		System.out.println(i);
	}
	public static int[] takeInput() {
		int N = s.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static int Binary_Search(int[] arr, int item) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] > item) {
				hi = mid - 1;
			} else if (arr[mid] < item) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
