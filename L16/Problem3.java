package L16;

import L13.Stack;
import L14.DynamicStack;

public class Problem3 {

	public static void main(String[] args) throws Exception {
		int[] arr = { 10, 20, 3, 2, 5, 1, 70, 60 };
		nextGreaterElement(arr);
	}

	public static void nextGreaterElement(int[] arr) throws Exception {
		Stack s = new DynamicStack();

		for (int i = 0; i < arr.length; i++) {
			while (!s.isEmpty() && s.peek() < arr[i]) {
				int temp = s.pop();
				System.out.println(temp + " -> " + arr[i]);
			}
			s.push(arr[i]);
		}

		while (!s.isEmpty()) {
			int temp = s.pop();
			System.out.println(temp + " -> -1");
		}

	}

}
