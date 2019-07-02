package H_W;

import java.util.Scanner;

class Queue {

	protected int size;

	protected int front;
	protected int[] data;

	public Queue() {
		this.size = 0;
		this.front = 0;
		this.data = new int[5];
	}

	public Queue(int cap) {
		this.size = 0;
		this.front = 0;
		this.data = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enqueue(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Queue is Full");
		}
		int idx = this.size;
		this.data[idx] = item;
		this.size++;
	}

	public boolean isFull() {
		return this.size == this.data.length;
	}

	public int dequeue() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int rv = this.data[front];
		for(int i = 0; i<this.size()-1;i++) {
			this.data[i] =this.data[i+1];
		}
		this.size--;
		return rv;
	}

	public int getFront() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");
		}

		int rv = this.data[front];

		return rv;
	}

	public void display() {
		System.out.println();
		for (int i = 0; i < size; i++) {
			int idx = (i + front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
		System.out.print("END");
	}

	public int getMin() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < size; i++) {
			if (this.data[i] < min) {
				min = this.data[i];
			}
		}
		return min;
	}

	public int getMax() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < size; i++) {
			if (this.data[i] > max) {
				max = this.data[i];
			}
		}
		return max;
	}

	public static void Sum(int[] arr, int n, int k) throws Exception {

		Queue q = new Queue(k);
		for (int i = 0; i < k; i++) {
			q.enqueue(arr[i]);
		}
		int limit = k;
		int ans = 0;
		int j = 0;
		do {
			int min = q.getMin();
			int max = q.getMax();
			ans = ans + min + max;
			q.dequeue();
			if(k<arr.length) {
				q.enqueue(arr[k]);
			}
			k++;
			j++;
		} while (j <= arr.length-limit);

		System.out.println(ans);
	}

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		int t = scn.nextInt();

		while (t > 0) {
			int n = scn.nextInt();
			int k = scn.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}

			Sum(arr, n, k);

			t--;
		}

	}

}