package H_W;

import java.util.Scanner;


public class ReverseAQueue {
	protected int[] data;
	protected int front;
	private int size;

	public ReverseAQueue() {
		this.data = new int[5];
		this.front = 0;
		this.size = 0;
	}

	public ReverseAQueue(int cap) {
		this.data = new int[cap];
		this.front = 0;
		this.size = 0;
	}

	public void enqueue(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Queue is Full");
		}
		int idx = (this.front + this.size) % this.data.length;
		this.data[idx] = item;
		this.size++;
	}

	public int dequeue() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int rv = this.data[front];
		this.data[this.front] = 0;
		this.front = (this.front + 1) % this.data.length;
		this.size--;
		return rv;
	}

	public int getFront() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		return this.data[this.front];
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean isFull() {
		return this.size == this.data.length;
	}

	public void display() {
		for (int i = 0; i < this.size(); i++) {
			int idx = (i + this.front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
		System.out.println("END");
	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int N = s.nextInt();
		ReverseAQueue q = new ReverseAQueue(N);
		int T = N;
		while (T > 0) {
			q.enqueue(s.nextInt());
			T--;
		}
		actualReverse(q);
		q.display();

	}

	public static void actualReverse(ReverseAQueue q) throws Exception {
		if (q.isEmpty()) {
			return;
		}

		int temp = q.dequeue();
		actualReverse(q);

		q.enqueue(temp);

	}

}
