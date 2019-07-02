package L16;

import L14.DynamicQueue_Circular;
import L14.Queue_Circular;


public class Problem5 {

	public static void main(String[] args) throws Exception {
		Queue_Circular q= new DynamicQueue_Circular();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		q.display();
		actualReverse(q);
		q.display();
	}

	public static void actualReverse(Queue_Circular q) throws Exception {
		if(q.isEmpty())
		{
			return;
		}
		
		int temp = q.dequeue();
		actualReverse(q);
		
		q.enqueue(temp);
		
	}

}
