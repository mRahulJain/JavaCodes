package L16;

import L13.Stack;
import L14.DynamicStack;

public class Problem1 {

	public static void main(String[] args) throws Exception {
		Stack s= new DynamicStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		s.display();
		displayReverse(s);
		s.display();
		
	}

	public static void displayReverse(Stack s) throws Exception {
		if(s.isEmpty())
		{
			return;
		}
		
		int temp = s.pop();
		displayReverse(s);
		
		System.out.println(temp);
		
		s.push(temp);
		
	}

}
