package L4;

import java.util.Scanner;

public class Array_1 {

	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr= takeInput();
		System.out.println("-----------");
		display(arr);

	}
	public static int[] takeInput()
	{
		System.out.println("Size ?");
		int n= s.nextInt();
		System.out.println("-----------");
		int[] arr= new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]= s.nextInt();
		}
		return arr;
	}
	public static void display(int[] arr)
	{
		for(int val: arr)
			System.out.print(" "+val);
	}

}
