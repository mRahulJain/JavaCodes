package L22;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap_Q2_Intersection {

	public static void main(String[] args) {
		int[] one = { 5, 3, 3, 10, 20, 2, 2, 3, 10 };
		int[] two = { 2, 2, 2, 10, 5, 5, 10, 10, 20 };
		System.out.println(intersection(one, two));

	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {
		ArrayList<Integer> al = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < one.length; i++) {
			if (map.containsKey(one[i])) {
				map.put(one[i], map.get(one[i]) + 1);
			} else {
				map.put(one[i], 1);
			}
		}

		for (int i = 0; i < two.length; i++) {
			if (map.containsKey(two[i])) {
				if (map.get(two[i]) > 0) {
					map.put(two[i], map.get(two[i]) - 1);
					al.add(two[i]);
				}
			}
		}

		return al;

	}

}
