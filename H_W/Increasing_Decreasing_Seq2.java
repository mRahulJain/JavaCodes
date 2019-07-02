package H_W;

import java.util.Scanner;

public class Increasing_Decreasing_Seq2 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int N = s.nextInt();
		int count = 1;
		int flag1 = 0;
		int flag2 = 0;
		int preValue = s.nextInt();
		do {
			int value = s.nextInt();
			if (preValue < value) {
				flag1 = 1;
			} else {
				flag2 = 1;
				if (flag1 >= 1) {
					System.out.println("false");
					return;
				}

			}
			preValue = value;
			count++;
		} while (count <= N - 1);

		if (flag1 == 1 || flag2 == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
