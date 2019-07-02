package L5;

import java.util.Scanner;

public class Array_0 {
		static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your Array: ");
		int[] arr = takeInput();
		System.out.println("-----------");
		System.out.println("Enter your target: ");
		int T= s.nextInt();
		sum(arr,T);

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
	public static void sum(int[] arr, int sum)
	{
		
	}
	

}
