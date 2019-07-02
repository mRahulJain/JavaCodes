package L16;

import L14.DynamicQueue_Circular;
import L14.Queue_Circular;

public class Problem4 {

	public static void main(String[] args) throws Exception {
		Queue_Circular q= new DynamicQueue_Circular();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		q.display();
		displayReverse(q,0);
		q.display();

	}

	public static void displayReverse(Queue_Circular q, int count) throws Exception {
		if(count == q.size())
		{
			return;
		}
		
		int temp = q.dequeue();
		q.enqueue(temp);
		displayReverse(q,count+1);
		
		System.out.println(temp+" ");
	
		
	}

}
