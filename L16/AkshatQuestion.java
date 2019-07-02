package L16;

import java.util.Scanner;

import L13.Stack;
import L14.DynamicStack;

public class AkshatQuestion {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		int[] arr = takeInput();
		System.out.println(result(arr));

	}

	
	
	public static int[] takeInput() {
		int N = s.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static int result(int[] arr) throws Exception {
		Stack s = new DynamicStack();
		int count = 0;
		int prevSum = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!s.isEmpty() && s.peek() < arr[i]) {
				sum = s.peek() + arr[i];
				if (sum == prevSum) {
					count++;
				} else if (sum > prevSum) {
					prevSum = sum;
					count = 1;
				}
				s.pop();
				s.push(arr[i]);

			}

			while (!s.isEmpty() && s.peek() > arr[i]) {
				sum = s.peek() + arr[i];
				if (sum == prevSum) {
					count++;
				} else if (sum > prevSum) {
					prevSum = sum;
					count = 1;
				}
				break;

			}

			if (i == 0)
				s.push(arr[i]);

		}

		while (!s.isEmpty()) {
			s.pop();
		}
		return count;
	}

}
