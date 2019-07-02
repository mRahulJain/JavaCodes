package L18;

import L14.DynamicStack;

public class QueueUsingStackEnqueue {

	DynamicStack primary = new DynamicStack();

	public void enqueue(int item) throws Exception {
		try {
			primary.push(item);
		} catch (Exception e) {
			throw new Exception("Queue is Full");
		}
	}

	public int dequeue() throws Exception {
		try {
			DynamicStack helper = new DynamicStack();

			while (primary.size() != 1) {
				int item = primary.pop();
				helper.push(item);
			}
			int lv = primary.pop();
			while(helper.size()!=0) {
				int item = helper.pop();
				primary.push(item);
			}
			
			return lv;
		} catch (Exception e) {
			throw new Exception("Queue is Empty");
		}
	}
	
	public int getFront() throws Exception {
		try {
			DynamicStack helper = new DynamicStack();

			while (primary.size() != 1) {
				int item = primary.pop();
				helper.push(item);
			}
			int lv = primary.pop();
			helper.push(lv);
			while(helper.size()!=0) {
				int item = helper.pop();
				primary.push(item);
			}
			
			return lv;
		} catch (Exception e) {
			throw new Exception("Queue is Empty");
		}
	}
	
	public boolean isEmpty() {
		return primary.size()==0;
	}

	public int size() {
		return primary.size();
	}
	
	public void display() throws Exception {
		System.out.println("-------------------------");
		displayI();
		System.out.println("-------------------------");
	}

	private void displayI() throws Exception {
		if(primary.size()==0)
		{
			return;
		}
		
		int rv;
		try {
			rv = primary.pop();
			displayI();
			System.out.println(rv);
			primary.push(rv);
		} catch (Exception e) {
			throw new Exception("Error in Display");
		}
		
		
	}
}
