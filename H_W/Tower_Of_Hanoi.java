package H_W;

import java.util.Scanner;

public class Tower_Of_Hanoi {
	static Scanner s = new Scanner(System.in);

	static int count = 0;
	static int i = 1;

	public static void main(String[] args) {
		int N = s.nextInt();
		TOH(N, "T1", "T2", "T3");
	}

	public static void towerOfHanoii(int n, int vin, int disc) {
		if (n == 1) {
			System.out.println("Move " + vin + "th" + " disc from " + "T" + i + " to " + "T" + disc);
			count++;
			return;
		}

		while (i < n) {

			if (vin > n) {
				reverseTowerOfHanoi(n, 3, n - 1, 3);
				return;
			}

			System.out.println("Move " + vin + "th" + " disc from " + "T" + i + " to " + "T" + disc % (n + 2));
			count++;
			towerOfHanoii(n, vin + 1, disc - 1);
			i++;
			vin = 1;
			disc = n + i;
		}
	}

	public static void reverseTowerOfHanoi(int n, int disc, int vdisc, int vin) {
		if (vdisc == 1) {
			System.out.println("Move " + vdisc + "th" + " disc from " + "T" + vin + " to " + "T" + (i + 1));
			count++;
			return;
		}
		System.out.println("Move " + vdisc + "th" + " disc from " + "T" + vin + " to " + "T" + (i + 1));
		count++;
		reverseTowerOfHanoi(n, disc, vdisc - 1, vin + 1);
	}

	public static void TOH(int n, String src, String dest, String helper) {
		if (n == 1) {
			System.out.println("Move 1th disc from " + src + " to " + dest);
			return;
		}
		TOH(n - 1, src, helper, dest);
		System.out.println("Move " + n + "th disc from " + src + " to " + dest);
		TOH(n - 1, helper, dest, src);
	}
}
