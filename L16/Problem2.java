package L16;

import L13.Stack;
import L14.DynamicStack;

public class Problem2 {

	public static void main(String[] args) throws Exception {
		Stack s = new DynamicStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		s.display();
		actualReverse(s, new DynamicStack());
		s.display();

	}

	private static void actualReverse(Stack s, Stack helper) throws Exception {
		if(s.isEmpty())
		{
			actualReverseHelper(s,helper);
			return;
		}
		
		int temp = s.pop();
		helper.push(temp);
		actualReverse(s, helper);
	}

	public static void actualReverseHelper(Stack s, Stack helper) throws Exception {
		
		if(helper.isEmpty())
		{
			return;
		}
		
		int temp = helper.pop();
		actualReverseHelper(s, helper);
		s.push(temp);
	}

}
