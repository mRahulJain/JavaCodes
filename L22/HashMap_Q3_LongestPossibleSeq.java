package L22;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap_Q3_LongestPossibleSeq {

	public static void main(String[] args) {
		int[] arr = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
		System.out.println(LongestPossibleSeq(arr));

	}
	
	public static ArrayList<Integer> LongestPossibleSeq(int[] arr) {
		ArrayList<Integer> al = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int element = arr[i];
			
			if(map.containsKey(element-1)) {
				map.put(element, false);
			} else {
				map.put(element, true);
			}
			
			if(map.containsKey(element+1)) {
				map.put(element+1, false);
			}
		}
		
		int maxCount = 0;
		int starting = 0;
		
		for(Integer val : map.keySet()) {
			int count = 0;
			if(map.get(val)) {
				while(map.containsKey(val+count)) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount = count;
				starting = val;
			}
		}
		
		for(int i = 0;i < maxCount;i++) {
			al.add(starting + i);
		}
		
		return al;
	}

}
