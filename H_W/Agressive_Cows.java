package H_W;

import java.util.Scanner;

public class Agressive_Cows {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int nos = s.nextInt();
		int noc = s.nextInt();
		int[] distance = takeInput(nos);
		distance = Insertion_Sort(distance);
		System.out.println(result(distance, nos, noc));
	}

	public static int result(int[] distance, int nos, int noc) {
		int lo = 0;
		int hi = distance[distance.length - 1] - distance[0];
		int finalAns = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isPossible(distance, nos, noc, mid)) {
				lo = mid + 1;
				finalAns = mid;
			} else {
				hi = mid - 1;
			}
		}
		return finalAns;
	}

	public static boolean isPossible(int[] distance, int nos, int noc, int mid) {
		int pos = distance[0];
		int cowsPlaced = 1;
		for (int i = 1; i < distance.length; i++) {
			if (distance[i] - pos >= mid) {
				cowsPlaced++;
				pos = distance[i];
			}
			if (cowsPlaced == noc)
				return true;
		}
		return false;
	}

	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static int[] Insertion_Sort(int[] arr) {
		for (int counter = 1; counter < arr.length; counter++) {
			int item = arr[counter];
			int i = counter - 1;
			while (i >= 0 && arr[i] > item) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = item;
		}
		return arr;
	}

}
