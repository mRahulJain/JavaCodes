package H_W;

import java.util.Scanner;

public class Read_Pages {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		long nob = s.nextLong();
		long nos = s.nextLong();
		long[] pages = takeInput(nob);
		System.out.println(result(pages, nob, nos));
	}

	public static long[] takeInput(long n) {
		long[] arr = new long[(int) n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextLong();
		}
		return arr;
	}

	public static long result(long[] pages, long nob, long nos) {
		long lo = 0;
		long hi = 0;
		for (long val : pages) {
			hi += val;
		}
		long finalAns = 0;
		while (lo <= hi) {
			long mid = (lo + hi) / 2;
			if (isPossible(pages, nob, nos, mid)) {
				hi = mid - 1;
				finalAns = mid;
			} else {
				lo = mid + 1;
			}
		}
		return finalAns;
	}

	public static boolean isPossible(long[] pages, long nob, long nos, long mid) {
		long Student = 1;
		long pagesRead = 0;

		for (int i = 0; i < pages.length; i++) {
			if (pages[i] > mid) {
				return false;
			}

			if (pagesRead + pages[i] <= mid) {
				pagesRead += pages[i];
			} else {
				Student++;
				pagesRead = pages[i];
				if (Student > nos) {
					return false;
				}
			}
		}
		return true;
	}

}
