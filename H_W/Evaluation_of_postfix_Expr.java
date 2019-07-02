package H_W;

import java.util.Scanner;

public class Evaluation_of_postfix_Expr {
	protected int[] data;
	protected int tos;

	public Evaluation_of_postfix_Expr() {
		this.data = new int[5];
		this.tos = -1;
	}

	public Evaluation_of_postfix_Expr(int cap) {
		this.data = new int[cap];
		this.tos = -1;
	}

	public void push(int item) throws Exception {
		if (this.isFull()) {
			throw new Exception("Stack is Full");
		}
		this.tos++;
		this.data[tos] = item;
	}

	public int pop() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int rv = this.data[tos];
		this.data[tos] = 0;
		tos--;
		return rv;
	}

	public int peek() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return this.data[tos];
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isFull() {
		return this.size() == this.data.length;
	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		String str = s.next();
		System.out.println(eval_postfix(str));
	}

	public static int eval_postfix(String str) throws Exception {
		Evaluation_of_postfix_Expr stack = new Evaluation_of_postfix_Expr(20);
		int ans = 0;

		stack.push((int) str.charAt(0) - 48);
		str = str.substring(1);
		while (!stack.isEmpty()) {
			if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
				stack.push((int) str.charAt(0) - 48);
				if (str.length() > 1) {
					str = str.substring(1);
				}
			} else {
				char ch = str.charAt(0);
				int a = stack.pop();
				int b = stack.pop();
				switch (ch) {
				case '+':
					ans = b + a;
					break;
				case '-':
					ans = b - a;
					break;
				case '*':
					ans = b * a;
					break;
				case '/':
					ans = b / a;
					break;
				default:
					break;
				}
				stack.push(ans);
				if(str.length() == 1) {
					str = "";
					break;
				}
				if (str.length() > 1) {
					str = str.substring(1);
				}

			}
		}
		return ans;
	}

}
