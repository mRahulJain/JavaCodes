package L18;

import L14.DynamicQueue_Circular;

public class StackUsingQueuePop {

	DynamicQueue_Circular primary = new DynamicQueue_Circular();

	public void push(int item) throws Exception {
		try {
			DynamicQueue_Circular helper = new DynamicQueue_Circular();
			helper.enqueue(item);
			while (primary.size() != 0) {
				int i = primary.dequeue();
				helper.enqueue(i);
			}
			primary = helper;
		} catch (Exception e) {
			throw new Exception("Stack is Full");
		}
	}

	public int pop() throws Exception {
		try {
			int lv = primary.dequeue();
			return lv;
		} catch (Exception e) {
			throw new Exception("Stack is Empty");
		}
	}
	
	public int peek() throws Exception {
		try {
			int lv = primary.getFront();
			return lv;
		} catch (Exception e) {
			throw new Exception("Stack is Empty");
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
