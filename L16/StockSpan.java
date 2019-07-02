package L16;

import java.util.Scanner;

import L13.Stack;
import L14.DynamicStack;

public class StockSpan {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int T = s.nextInt();
		while (T > 0) {
			int[] prices = takeInput();
			int[] arr = stockSpan(prices);

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "  ");
			}
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

	public static int[] stockSpan(int[] prices) throws Exception {
		int[] arr = new int[prices.length];
		Stack s = new DynamicStack();
		for (int i = 0; i < prices.length; i++) {
			while (!s.isEmpty() && prices[s.peek()] < prices[i]) {
				s.pop();
			}
			if (s.isEmpty()) {
				arr[i] = i + 1;
			} else {
				arr[i] = i - s.peek();
			}

			s.push(i);

		}
		return arr;
	}

//	public static int[] stockSpan2(int[] prices) {
//		int[] arr = new int[prices.length];
//		Stack s = new DynamicStack();
//
//		for (int i = 0; i < prices.length; i++) {
//			int count = 1;
//		}
//
//		return arr; // count leke try kario;
//	}

}
