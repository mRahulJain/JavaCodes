package L14;

public class Queue_Client_Linear {

	public static void main(String[] args) throws Exception {
		Queue_Linear q= new Queue_Linear();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		System.out.println(q.dequeue());
		q.enqueue(40);
		q.display();
		System.out.println(q.getFront());
		System.out.println(q.size());
		q.dequeue();
		q.dequeue();
		System.out.println(q.isEmpty());
	}

}
