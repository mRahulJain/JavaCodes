package L12;

import java.util.Arrays;

public class Sieve_of_Eratosthenis {

	public static void main(String[] args) {
		SieveOfEratosthenis(25);
	}

	public static void SieveOfEratosthenis(int n) {
		boolean arr[] = new boolean[n + 1];
		Arrays.fill(arr, true);    //important step.
		arr[0] = false;
		arr[1] = false;

		for (int table = 2; table * table <= n; table++) {
			if (arr[table]) {
				for (int multiplier = 2; multiplier * table <= n; multiplier++) {
					arr[table * multiplier] = false;
				}
			}
		}
		for (int print = 1; print < arr.length ; print++) {
			if (arr[print]) {
				System.out.println(print);
			}
		}
	}

}
