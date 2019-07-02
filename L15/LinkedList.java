package L15;

public class LinkedList {

	private class node {
		int data;
		node next;
	}

	private node head;
	private node tail;
	private int size;
	//O(1)
	public int size() {
		return this.size;
	}
	//O(1)
	public boolean isEmpty() {
		return this.size == 0;
	}
	//O(1)
	public int getFirst() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Linked List is Empty");
		}
		return this.head.data;
	}
	//O(1)
	public int getLast() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Linked List is Empty");
		}
		return this.tail.data;
	}
	//O(n)
	public void display() {
		System.out.println("----------------------------");
		for (node temp = this.head; temp != null; temp = temp.next) {
			System.out.print(temp.data + " ");
		}
		System.out.println(".");
		System.out.println("----------------------------");
	}
	//O(n)
	public int getAt(int k) throws Exception {
		if (isEmpty()) {
			throw new Exception("Linked List is Empty");
		}

		if (k < 0 || k > this.size()) {
			throw new Exception("Invalid index");
		}
		node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}

		return temp.data;

	}
	//O(n)
	public node getNodeAt(int k) throws Exception {
		if (isEmpty()) {
			throw new Exception("Linked List is Empty");
		}

		if (k < 0 || k > this.size()) {
			throw new Exception("Invalid index");
		}
		node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}

		return temp;

	}
	//O(1)
	public void addLast(int item) {

		// create new node
		node new_node = new node();
		new_node.data = item;
		new_node.next = null;

		// attach
		if (this.size() > 0) {
			this.tail.next = new_node;
		}

		// update data members
		if (this.size() == 0) {
			this.head = new_node;
			this.tail = new_node;
			this.size++;
		} else {
			this.tail = new_node;
			this.size++;
		}

	}
	//O(1)
	public void addFirst(int item) {
		// create new node
		node new_node = new node();
		new_node.data = item;
		new_node.next = null;

		// attach
		if (this.size > 0) {
			new_node.next = this.head;
		}

		// update data members
		if (this.size() == 0) {
			this.head = new_node;
			this.tail = new_node;
			this.size++;
		} else {
			this.head = new_node;
			this.size++;
		}
	}
	//O(n)
	public void addAt(int k, int item) throws Exception {
		if (k < 0 || k > this.size()) {
			throw new Exception("Invalid index");
		}
		// attach
		if (k == 0) {
			this.addFirst(item);
		} else if (k == this.size()) {
			this.addLast(item);
		} else {
			// create new node
			node new_node = new node();
			new_node.data = item;
			new_node.next = null;

			// getAccess
			node prev = this.getNodeAt(k - 1);
			node ahead = prev.next;

			// update data members
			prev.next = new_node;
			new_node.next = ahead;

			this.size++;
		}
	}
	//O(1)
	public int removeFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("Linked List is Empty");
		}

		int rv = this.head.data;

		// update data members
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			this.head = this.head.next;
			this.size--;
		}
		return rv;
	}
	//O(n)
	public int removeLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("Linked List is Empty");
		}
		int rv = this.tail.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			// getAccess
			node prev = getNodeAt(this.size - 2);
			// update data members
			this.tail = prev;
			prev.next = null;
			this.size--;
		}

		return rv;
	}
	//O(n)
	public int removeAt(int k) throws Exception {
		if (this.size() == 0) {
			throw new Exception("Linked List is Empty");
		}
		if (k < 0 || k >= this.size()) {
			throw new Exception("Invlaid Index");
		}
		int rv;
		if (k == 0) {
			rv = this.removeFirst();
		} else if (k == this.size - 1) {
			rv = this.removeLast();
		} else {

			// getAccess
			node prev = this.getNodeAt(k - 1);
			rv = getNodeAt(k).data;
			node ahead = this.getNodeAt(k + 1);

			// update data members
			prev.next = ahead;
			this.size--;
		}
		return rv;

	}

//	public int search(int item) {
//		int count = 0;
//		node temp = head;
//		while (temp != null) {
//			if (temp.data == item) {
//				return count;
//			}
//			count++;
//			temp = temp.next;
//		}
//		return -1;
//	}
	//O(n)
	public int getMid() {
		node slow = this.head;
		node fast = this.head;
		while (fast != null) {
			fast = fast.next;
			if (fast != null) {
				fast = fast.next;
				break;
			} else if (fast == null) {
				slow = this.head;
			}
		}
		return slow.data;
	}

	public void reverseDI() throws Exception {

		int left = 0;
		int right = this.size() - 1;

		while (left < right) {

			node ll = getNodeAt(left);
			node rr = getNodeAt(right);

			ll.data = ll.data + rr.data;
			rr.data = ll.data - rr.data;
			ll.data = ll.data - rr.data;

			left++;
			right--;
		}

	}

	public void reversePI() {

		node prev = this.head;
		node current = prev.next;

		while (current != null) {
			node ahead = current.next;

			current.next = prev;

			prev = current;
			current = ahead;

		}

		node pHead = this.tail;
		this.tail = this.head;
		this.head = pHead;

		this.tail.next = null;

	}

	public void reversePR() {
		reversePR(this.head, this.head.next);
	}

	private void reversePR(node prev, node current) {
		if (current.next == null) {
			current.next = prev;
			this.head = current;
			this.tail = prev;
			return;
		}

//		node ahead = current.next;
//		current.next = prev;
//		reversePR(prev.next, ahead); // work is processed while going deep inside the recursion.

		reversePR(prev.next, current.next);
		current.next = prev;

		this.tail = prev;
		this.tail.next = null;

	}

	public void reverseDRReturn() {
		reverseDRReturn(this.head, this.head.next, 0);
	}

	private node reverseDRReturn(node a, node b, int count) {
		if (b == null) {
			return a;
		}

		a = reverseDRReturn(a, b.next, count + 1);

		if (count >= size / 2) {
			int temp = b.data;
			b.data = a.data;
			a.data = temp;
		}
		return a.next;
		// a==left
		// b==right
	}

	private class heapMover {
		node left;
	}

	public void reverseDRHeap() {
		heapMover mover = new heapMover();
		mover.left = this.head;
		reverseDRHeap(mover, this.head, 0);
	}

	private void reverseDRHeap(heapMover mover, node b, int count) {
		if (b == null) {
			return;
		}

		reverseDRHeap(mover, b.next, count + 1);

		if (count >= size / 2) {
			int temp = b.data;
			b.data = mover.left.data;
			mover.left.data = temp;
		}

		mover.left = mover.left.next;
	}

	public void fold() {
		heapMover mover = new heapMover();
		mover.left = this.head;
		fold(mover, this.head, 0);
	}

	private void fold(heapMover mover, node right, int count) {
		if (right == null) {
			return;
		}

		fold(mover, right.next, count + 1);

		if (count > this.size / 2) {
			node ahead = mover.left.next;
			mover.left.next = right;
			right.next = ahead;
			mover.left = ahead;
		}

		if (count == this.size / 2) {
			this.tail = right;
			this.tail.next = null;
		}
	}

	public void kthFromLast(int k) {
		node a = this.head;
		node b = this.head;
		int count =1;
		while(count<=k)
		{
			b=b.next;
			count++;
		}
		
		while(b!=null)
		{
			a=a.next;
			b=b.next;
		}
		
		System.out.println(a.data);
		
		
	}

}
