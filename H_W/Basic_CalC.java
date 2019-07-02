package H_W;

import java.util.Scanner;

public class Basic_CalC {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N1, N2;
		char ch = 'a';
		do {
			ch = s.next().charAt(0);
			switch (ch) {
			case '+':
				N1 = s.nextInt();
				N2 = s.nextInt();
				System.out.println(N1 + N2);
				break;
			case '-':
				N1 = s.nextInt();
				N2 = s.nextInt();
				System.out.println(N1 - N2);
				break;
			case '*':
				N1 = s.nextInt();
				N2 = s.nextInt();
				System.out.println(N1 * N2);
				break;
			case '/':
				N1 = s.nextInt();
				N2 = s.nextInt();
				System.out.println(N1 / N2);
				break;
			case '%':
				N1 = s.nextInt();
				N2 = s.nextInt();
				System.out.println(N1 % N2);
				break;
			case 'x':
				break;
			case 'X':
				break;
			default:
				System.out.println("Invalid operation. Try again.");
				break;
			}
		} while (ch != 'x' && ch != 'X');

	}

}
