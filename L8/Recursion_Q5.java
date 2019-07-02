package L8;

import java.util.Scanner;

public class Recursion_Q5 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr= takeInput();
		int index= findStartIndex(arr, 20, 0);
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
	public static int findStartIndex(int[] arr, int num ,int vidx)
	{
		int index=vidx+1;
		if(vidx==arr.length)
		{
			return -1;
		}
		
		if(arr[vidx]==num)
		{
			return vidx;
		}
		else
		{
			index= findStartIndex(arr, num, vidx+1);
		}
		return index;
		
	}

}
