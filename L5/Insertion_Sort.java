package L5;

import java.util.Scanner;

public class Insertion_Sort {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your Array: ");
		int[] arr = takeInput();
		System.out.println("-----------");
		System.out.println("Sorted array");
		long start = System.currentTimeMillis();
		Insertion_Sort(arr);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
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
	public static void display(int[] arr) {
		for (int val : arr)
			System.out.println(val);
	}
	public static int[] Insertion_Sort(int[] arr)
	{
		for(int counter=1;counter<arr.length;counter++)
		{
			int item= arr[counter];
			int i= counter-1;
			while(i>=0 && arr[i]>item)
			{
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=item;
		}
		return arr;
	}

}
