package H_W;

import java.util.Scanner;

public class Linear_Srch {
		static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
	        int[] arr = takeInput();
			int item = s.nextInt();
			int R= linearSearch(arr,item);
			System.out.println(R);

		}

		public static int[] takeInput() {
			int N = s.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = s.nextInt();
			}
			return arr;
		}

		public static int linearSearch(int[] arr, int item) {
			int flag = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == item) {
					flag = 1;
					return i;
				}
			}
			return -1;
		}

}

