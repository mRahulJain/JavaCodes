package L19;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
	static Scanner s = new Scanner(System.in);

	private class Node {
		Node left;
		int data;
		Node right;
	}

	private Node root;

	public BinaryTree() {
		this.root = takeInput(null, false);
	}

	

	private Node takeInput(Node node, boolean ilc) {
		if (node == null) {
			System.out.println("Enter the data of the root: ");
		} else {
			if (ilc) {
				System.out.println("Enter the left child data of " + node.data);
			} else {
				System.out.println("Enter the right child data of " + node.data);
			}
		}
		int item = s.nextInt();
		Node nn = new Node();

		nn.data = item;

		System.out.println(nn.data + " has left child ?");
		boolean hlc = s.nextBoolean();
		if (hlc) {
			nn.left = takeInput(nn, true);
		}

		System.out.println(nn.data + " has right child ?");
		boolean hrc = s.nextBoolean();
		if (hrc) {
			nn.right = takeInput(nn, false);
		}

		return nn;
	}
	
	

	public void display() {
		System.out.println("-------------------------------");
		display(this.root);
		System.out.println("-------------------------------");
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}

		String str = "";
		if (node.left == null) {
			str += ".";
		} else {
			str += node.left.data;
		}
		str += "-> " + node.data + " <-";
		if (node.right == null) {
			str += ".";
		} else {
			str += node.right.data;
		}

		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {
		if (node == null) {
			return 0;
		}

		int ls = size(node.left);
		int ts = size(node.right);

		return ls + ts + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int ml = max(node.left);
		int mr = max(node.right);
		int ans = Math.max(ml, Math.max(mr, node.data));

		return ans;
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}
		boolean left = find(node.left, item);
		if (left) {
			return true;
		}
		boolean right = find(node.right, item);
		if (right) {
			return true;
		}

		return false;

	}

	public int height() {
		return height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int th = -1;

		int lh = height(node.left);
		th = Math.max(lh, th);

		int rh = height(node.right);
		th = Math.max(rh, th);

		return th + 1;
	}

	// O(n^2)
	public int diameter() {
		return diameter(this.root);
	}

	private int diameter(Node node) {
		if (node == null) {
			return 0;
		}

		int lh = height(node.left);
		int rh = height(node.right);
		int max1 = rh + lh + 2;

		int lt = diameter(node.left);
		int rt = diameter(node.right);

		return Math.max(max1, Math.max(lt, rt));

	}

	private class DiaPair {
		int diameter = 0;
		int height = -1;
		boolean isBalanced = true;
	}

	public int Diameter2() {
		return Diameter2(this.root).diameter;
	}

	private DiaPair Diameter2(Node node) {
		if (node == null) {
			DiaPair bp = new DiaPair();
			return bp;
		}

		DiaPair ldp = Diameter2(node.left);
		DiaPair rdp = Diameter2(node.right);

		DiaPair np = new DiaPair();
		np.height = Math.max(ldp.height, rdp.height) + 1;

		int lh = ldp.diameter;
		int rh = rdp.diameter;
		int max1 = ldp.height + rdp.height + 2;

		np.diameter = Math.max(max1, Math.max(lh, rh));

		return np;

	}

	public boolean isBalanced() {
		return isBalanced(this.root).isBalanced;
	}

	private DiaPair isBalanced(Node node) {
		if (node == null) {
			DiaPair bp = new DiaPair();
			return bp;
		}

		DiaPair ldb = isBalanced(node.left);
		DiaPair rdb = isBalanced(node.right);
		DiaPair np = new DiaPair();

		np.height = Math.max(ldb.height, rdb.height) + 1;

		if (ldb.isBalanced && rdb.isBalanced && Math.abs(ldb.height - rdb.height) <= 1) {
			np.isBalanced = true;
		} else {
			np.isBalanced = false;
		}

		return np;

	}

	public void preOrderR() {
		preOrderR(this.root);
		System.out.println();
	}

	private void preOrderR(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");

		preOrderR(node.left);
		preOrderR(node.right);

	}

	public void postOrderR() {
		postOrderR(this.root);
		System.out.println();
	}

	private void postOrderR(Node node) {
		if (node == null) {
			return;
		}

		postOrderR(node.left);
		postOrderR(node.right);
		System.out.print(node.data + " ");

	}

	public void inOrderR() {
		inOrderR(this.root);
		System.out.println();
	}

	private void inOrderR(Node node) {
		if (node == null) {
			return;
		}

		inOrderR(node.left);
		System.out.print(node.data + " ");
		inOrderR(node.right);

	}

	private class pair {
		Node node;
		boolean selfDone;
		boolean leftDone;
		boolean rightDone;
	}

	public void preOrderI() {
		LinkedList<pair> stack = new LinkedList<>();

		pair sp = new pair();
		sp.node = this.root;
		stack.addFirst(sp);

		while (!stack.isEmpty()) {
			pair tp = stack.getFirst();

			if (tp.node == null) {
				stack.removeFirst();
				continue;
			}

			if (tp.selfDone == false) {
				System.out.print(tp.node.data + " ");
				tp.selfDone = true;
			} else if (tp.leftDone == false) {
				pair np = new pair();
				np.node = tp.node.left;
				stack.addFirst(np);
				tp.leftDone = true;
			} else if (tp.rightDone == false) {
				pair np = new pair();
				np.node = tp.node.right;
				stack.addFirst(np);
				tp.rightDone = true;
			} else {
				stack.removeFirst();
			}
		}
		System.out.println();
	}

	public void postOrderI() {
		LinkedList<pair> stack = new LinkedList<>();

		pair sp = new pair();
		sp.node = this.root;
		stack.addFirst(sp);

		while (!stack.isEmpty()) {
			pair tp = stack.getFirst();

			if (tp.node == null) {
				stack.removeFirst();
				continue;
			}

			if (tp.leftDone == false) {
				pair np = new pair();
				np.node = tp.node.left;
				stack.addFirst(np);
				tp.leftDone = true;

			} else if (tp.rightDone == false) {
				pair np = new pair();
				np.node = tp.node.right;
				stack.addFirst(np);
				tp.rightDone = true;
			} else if (tp.selfDone == false) {
				System.out.print(tp.node.data + " ");
				tp.selfDone = true;
			} else {
				stack.removeFirst();
			}
		}
		System.out.println();
	}

	public void inOrderI() {
		LinkedList<pair> stack = new LinkedList<>();

		pair sp = new pair();
		sp.node = this.root;
		stack.addFirst(sp);

		while (!stack.isEmpty()) {
			pair tp = stack.getFirst();

			if (tp.node == null) {
				stack.removeFirst();
				continue;
			}

			if (tp.leftDone == false) {
				pair np = new pair();
				np.node = tp.node.left;
				stack.addFirst(np);
				tp.leftDone = true;

			} else if (tp.selfDone == false) {
				System.out.print(tp.node.data + " ");
				tp.selfDone = true;
			} else if (tp.rightDone == false) {
				pair np = new pair();
				np.node = tp.node.right;
				stack.addFirst(np);
				tp.rightDone = true;
			} else {
				stack.removeFirst();
			}
		}
		System.out.println();
	}

	// given two arrays: preOrder and inOrder, now construct a tree.

//	public BinaryTree(int[] pre, int[] in) {
//		this.root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
//	}
//
//	private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
//
//		if (plo > phi || ilo > ihi) {
//			return null;
//		}
//
//		Node nn = new Node();
//		nn.data = pre[plo];
//		int si = -1;
//		for (int i = ilo; i <= ihi; i++) {
//			if (in[i] == pre[plo]) {
//				si = i;
//				break;
//			}
//		}
//		int nel = si - ilo;
//		// left
//		nn.left = construct(pre, plo + 1, nel + plo, in, ilo, si - 1);
//		
//		//right
//		nn.right = construct(pre, nel + plo + 1, phi, in, si + 1, ihi);
//		
//		return nn;
//	}

	public BinaryTree(int[] post, int[] in) {
		this.root = construct1(post, 0, post.length - 1, in, 0, in.length - 1);
	}

	private Node construct1(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {

		if (plo > phi || ilo > ihi) {
			return null;
		}

		Node nn = new Node();
		nn.data = post[phi];
		int si = -1;
		for (int i = ilo; i <= ihi; i++) {
			if (in[i] == post[phi]) {
				si = i;
				break;
			}
		}
		int nel = si - ilo;
		// left
		nn.left = construct1(post, plo, nel + plo - 1, in, ilo, si - 1);

		// right
		nn.right = construct1(post, nel + plo, phi - 1, in, si + 1, ihi);

		return nn;
	}

	public void siblings() {
		siblings(this.root);
	}

	private void siblings(Node node) {
		if (node.left == null && node.right == null) {
			return;
		}
		if (node.left == null && node.right != null) {
			System.out.print(node.right.data + " ");
		}
		if (node.right == null && node.left != null) {
			System.out.print(node.left.data + " ");
		}
		if (node.left != null) {
			siblings(node.left);
		}
		if (node.right != null) {
			siblings(node.right);
		}
	}

	public boolean structurallyIdetical(BinaryTree other) {
		return structurallyIdetical(this.root, other.root);
	}

	static int flag = 0;

	private boolean structurallyIdetical(Node tnode, Node onode) {
		if (tnode == null && onode == null) {
			return true;
		}

		if (flag == 1) {
			return false;
		}

		if (tnode == null && onode != null) {
			flag = 1;
			return false;
		}
		if (tnode != null && onode == null) {
			flag = 1;
			return false;
		}
		if (tnode.data != onode.data) {
			flag = 1;
			return false;
		}

		if (flag == 0) {
			structurallyIdetical(tnode.left, onode.left);
			structurallyIdetical(tnode.right, onode.right);
		}

		return true;
	}

	public void printAllLeafNode() {
		printAllLeafNode(this.root);
	}

	private void printAllLeafNode(Node node) {
		if (node == this.root && node.left == null && node.right == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			System.out.print(node.data + " ");
		}
		if (node.left != null) {
			printAllLeafNode(node.left);
		}
		if (node.right != null) {
			printAllLeafNode(node.right);
		}

	}
	
	public void removeTheLeaves() {
		removeTheLeaves(this.root);
	}



	private void removeTheLeaves(Node node) {
		if(node==null) {
			return;
		}
		
		if(node == this.root && node.left==null && node.right == null) {
			return;
		}
		
		if(node.right!=null && node.left==null && node.right.right==null) {
			node.right=null;
		}
		
		if(node.left!=null && node.right==null && node.left.left==null) {
			node.left=null;
		}
		
		if(node.left!=null && node.right!= null && node.left.left==null && node.right.right == null) {
			node.left = null;
			node.right = null;
		}
		
		removeTheLeaves(node.left);
		removeTheLeaves(node.right);
	}

}
