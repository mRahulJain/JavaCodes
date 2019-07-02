package L18;

import L14.DynamicStack;

public class QueueUsingStackDequeue {

	DynamicStack primary = new DynamicStack();

	public int dequeue() throws Exception {
		try {
			int item = primary.pop();

			return item;
		} catch (Exception e) {
			throw new Exception("Queue is empty");
		}
	}

	public void enqueue(int item) throws Exception {

		try {
			DynamicStack helper = new DynamicStack();

			while (primary.size() != 0) {
				int v = primary.pop();
				helper.push(v);
			}

			helper.push(item);

			while (helper.size() != 0) {
				int fv = helper.pop();
				primary.push(fv);
			}
		} catch (Exception e) {
			throw new Exception("Queue is Full");
		}
	}

	public int getFront() throws Exception {
		try {
			int v = primary.pop();
			primary.push(v);
			return v;
		} catch (Exception e) {
			throw new Exception("Queue is Empty");
		}
	}

	public int size() {
		return primary.size();
	}

	public boolean isEmpty() {
		return primary.size()==0;
	}

	public void display() {
		primary.display();
	}
}
