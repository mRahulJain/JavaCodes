package H_W;

import java.util.Scanner;

public class Stock_Span {
	
	protected int[] data;
	protected int tos;

	public Stock_Span() {
		this.data = new int[5];
		this.tos = -1;
	}

	public Stock_Span(int cap) {
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
		this.data[tos]=0;
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
	static Scanner s= new Scanner(System.in);
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
		Stock_Span s = new Stock_Span(arr.length);
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

}
