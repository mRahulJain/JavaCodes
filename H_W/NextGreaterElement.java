package H_W;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int T = s.nextInt();
		while (T > 0) {
			int[] arr = takeInput();
			NextGreater(arr);
			T--;
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


	public static void NextGreater(int[] arr) throws Exception {

		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < arr.length; i++) {

			while (!s.isEmpty() && s.peek() < arr[i]) {
				int temp = s.pop();
				System.out.println(temp + "," + arr[i]);
			}
			s.push(arr[i]);
		}

		while (!s.isEmpty())

		{
			int temp = s.pop();
			System.out.println(temp + ",-1");
		}

	}

}


