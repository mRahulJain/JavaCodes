package L22;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Q1_MaxFreqChar {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String str = s.next();
		System.out.println(maxFrequencyCharacter(str));
	}

	public static char maxFrequencyCharacter(String str) {
		HashMap<Character, Integer> freq = new HashMap<>();

		while (str != "") {
			char ch = str.charAt(0);
			if (freq.containsKey(ch)) {
				int pv = freq.get(ch);
				freq.put(ch, pv + 1);
			} else {
				freq.put(ch, 1);
			}
			if (str.length() == 1) {
				str = "";
			} else {
				str = str.substring(1);
			}
		}

		int maxFreq = 0;
		char maxFreqChar = ' ';

		for (Character key : freq.keySet()) {
			int value = freq.get(key);
			
			if(value > maxFreq) {
				maxFreq = value;
				maxFreqChar = key;
			}
		}
		return maxFreqChar;
	}

}
