package L17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;





public class GenericTree {
	Scanner s = new Scanner(System.in);

	private class node {
		int data;
		ArrayList<node> children = new ArrayList<>();
	}

	private node root;

	public GenericTree() {
		this.root = takeInput(null, -1);
	}

	private node takeInput(node parent, int ith) {

		if (parent == null) {
			System.out.println("Enter the root node");
		} else {
			System.out.println("Enter the data for " + ith + " child of " + parent.data);
		}

		int item = s.nextInt();
		node new_node = new node();
		new_node.data = item;

		System.out.println("Enter the number of child for " + new_node.data + " ?");
		int noc = s.nextInt();

		for (int i = 0; i < noc; i++) {
			node child = takeInput(new_node, i);
			new_node.children.add(child);
		}
		return new_node;
	}

	public void display() {
		System.out.println("----------------------");
		display(this.root);
		System.out.println("----------------------");
	}

	private void display(node node) {
//		for (node child : node.children) {
//			display(child);
//		}                                      //#2                        

//		for (int i = node.children.size() - 1; i >= 0; i--) {
//			display(node.children.get(i));
//		}                                      //#3

		String str = node.data + " -> ";

		for (node child : node.children) {
			str += child.data + ", ";
		}

		str += ".";
		System.out.println(str);

//		for (int i = node.children.size() - 1; i >= 0; i--) {
//			display(node.children.get(i));
//		}                                     //#4

		for (node child : node.children) {
			display(child);
		} // #1

	}

	public int size() {
		return size(this.root);
	}

	private int size(node node) {
		int ts = 0;

		for (node child : node.children) {
			int cs = size(child);
			ts = ts + cs;
		}

		return ts + 1;

	}
	
	public int sum() {
		return sum(this.root);
	}

	private int sum(node node) {
		int sum = node.data;
		
		for(node child : node.children) {
			int val = sum(child);
			sum = sum + val;
		}
		
		return sum;
	}

	public int max() {
		return max(this.root);
	}

	private int max(node node) {
		int max = node.data;

		for (node child : node.children) {
			int maxx = max(child);
			if (maxx > max) {
				max = maxx;
			}
		}
		return max;

	}
	
	public int nextLarger(int value) {
		return nextLarger(this.root, value, value);
	}

	static int flag = 0;

	private int nextLarger(node node, int value, int ans) {
		int nL = -1;
		if (node.data > value) {
			ans = node.data;
			flag = 1;
		}
		for (node child : node.children) {
			if (flag == 1) {
				int vans = nextLarger(child, value, ans);
				if (vans < ans && vans > value) {
					ans = vans;
				}
			} else {
				int vans = nextLarger(child, value, ans);
				if (vans > ans) {
					ans = vans;
					flag = 1;
				}
			}
		}
		if(flag==0) {
			return nL;
		}
		return ans;

	}

	public boolean find(int item) {
		if (find2(this.root, item)) {
			return true;
		}
		return false;
	}

//	private int find(node node, int item) {
//		int p = 0;
//		for (node child : node.children) {
//			p = p + find(child, item);
//		}
//
//		if (item == node.data) {
//			return 1;
//		} else {
//			return p;
//		}
//	}                                work of find and find2 is same, can be done either way.

	private boolean find2(node node, int item) {
		if (node.data == item) {
			return true;
		}
		for (node child : node.children) {
			boolean cf = find2(child, item);
			if (cf) {
				return true;
			}
		}
		return false;
	}

	public int height() {
		return height(this.root) - 1;
	}

	private int height(node node) {
		int th = 0;
		for (node child : node.children) {
			int ch = height(child);
			th = Math.max(th, ch);
		}

		return th + 1;
	}

	public void mirror() {
		mirror(this.root);
	}

	private void mirror(node node) {

		int j = 0;
		for (int i = node.children.size() - 1; i >= 0; i--) {
			mirror(node.children.get(i));
			if (j <= node.children.size() / 2) {
				node temp = node.children.get(j);
				node.children.set(j, node.children.get(i));
				node.children.set(i, temp);
			}
			j++;
		}

	}

	public void preOrder() {
		preOrder(this.root);
	}

	private void preOrder(node node) {

		System.out.print(node.data + " ");

		for (node child : node.children) {
			preOrder(child);
		}

	}

	public void postOrder() {
		postOrder(this.root);
	}

	private void postOrder(node node) {

		for (node child : node.children) {
			postOrder(child);
		}

		System.out.print(node.data + " ");
	}

	public void levelOrder() throws Exception {

		LinkedList<node> queue = new LinkedList<>();
		queue.addLast(this.root);

		while (!queue.isEmpty()) {
			// remove
			node rn = queue.removeFirst();

			// print
			System.out.print(rn.data + " ");

			// insertChild
			for (node child : rn.children) {
				queue.addLast(child);
			}

		}

	}

	public void levelOrderLevelWise() {
		LinkedList<node> queue = new LinkedList<>();
		LinkedList<node> helper = new LinkedList<>();
		queue.addLast(this.root);
		System.out.println();
		while (!queue.isEmpty()) {
			// remove
			node rn = queue.removeFirst();

			// print
			System.out.print(rn.data + " ");

			// insertChild
			for (node child : rn.children) {
				helper.addLast(child);
			}

			if (queue.isEmpty()) {
				System.out.println();
				queue = helper;
				helper = new LinkedList<>();
			}
		}
	}

	public void levelOrderLevelWise2() {
		LinkedList<node> queue = new LinkedList<>();
		queue.addLast(this.root);
		queue.addLast(null);
		while (!queue.isEmpty()) {
			node rn = queue.removeFirst();
			if (rn != null) {
				System.out.println(rn.data + " ");
			} else {
				System.out.println();
			}
			for (node child : rn.children) {
				queue.addLast(child);
			}
			queue.addLast(null);

		}
	}

	public void printAtLevel(int level) {
		System.out.println();
		printAtLevel(this.root, level, 0);

	}

	private void printAtLevel(node node, int level, int count) {
		if (count == level) {
			System.out.print(node.data + " ");
			return;
		}

		for (node child : node.children) {
			printAtLevel(child, level, count + 1);
		}
	}

	private class HeapMover {
		int size;
		boolean find;
		int max = Integer.MIN_VALUE;
		int height;

		node pred;
		node succ;
		node jl;
	}

	public void multiSolver(int item) {
		HeapMover mover = new HeapMover();
		System.out.println();

		multiSolver(this.root, item, 0, mover);
		System.out.println("SIZE: " + mover.size);
		System.out.println("FIND: " + mover.find);
		System.out.println("MAX: " + mover.max);
		System.out.println("HEIGHT: " + mover.height);

		System.out.println("Pred: " + (mover.pred != null && mover.find == true ? mover.pred.data : null));
		System.out.println("Succ: " + (mover.succ == null ? null : mover.succ.data));
		System.out.println("JustLarge: " + (mover.jl == null ? null : mover.jl.data));
	}

	private void multiSolver(node node, int item, int count, HeapMover mover) {

		mover.size++;

		if (mover.succ == null && mover.find == true) {
			mover.succ = node;
		}

		if (node.data == item) {
			mover.find = true;
		}

		if (mover.find == false) {
			mover.pred = node;
		}

		if (node.data > item) {
			if(mover.jl==null || node.data<mover.jl.data) {
				mover.jl = node;
			}
		}

		if (node.data > mover.max) {
			mover.max = node.data;
		}

		if (count > mover.height) {
			mover.height = count;
		}

		for (node child : node.children) {
			multiSolver(child, item, count + 1, mover);
		}
	}
	
	
	

}
