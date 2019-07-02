package L20;

public class BSTClient {

	public static void main(String[] args) {
		int in[] = { 5, 10, 15, 20, 25, 30, 35 };
		BST bst = new BST(in);
		bst.display();
//		System.out.println(bst.find(30));
//		System.out.println(bst.find(40));
//		System.out.println(bst.max());
//		System.out.println(bst.size());
//		System.out.println(bst.height());
//		System.out.println(bst.Diameter());
		bst.addR(27);
		bst.addR(26);
		bst.display();
		
		bst.remove(20);
		bst.display();
		
//		bst.printDec();
//		
//		bst.printInRange(10, 30);
//		
//		bst.replaceWithSumLarger();
//		bst.display();
		
		
	}

}
