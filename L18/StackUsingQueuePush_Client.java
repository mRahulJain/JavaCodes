package L18;

public class StackUsingQueuePush_Client {

	public static void main(String[] args) throws Exception {
		StackUsingQueuePush stack = new StackUsingQueuePush();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		stack.display();
//		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println();
		stack.display();

	}

}
