package L21;

public class LinkedListGeneric<T> {

	private class node {
		T data;
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
	public T getFirst() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Linked List is Empty");
		}
		return this.head.data;
	}
	//O(1)
	public T getLast() throws Exception {
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
	public T getAt(int k) throws Exception {
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
	public void addLast(T item) {

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
	public void addFirst(T item) {
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
	public void addAt(int k, T item) throws Exception {
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
	public T removeFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("Linked List is Empty");
		}

		T rv = this.head.data;

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
	public T removeLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("Linked List is Empty");
		}
		T rv = this.tail.data;
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
	public T removeAt(int k) throws Exception {
		if (this.size() == 0) {
			throw new Exception("Linked List is Empty");
		}
		if (k < 0 || k >= this.size()) {
			throw new Exception("Invlaid Index");
		}
		T rv;
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


}
