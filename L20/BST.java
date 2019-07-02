package L20;

public class BST {

	private class Node {
		Node left;
		int data;
		Node right;
	}

	private Node root;

	public BST(int in[]) {
		this.root = construct(in, 0, in.length - 1);
	}

	private Node construct(int in[], int ilo, int ihi) {
		if (ilo > ihi) {
			return null;
		}
		int mid = (ilo + ihi) / 2;
		Node nn = new Node();
		nn.data = in[mid];

		nn.left = construct(in, ilo, mid - 1);
		nn.right = construct(in, mid + 1, ihi);

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
		if (node.right == null) {
			return node.data;
		}

		return max(node.right);
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null) {
			return false;
		}

		if (item < node.data) {
			return find(node.left, item);
		} else if (item > node.data) {
			return find(node.right, item);
		} else {
			return true;
		}
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

	private class DiaPair {
		int diameter = 0;
		int height = -1;
		boolean isBalanced = true;
	}

	public int Diameter() {
		return Diameter(this.root).diameter;
	}

	private DiaPair Diameter(Node node) {
		if (node == null) {
			DiaPair bp = new DiaPair();
			return bp;
		}

		DiaPair ldp = Diameter(node.left);
		DiaPair rdp = Diameter(node.right);

		DiaPair np = new DiaPair();
		np.height = Math.max(ldp.height, rdp.height) + 1;

		int lh = ldp.diameter;
		int rh = rdp.diameter;
		int max1 = ldp.height + rdp.height + 2;

		np.diameter = Math.max(max1, Math.max(lh, rh));

		return np;

	}

	public void printDec() {
		printDec(this.root);
		System.out.println();
	}

	private void printDec(Node node) {
		if (node == null) {
			return;
		}

		printDec(node.right);
		System.out.print(node.data + " ");
		printDec(node.left);
	}

	public void printInRange(int lo, int hi) {
		printInRange(this.root, lo, hi);
		System.out.println();
	}

	private void printInRange(Node node, int lo, int hi) {
		if (node == null) {
			return;
		}

		if (node.data > hi && node.data > lo) {
			printInRange(node.left, lo, hi);
		} else if (node.data < hi && node.data < lo) {
			printInRange(node.right, lo, hi);
		} else {
			printInRange(node.left, lo, hi);
			System.out.print(node.data + " ");
			printInRange(node.right, lo, hi);
		}
	}

	private class HeapMover {
		int sum = 0;
	}

	public void replaceWithSumLarger() {
		HeapMover mover = new HeapMover();
		replaceWithSumLarger(this.root, mover);
	}

	private void replaceWithSumLarger(Node node, HeapMover mover) {
		if (node == null) {
			return;
		}

		replaceWithSumLarger(node.right, mover);

		int temp = node.data;
		node.data = mover.sum;
		mover.sum += temp;

		replaceWithSumLarger(node.left, mover);
	}

	public void addI(int item) {
		addI(this.root, item);
	}

	private void addI(Node node, int item) {
		int flag = 0;
		Node nn = new Node();
		nn.data = item;
		do {
			while (item <= node.data && flag == 0) {
				if (node.left == null) {
					node.left = nn;
					flag = 1;
					break;
				} else {
					node = node.left;
				}
			}
			while (item > node.data && flag == 0) {
				if (node.right == null) {
					node.right = nn;
					flag = 1;
					break;
				} else {
					node = node.right;
				}
			}
		} while (flag == 0);
	}

	public void addR(int item) {
		addR(this.root, item);
	}

	private void addR(Node node, int item) {
		Node nn = new Node();
		nn.data = item;
		if (node.data > item) {
			if (node.left != null) {
				addR(node.left, item);
			} else {
				node.left = nn;
			}
		} else {
			if (node.right != null) {
				addR(node.right, item);
			} else {
				node.right = nn;
			}
		}
	}

	public void remove(int item) {
		remove(this.root, null, item);
	}

	private void remove(Node node, Node parent, int item) {
		if (node.data > item) {
			remove(node.left, node, item);
		} else if (node.data < item) {
			remove(node.right, node, item);
		} else {
			if (node.left == null && node.right == null) {
				if (node.data < parent.data) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			} else if (node.left != null && node.right == null) {
				if (node.data < parent.data) {
					parent.left = node.left;
				} else {
					parent.right = node.left;
				}
			} else if (node.left == null && node.right != null) {
				if (node.data < parent.data) {
					parent.left = node.right;
				} else {
					parent.right = node.right;
				}
			} else {
				int lmax = max(node.left);
				remove(node.left, node, lmax);
				
				node.data = lmax;
			}
		}

	}
	
//	public boolean isBST() {
//		if(isBST(this.root)) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	private boolean isBST(Node node) {
//		if(node.left.data<node.data) {
//			isBST(node.left);
//		}
//	}

}
