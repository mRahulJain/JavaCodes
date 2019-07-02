package H_W;

import java.util.Scanner;

public class Increasing_Decreasing_Seq {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int N = s.nextInt();
		int[] arr = takeInput(N);
		
		System.out.println(answer(arr));
	}

	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static boolean answer(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {

			if ((isSortedDescending(arr, 0, i) && isSortedAscending(arr, i+1, arr.length-1))) {
				return true;
			}

		}
		return false;
	}

	public static boolean isSortedDescending(int[] arr, int start, int end) {
		int flag1 = 0;
		if(end==0)
		{
			flag1=1;
			return true;
		}
		for (int i = start; i < end; i++) {
			
			if (arr[i] > arr[i + 1]) {
				flag1 = 1;
			} else {
				flag1 = 0;
				break;
			}
		}
		return flag1 == 1;
	}

	public static boolean isSortedAscending(int[] arr, int start, int end) {
		int flag1 = 0;
		if(start==end)
		{
			return true;
		}
		for (int i = start; i < end; i++) {
			
			if (arr[i] < arr[i + 1]) {
				flag1 = 1;
			} else {
				flag1 = 0;
				break;
			}
		}
		return flag1 == 1;
	}
}
