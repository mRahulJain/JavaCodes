package L5;

import java.util.Scanner;

public class Array_Reverse {
		static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your Array: ");
		int[] arr= takeInput();
		System.out.println("------------");
		
		arr= Reverse(arr);
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
	public static int[] Reverse(int[] arr)
	{
		int j= arr.length-1;
		for(int i=0;i<arr.length/2;i++)
		{
			int temp= arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		}
		return arr;
	}
	public static void display(int[] arr)
	{
		for(int val: arr)
			System.out.print(" "+val);
	}

}
