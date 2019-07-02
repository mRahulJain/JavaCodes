package L22;

import java.util.ArrayList;

public class kLargestElements {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(16);
		list.add(8);
		list.add(15);
		list.add(19);
		list.add(15);
		list.add(20);
		list.add(22);
		
		System.out.println(list);
		
		System.out.println(kLargestElements(list,3));
		
	}

	public static ArrayList<Integer> kLargestElements(ArrayList<Integer> list, int k) {
		ArrayList<Integer> ans = new ArrayList<>();

		Heap heap = new Heap();
		for (int i = 0; i < k; i++) {
			heap.add(list.get(i));
		}

		for (int i = k; i < list.size(); i++) {
			if(heap.getHP() < list.get(i)) {
				heap.remove();
				heap.add(list.get(i));
			}
		}
		
		while(!heap.isEmpty()) {
			ans.add(heap.remove());
		}

		return ans;
	}

}
