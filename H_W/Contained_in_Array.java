package H_W;

import java.util.Scanner;

public class Contained_in_Array {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr= takeInput();
		int num= s.nextInt();
		System.out.println(search(arr, num, 0));
		
		
	}
	public static int[] takeInput() {
		int N = s.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			}
		return arr;
	}
	public static boolean search(int[] arr, int num, int vidx)
	{
		if(vidx==arr.length)
		{
			return false;
		}
		else if(arr[vidx]==num)
		{
			return true;
		}
		else
		{
			if(search(arr, num, vidx+1)==true)
			{
				return true;
			}
		}
		return false;
		
		
		
		
	}

}
