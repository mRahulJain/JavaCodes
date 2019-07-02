package L15;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		LinkedList list = new LinkedList();
		
		list.addLast(10);
		list.addLast(30);
		list.addLast(50);
		list.addLast(70);
		list.addFirst(20);
		list.addFirst(100);
		list.addFirst(120);
		
//		System.out.println(list.getMid());
		
		
		list.display();
		
//		list.reverseDI();
		
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		System.out.println(list.getAt(2));
//		
//		list.addAt(3, 100);
//		list.display();
//		
//		System.out.println(list.removeFirst());
//		list.display();
//		
//		System.out.println(list.removeLast());
//		System.out.println(list.removeLast());
//		list.display();
//		System.out.println(list.removeAt(1));
		
		
		list.display();
		
		list.reverseDRHeap();
		
		list.display();
		
		list.fold();
		
		list.display();
		
		list.kthFromLast(3);

	}

}
