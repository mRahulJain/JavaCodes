package L10;

import java.util.Scanner;

public class LexicoGraphial_counting {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int N= s.nextInt();
		lexicoCounting(0, N);

	}

	public static void lexicoCounting(int curr, int end) {
		
		if (curr > end) {
			return;
		}
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		System.out.println(curr);
		for (; i <= 9; i++) {
			lexicoCounting(10 * curr + i, end);

		}
	}
public static void lexicoCounting2(int curr, int end) {
		
		if (curr > end) {
			return;
		}
		System.out.println(curr);
		for (int i=0; i <= 9; i++) {
			lexicoCounting(10 * curr + i, end);
		}
		
		if(curr+1<=9)
			lexicoCounting2(curr+1, end);
	}

}
