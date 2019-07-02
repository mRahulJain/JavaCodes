package L5;

import java.util.Scanner;

public class Bubble_Sort {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter your Array: ");
		int[] arr = takeInput();
		System.out.println("-----------");
		System.out.println("Sorted array");
		arr = Bubble_Sort(arr);
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

	public static int[] Bubble_Sort(int[] arr) {
		
		for (int counter = 0; counter < arr.length - 1; counter++) {
			//boolean flag=true;
			for (int i = 0; i < arr.length - counter - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					
					//flag=false;
				}
			}
//			if(flag)
//			{
//				break;
//			}
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int val : arr)
			System.out.print(val+" ");
	}

}
