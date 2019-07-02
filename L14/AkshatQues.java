package L14;

import java.util.Scanner;

public class AkshatQues {
	static Scanner s = new Scanner(System.in);

	public int[] data;
	public int tos;

	public AkshatQues(int cap) {
		this.data = new int[cap];
		this.tos = -1;
	}

	public void push(int item) throws Exception {
		if (this.isFull()) {
			throw new Exception("Stack is Full");
		}
		this.tos++;
		this.data[tos] = item;
	}

	public int pop() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int rv = this.data[tos];
		this.data[tos] = 0;
		tos--;
		return rv;
	}

	public int peek() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return this.data[tos];
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isFull() {
		return this.size() == this.data.length;
	}

	public static void main(String[] args) throws Exception {
		int T = s.nextInt();
		while (T > 0) {
			int[] arr = takeInput();
			System.out.println(result(arr));
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

	public static int result(int[] arr) throws Exception {
		AkshatQues s = new AkshatQues(arr.length);
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
