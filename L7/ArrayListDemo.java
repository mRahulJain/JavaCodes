package L7;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println(list);
		System.out.println(list.size());

		list.add(10);
		System.out.println(list);
		list.add(20);
		System.out.println(list);
		list.add(30);
		list.add(40);
		System.out.println(list);

		System.out.println(list.size());

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		list.set(2, 100); // deletes the pre-value of the index whose new value is given.
		System.out.println(list);

		list.add(3, 500); // shifts the pre-values from the given index.
		System.out.println(list);
		list.add(0, 90); // worst performance as all the elements will be shifted.
		System.out.println(list);

		list.remove(list.size() - 1); // maximum range.
		System.out.println(list);

		System.out.println("--Normal for loop--");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("--Enhanced for loop--");
		for (int val : list) {
			System.out.println(val);
		}

	}

}
