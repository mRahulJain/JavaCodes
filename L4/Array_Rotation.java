package L4;

import java.util.Scanner;

public class Array_Rotation {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter your Array: ");
		int[] arr = takeInput();
		System.out.println("-----------");
		System.out.println("Enter your number of rotation: ");
		int N = s.nextInt();
		arr = Rotation(arr, N);
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

	public static int[] Rotation(int[] arr, int N) {
		
		int[] arr1 = new int[arr.length];
		
		while (N < 0) {
			N = N + arr.length;
		}
		
		N = N % arr.length;
		int p = arr.length-N;
		int l = 0;
		
		for (int i = 0; i < N; i++) {
			arr1[i] = arr[p];
			p++;
		}
		
		for (int i = N ; i < arr.length; i++) {
			arr1[i] = arr[l];
			l++;
		}
		
		return arr1;
	}

	public static void display(int[] arr) {
		for (int val : arr)
			System.out.print(" " + val);
	}

}
