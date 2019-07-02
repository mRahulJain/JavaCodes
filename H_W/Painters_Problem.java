package H_W;

import java.util.Scanner;

public class Painters_Problem {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		int nop = s.nextInt();
		int nob = s.nextInt();
		int[] length = takeInput(nob);
		
		System.out.println(result(length, nob, nop));
		
	}

	public static int[] takeInput(int n) {
		int[] arr= new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]= s.nextInt();
		}
		return arr;
	}
	
	public static int result(int[] timeReq, int nob, int nop)
	{
		int lo = 0;
		int hi = 0;
		for (int i = 0; i < timeReq.length; i++) {
			hi = hi + timeReq[i];
		}
		int finalAns = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isPossible(timeReq, nob, nop, mid)) {
				hi = mid - 1;
				finalAns = mid;
			} else {
				lo = mid + 1;
			}
		}
		return finalAns;
	}
	
	public static boolean isPossible(int[] arr, int nob, int nop, int mid)
	{
		int painter=1;
		int timeRemaining= mid;
		
		int i=0;
		while(i<arr.length && painter<=nop)
		{
			if(arr[i]<=timeRemaining)
			{
				timeRemaining -= arr[i];
				i++;
			}
			else
			{
				painter++;
				timeRemaining= mid;
			}
		}
		
		return i==arr.length;
	}

}
