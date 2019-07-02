package L18;

import L14.DynamicQueue_Circular;

public class StackUsingQueuePush {

	DynamicQueue_Circular primary = new DynamicQueue_Circular();

	public void push(int item) throws Exception {
		try {
			primary.enqueue(item);
		} catch (Exception e) {
			throw new Exception("Stack is Full");
		}
	}

	public int pop() throws Exception {
		try {
			DynamicQueue_Circular helper = new DynamicQueue_Circular();

			while (primary.size() != 1) {
				int item = primary.dequeue();
				helper.enqueue(item);
			}

			int lv = primary.dequeue();
			primary = helper;
			return lv;
		} catch (Exception e) {
			throw new Exception("Stack is empty");
		}
	}
	
	public int peek() throws Exception {
		try {
			DynamicQueue_Circular helper = new DynamicQueue_Circular();

			while (primary.size() != 1) {
				int item = primary.dequeue();
				helper.enqueue(item);
			}

			int lv = primary.dequeue();
			helper.enqueue(lv);
			primary = helper;
			return lv;
		} catch (Exception e) {
			throw new Exception("Stack is empty");
		}
	}

	public int size() {
		return primary.size();
	}
	
	public boolean isEmpty() {
		return primary.size()==0;
	}
	
	public void display() throws Exception {
		System.out.println("--------------------------");
		display(0);
		System.out.println("--------------------------");
	}

	private void display(int count) throws Exception {
		
		try {
			if(count==primary.size())
			{
				return;
			}
			int item = primary.dequeue();
			primary.enqueue(item);
			display(count+1);
			System.out.println(item);
		} catch(Exception e) {
			throw new Exception("Error in display");
		}
		
		
		
		
		
	}
}
