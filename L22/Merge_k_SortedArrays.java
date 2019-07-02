package L22;

import java.util.ArrayList;

public class Merge_k_SortedArrays implements Comparable<Merge_k_SortedArrays> {

	int data;
	int listNo;
	int indexNo;

	@Override
	public int compareTo(Merge_k_SortedArrays o) {
		return o.data - this.data;
	}
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(4);
		list1.add(10);
		list1.add(15);
		list1.add(20);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(5);
		list2.add(8);
		list2.add(16);
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(6);
		list3.add(9);
		list3.add(19);
		list3.add(25);
		
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(26);
		list4.add(28);
		list4.add(29);
		
		lists.add(list1);
		lists.add(list2);
		lists.add(list3);
		lists.add(list4);
		
		System.out.println(lists);
		
		System.out.println(mergeKSortedArrays(lists));
	
	}

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> lists) {
		ArrayList<Integer> ans = new ArrayList<>();

		HeapGeneric<Merge_k_SortedArrays> heap = new HeapGeneric<>();
		for (int i = 0; i < lists.size(); i++) {
			Merge_k_SortedArrays np = new Merge_k_SortedArrays();
			np.data = lists.get(i).get(0);
			np.listNo = i;
			np.indexNo = 0;

			heap.add(np);
		}

		while (!heap.isEmpty()) {
			Merge_k_SortedArrays rp = heap.remove();
			ans.add(rp.data);

			rp.indexNo++;
			if (rp.indexNo < lists.get(rp.listNo).size()) {
				rp.data = lists.get(rp.listNo).get(rp.indexNo);
				heap.add(rp);
			}
		}

		return ans;
	}

}
