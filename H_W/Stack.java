package HW;

import java.util.Scanner;

public class Stack {
	
	static Scanner scn = new Scanner(System.in);

	protected int[] data;
	protected int tos;

	public Stack() {
		this.data = new int[5];
		this.tos = -1;
	}

	public Stack(int cap) {
		this.data = new int[cap];
		this.tos = -1;
	}

	public static void main(String[] args) throws Exception {
		int[] arr = takeInput();

		NextGreater(arr);

	}

	public static void NextGreater(int[] arr) throws Exception {

		Stack s = new Stack();

		for (int i = 0; i < arr.length; i++) {

			while (!s.isEmpty() && s.peek() < arr[i]) {
				int temp = s.pop();
				System.out.print(arr[i] + " ");
			}
			s.push(arr[i]);
		}

		while (!s.isEmpty())

		{
			int temp = s.pop();
			System.out.print("-1");
		}

	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public void push(int item) throws Exception {

		if (isFull()) {
			int[] oa = this.data;
			int[] na = new int[(oa.length) * 2];

			for (int i = 0; i < oa.length; i++) {
				na[i] = oa[i];
			}
			this.data = na;
		}

		this.tos++;
		this.data[this.tos] = item;
	}

	public int pop() throws Exception {

		if (isEmpty()) {
			throw new Exception("Stack Empty");
		}

		int rv = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;
		return rv;
	}

	public int peek() throws Exception {

		if (isEmpty()) {
			throw new Exception("Stack Empty");
		}

		return this.data[this.tos];
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isEmpty() {

		return this.size() == 0;
	}

	public boolean isFull() {

		return this.size() == this.data.length;
	}

	public void display() {

		System.out.println("-----------");
		for (int i = this.tos; i >= 0; i--) {
			System.out.print(this.data[i] + " ");
		}
		System.out.println(".");
		System.out.println("-----------");

	}

}
