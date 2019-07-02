package H_W;

import java.util.Arrays;
import java.util.Scanner;

public class Book_Alocation_Problem {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int T = s.nextInt();
		int count = 1;
		while (count <= T) {
			int nob = s.nextInt();
			int nos = s.nextInt();
			int[] noOfPages = takeInput(nob);
			Arrays.sort(noOfPages);

			System.out.println(result(noOfPages, nob, nos));
		}
	}

	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static int result(int[] noOfPages, int nob, int nos) {
		int lo = 0;
		int hi = 0;
		for (int val : noOfPages) {
			hi += val;
		}
		int finalAns = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isPossible(noOfPages, nob, nos, mid)) {
				hi = mid - 1;
				finalAns = mid;
			} else {
				lo = mid + 1;
			}
		}
		return finalAns;
	}

	public static boolean isPossible(int[] noOfPages, int nob, int nos, int mid) {
		int student = 1;
		int pagesRead = 0;

		for (int i = 0; i < noOfPages.length; i++) {
			if (noOfPages[i] > mid) {
				return false;
			}

			if (pagesRead + noOfPages[i] <= mid) {
				pagesRead += noOfPages[i];
			} else {
				student++;
				pagesRead = noOfPages[i];
				if (student > nos) {
					return false;
				}
			}
		}
		return true;

	}

}
