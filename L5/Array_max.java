package L5;

import java.util.Scanner;

public class Array_max {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = takeInput();
		int max= max(arr);
		System.out.println(max);
	}
	public static int[] takeInput() {
		int N = s.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static int max(int[] arr)
	{
		int max= arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	

}
