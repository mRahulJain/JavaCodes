package L14;

public class DynamicQueueCircular_Client {

	public static void main(String[] args) throws Exception {
		Queue_Circular q= new DynamicQueue_Circular();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(70);
		q.display();
		System.out.println(q.dequeue());
		q.display();
		System.out.println(q.getFront());
		System.out.println(q.size());
		q.dequeue();
		q.dequeue();
		System.out.println(q.isEmpty());

	}

}
