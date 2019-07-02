package L4;

import java.util.Scanner;

public class Array_Inverse {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your Array: ");
		int[] arr= takeInput();
		arr= Inverse(arr);
		display(arr);
	}
	public static int[] takeInput() {
		System.out.println("Size ?");
		int n = s.nextInt();
		System.out.println("-----------");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static int[] Inverse(int[] arr) {
		int[] arr1= new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int a= arr[i];
			arr1[a]=i;
		}
		return arr1;
	}
	public static void display(int[] arr)
	{
		for(int val: arr)
			System.out.print(" "+val);
	}

}
