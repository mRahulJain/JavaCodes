package L8;

import java.util.Scanner;

public class Recursion_Q6 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr= takeInput();
		int index=findEndIndex(arr, 20, 0);
		System.out.println(index);
	}
	public static int[] takeInput() {
		int n= s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static int findEndIndex(int[] arr, int num, int vidx)
	{
		if(vidx==arr.length)
		{
			return -1;
		}
		
		int i= findEndIndex(arr, num, vidx+1);
		
		if(arr[vidx]==num && i==-1)
		{
			return vidx;
		}
		else
		{
			return i;
		}
		
	}

}
