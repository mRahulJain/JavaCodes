package L19;

public class BTClient {

	public static void main(String[] args) {
		// 10 true 20 true 40 false false true 50 false false true 30 false true 60
		// false false
		// 10 true 20 true 30 true 40 true 50 false false false false true 60 false true
		// 60 false true 70 false true 80 false false true 90 false false
		// 10 true 20 true 30 true 40 true 50 false false false false true 60 false true
		// 70 false true 80 false true 90 false false true 90 false true 100 false true
		// 110 false true 120 false true 130 false false
		BinaryTree bt =  new BinaryTree();
//		BinaryTree bt2 = new BinaryTree();
//		bt.display();
//		
//		System.out.println(bt.size());
//		System.out.println(bt.max());
//		System.out.println(bt.find(70));
//		System.out.println(bt.height());
//		System.out.println(bt.diameter());
//		System.out.println(bt.Diameter2());
//		
//		System.out.println(bt.isBalanced());
//		bt.preOrderR();
//		bt.postOrderR();
//		bt.inOrderR();
//		bt.preOrderI();
//		bt.postOrderI();
//		bt.inOrderI();

//		int[] post = { 1,3,2};
//		int[] in = { 1,2,3 };
//		BinaryTree bt = new BinaryTree(post, in);
//		bt.display();
//		bt.siblings();
		
//		System.out.println(bt1.structurallyIdetical(bt2));
//		bt.printAllLeafNode();
		bt.removeTheLeaves();
		bt.display();
		
	}

}
