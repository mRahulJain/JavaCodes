package H_W;

import java.util.Scanner;

public class Sorting_In_Linear_Time {
	public static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr= takeInput();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<arr[i+1])
			{
				int item= arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=arr[i];
			}
		}

	}
	public static int[] takeInput() {
		int N = s.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			}
		return arr;
	}

}
