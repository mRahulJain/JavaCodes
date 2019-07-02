package H_W;

import java.util.Scanner;

public class Reverse_an_Array {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr= takeInput();
		arr=reverse(arr, 0);
		display(arr);
	}
	public static int[] takeInput() {
		int N = s.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			}
		return arr;
	}
	public static int[] reverse(int[] arr,int vidx)
	{
		if(vidx==arr.length/2)
		{
			return arr;
		}
		else
		{
			int temp=arr[vidx];
			arr[vidx]=arr[arr.length-vidx-1];
			arr[arr.length-vidx-1]=temp;
			reverse(arr, vidx+1);
		}
		return arr;
	}
	public static void display(int[] arr) {
		for (int val : arr)
			System.out.print(val+" ");
	}

}
