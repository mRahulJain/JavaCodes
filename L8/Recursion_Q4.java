package L8;

import java.util.Scanner;

public class Recursion_Q4 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int arr[]= takeInput();
		System.out.println(max(arr, 0));

	}
	public static int[] takeInput() {
		int n= s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static int max(int[] arr, int vidx)
	{
		if(vidx==arr.length-1)
		{
			return arr[vidx];
		}
		
		int mx= max(arr, vidx+1);
		if(arr[vidx]>mx)
		{
			mx=arr[vidx];
		}
		return mx;
	}

}
