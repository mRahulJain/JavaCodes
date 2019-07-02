package L5;

import java.util.Scanner;

public class Array_Binary_Search {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println("Enter your array in sorted order.");
		int[] arr = takeInput();
//		System.out.println("Enter number to be searched: ");
//		int item = s.nextInt();
//		int i = Binary_Search(arr, item);
//		System.out.println("Present in index number: " + i);
//		Bubble_Sort(arr);
//		System.out.println("Sorted array:");
//		System.out.println();
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
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

	public static void Bubble_Sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
