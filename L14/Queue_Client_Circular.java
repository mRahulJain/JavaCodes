package L14;

public class Queue_Client_Circular {

	public static void main(String[] args) throws Exception {
		Queue_Circular q= new Queue_Circular();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
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
