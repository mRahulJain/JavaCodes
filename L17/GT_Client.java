package L17;

public class GT_Client {

	public static void main(String[] args) throws Exception {
		//10 3 20 2 50 0 60 0 30 0 40 1 70 0
		
		int N = 120;
		// 80 3 40 2 110 0 120 0 60 0 70 1 140 0
		GenericTree gt = new GenericTree();
		gt.display();
//		System.out.println(gt.size());
//		
//		System.out.println(gt.max());
//		
//		System.out.println(gt.find(70));
//		
//		System.out.println(gt.height());
//		gt.mirror();
//		gt.display();
		
//		gt.preOrder();
//		gt.postOrder();
		
//		gt.levelOrder();
//		
//		gt.printAtLevel(1);
//		gt.multiSolver(60);
//		
//		gt.multiSolver(50);
		
//		System.out.println(gt.nextLarger(N));
		
		System.out.println(gt.sum());
		
		
		
		
		
		
	}

}
