package L14;

import L13.Stack;

public class Dynamic_Stack_Client {

	public static void main(String[] args) throws Exception {
		Stack s= new DynamicStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		s.display();
		System.out.println(s.peek());
		s.push(40);
		s.display();
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.display();
		System.out.println(s.pop());

	}

}
