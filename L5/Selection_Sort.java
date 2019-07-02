package L5;

import java.util.Scanner;

public class Selection_Sort {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter your Array: ");
		int[] arr = takeInput();
		System.out.println("-----------");
		System.out.println("Sorted array");
		Selection_Sort(arr);
		display(arr);
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

	public static void display(int[] arr) {
		for (int val : arr)
			System.out.print(" " + val);
	}

	public static void Selection_Sort(int[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			int min = counter;
			for (int i = counter + 1; i < arr.length; i++) {
				if (arr[i] < arr[min]) {
					min = i;
				}
			}
			int temp = arr[counter];
			arr[counter] = arr[min];
			arr[min] = temp;
		}

	}

}
