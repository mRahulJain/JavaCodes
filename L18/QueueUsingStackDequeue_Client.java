package L18;

public class QueueUsingStackDequeue_Client {

	public static void main(String[] args) throws Exception {
		QueueUsingStackDequeue queue = new QueueUsingStackDequeue();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		queue.display();
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
//		System.out.println(queue.dequeue());
		
		queue.display();

	}

}
