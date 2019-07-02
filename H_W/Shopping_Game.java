package H_W;

import java.util.Scanner;

public class Shopping_Game {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		int T = s.nextInt();
		while (T > 0) {
			int count = 1;
			int A = s.nextInt();
			int H = s.nextInt();
			while (A > 0 && H > 0) {
				A = A - count;
				count++;
				H = H - count;
				count++;
			}
			if (A <= 0) {
				System.out.println("Harshit");
			} else {
				System.out.println("Aayush");
			}
		}

	}

}
