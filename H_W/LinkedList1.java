package H_W;

import java.util.Scanner;

public class LinkedList1 {

	private class node {
		int data;
		node next;
	}

	static Scanner scn = new Scanner(System.in);
	private node head;
	// node head;
	private node tail;
	private int size;

	public int size() {
		return this.size;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		LinkedList1 list1 = new LinkedList1();
		LinkedList1 list2 = new LinkedList1();
		
//		int n = scn.nextInt();
//
//		for (int i = 0; i < n; i++) {
//			list.addlast(scn.nextInt());
//		}
//		list.evenAfterOdd(list);
//		list.display();
		int n=scn.nextInt();
		for(int i=0;i<n;i++) {
			int h=scn.nextInt();
			if(h%2==0) {
				list2.addlast(h);
			}else {
				list1.addlast(h);
			}
		}
		
		list1.merge1(list1, list2);
	list1.display();

	}

	public void deleteduplicate() throws Exception {

		if (head == null) {
			throw new Exception("LL is empty");
		}
		node temp1 = head;

		while (temp1 != null) {

			// System.out.println(temp1.data);
			node temp2 = temp1.next;
			while (temp2 != null) {
				// System.out.println(temp2.data);
				if (temp1.data == temp2.data) {
					int k = getindex(temp2.data);
					removeat(k);
				}
				temp2 = temp2.next;
			}

			temp1 = temp1.next;
		}

	}

	public void merge1(LinkedList1 list1, LinkedList1 list2) throws Exception {
		// int k=list1.getindex(tail.data);
		list1.tail.next = list2.head;

		// list1.tail

	}

	public void merge(LinkedList1 list1, LinkedList1 list2, LinkedList1 list3) throws Exception {
		// int k=list1.getindex(tail.data);
		if (list3 != null || list1 != null || list2 != null) {
			list1.tail.next = list2.head;
			list2.tail.next = list3.head;
			// list1.tail
		}

	}

	public int getindex(int ele) throws Exception {
		// System.out.println("----------------");
		int c = -1;
		int flag = 0;
		if (head == null) {
			throw new Exception("LL is empty");
		}
		node temp = head;
		while (temp != null) {
			// System.out.print(temp.data + " ");
			c++;
			if (temp.data == ele) {
				// c++;
				flag++;
				if (flag != 1) {
					return c;
				}

			}
			temp = temp.next;
		}
		// System.out.println();
		// System.out.println("------------------");
		return c;
	}

	public void reverseDIk(LinkedList1 list, int k) throws Exception {
		int c = (this.size - 1) / k;
		int i = 0;
		while (i < c) {
			int right = k - 1;
			int left = 0;
			while (left < right) {
				node ln = getnodeat(left);
				node rn = getnodeat(right);
				// swap
				int temp = ln.data;
				ln.data = rn.data;
				rn.data = temp;

				left++;
				right--;
			}
			left = right;
			right = right + (k - 1);
			i++;

		}

		// left=right;
		// right=right+((this.size-1)/k);

		display();

	}

	public void deletefromLL(int k) throws Exception {

		if (k < 0 || k > this.size) {
			return;
		}
		if (k == 0) {
			removefirst();
			return;

		}

		removeat(k);

	}

	public boolean palindrome() throws Exception {
		int i = 0;
		int j = this.size - 1;
		return palindrome(this.head, i, j);

	}

	private boolean palindrome(node node, int i, int j) throws Exception {

		if (node == null) {
			return false;
		}
		node temp = getnodeat(i);
		node temp1 = getnodeat(j);

		if (temp.data != temp1.data) {
			return false;

		}
		palindrome(node.next, i++, j--);

		return true;
	}

	public void swap(int ele, int ele1) throws Exception {
		int k = getindex(ele);
		int l = getindex(ele1);
		if (k < 0 || k > this.size()) {
			return;
		}
		if (l < 0 || l > this.size()) {
			return;
		}

		node kth = getnodeat(k - 1);
		node lth = getnodeat(l - 1);
		int temp = kth.data;
		kth.data = lth.data;
		lth.data = temp;

//		display();
	}

	public boolean isempty() {
		return this.size() == 0;
	}

	public int getfirst() throws Exception {
		if (head == null) {
			throw new Exception("LL is empty");
		}

		return this.head.data;
	}

	public int getlast() throws Exception {
		if (head == null) {
			throw new Exception("LL is empty");
		}

		return this.tail.data;
	}

	public void display() throws Exception {
		// System.out.println("----------------");

		if (head == null) {
			throw new Exception("LL is empty");
		}
		node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		// System.out.println();
		// System.out.println("------------------");

	}

	public int getat(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");

		}
		if (k < 0 || k >= size()) {
			throw new Exception("invalid index");
		}
		node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private node getnodeat(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");

		}
		if (k < 0 || k >= size()) {
			throw new Exception("invalid index");
		}
		node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addlast(int item) {
		// create new node
		node nn = new node();
		nn.data = item;
		nn.next = null;
		// attach
		if (size() == 0) {
			this.head = nn;
			this.tail = nn;
//		            size++;
		} else if (size() > 0) {
			this.tail.next = nn;
			this.tail = nn;
		}

		// update

		size++;

	}

	public void addfirst(int item) {
		node nn = new node();
		nn.data = item;
		nn.next = null;
		if (size() == 0) {
			this.head = nn;
			this.tail = nn;

		} else if (size() > 0) {
			nn.next = head;
			this.head = nn;

		}
		size++;

	}

	public void addat(int item, int k) throws Exception {

		if (k < 0 || k > this.size()) {
			throw new Exception("invalid index");
		}
		if (k == 0) {
			addfirst(item);
		}
		if (k == size()) {
			addlast(item);
		} else {
			node nn = new node();
			nn.data = item;
			nn.next = null;
			node prev = getnodeat(k - 1);
			node ahead = getnodeat(k);// prev.next
			prev.next = nn;
			nn.next = ahead;
			this.size++;
		}

	}

	public int removeat(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty.");

		}
		if (k < 0 || k >= size()) {
			throw new Exception("invalid index.");
		}
		node prev = getnodeat(k - 1);
		node ahead = getnodeat(k);
//		         System.out.println(ahead.data);
		prev.next = ahead.next;
		size--;

		return ahead.data;

	}

	public void duplicates() throws Exception {
		if (head == null) {
			throw new Exception("LL is empty");
		}
		node temp = head;
		node temp2 = head.next;
		while (temp != null) {
			while (temp2 != null) {
				if (temp.data == temp2.data) {

				}
			}
		}
	}

	public int removeat1(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty.");

		}
		if (k < 0 || k >= size()) {
			throw new Exception("invalid index.");
		}

		if (k == 0) {
			return removefirst();
		}

		if (k == this.size - 1) {
			return removelast();
		}

		node prev = getnodeat(k - 1);
		node ahead = getnodeat(k);
//		         System.out.println(ahead.data);
		prev.next = ahead.next;
		size--;

		return ahead.data;

	}

	public int removefirst() throws Exception {
		if (this.size() == 0) {
			throw new Exception("LL is empty");

		}
		int temp = this.head.data;

		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}

		return temp;
	}

	public int removelast() throws Exception {
		if (this.size() == 0) {
			throw new Exception("LL is empty");

		}
		int ele = this.tail.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			node sm2 = getnodeat(this.size - 2);
			sm2.next = null;
			this.tail = sm2;
			this.size--;
		}

		return ele;
		// return this.tail.data;---- false because it print uptated value of head----
	}

	public int midll() {
		node slow = this.head;
		node fast = this.head;
		while (fast.next != null && fast.next.next != null) {

			slow = slow.next;

			fast = fast.next.next;

		}
		return slow.data;
	}

	public void reverseDI(LinkedList1 list) throws Exception {
		int right = this.size - 1;
		int left = 0;
		while (left < right) {
			node ln = getnodeat(left);
			node rn = getnodeat(right);
			// swap
			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;

			left++;
			right--;
		}
		display();

	}

	public void reversePI(LinkedList1 list) throws Exception {

		// node prev=getnodeat(0);
		// node curr=getnodeat(1);
		// node ahead=getnodeat(2);
		node prev = this.head;
		node curr = head.next;

		while (curr != null) {
			node ahead = curr.next;
			curr.next = prev;

			// update
			prev = curr;
			curr = ahead;

		}
		// swap
		node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

		this.tail.next = null;

		display();

	}

	public void reversePR() {
		reversePR(this.head, this.head.next);
		node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;

	}

	private void reversePR(node prev, node curr) {

		if (curr == null) {

			return;
		}

		reversePR(curr, curr.next);
		curr.next = prev;
	}

	private void reversePR1(node prev, node curr) {

		if (curr == null) {
			return;
		}
		node ahead = curr.next;
		curr.next = prev;
		reversePR1(curr, ahead);

	}

	public void reverseDR() {

		reverseDR(this.head, this.head, 0);
	}

	private node reverseDR(node left, node right, int count) {
		if (right == null) {
			return left;
		}

		left = reverseDR(left, right.next, count + 1);

		if (count >= this.size / 2) {
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
		}

		return left.next;
	}

	private class heapMover {
		node left;
	}

	public void reverseDRheap() {
		heapMover mover = new heapMover();
		mover.left = this.head;
		reverseDRheap(mover, this.head, 0);
	}

	private void reverseDRheap(heapMover mover, node right, int count) {
		if (right == null) {
			return;
		}

		reverseDRheap(mover, right.next, count + 1);
		// swap
		if (count >= size / 2) {
			int temp = mover.left.data;
			mover.left.data = right.data;
			right.data = temp;

			mover.left = mover.left.next;
		}
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

		node ahead = mover.left.next;
		// links
		if (count > size / 2) {
			mover.left.next = right;
			right.next = ahead;
			// update
			mover.left = ahead;

		}

		if (count == size / 2) {
			this.tail = right;
			this.tail.next = null;

		}

	}

	public int kthfromlast(int k) {

		node slow = this.head;

		node fast = this.head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}

	public int countEven(LinkedList1 list) {
		node curr = this.head;
		int count = 0;
		while (curr != null) {
			if (curr.data % 2 == 0) {
				count++;
			}
			curr = curr.next;
		}
		return count;
	}

	public void evenAfterOdd(LinkedList1 list) throws Exception {
		
		if(list.size()==1) {
			return;
		}

		int even = countEven(list);
		int count = 0;
		node prev = this.head;
		node curr = prev.next;
		node last = getnodeat(this.size() - 1);
		while (prev.data % 2 == 0 && count < even) {
			last.next = prev;
			this.head = curr;
			last = prev;
			last.next = null;
			prev = curr;
			curr = prev.next;
			count++;
		}
		while (curr != null && count < even) {
			if (curr.data % 2 == 0) {
				prev.next = curr.next;
				curr.next = null;
				last.next = curr;
				last = curr;
				last.next = null;
				curr = prev.next;
				count++;
			} else {
				curr = curr.next;
				prev = prev.next;
			}
		}

	}
}
