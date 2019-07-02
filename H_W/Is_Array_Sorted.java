package H_W;

import java.util.Scanner;

public class Is_Array_Sorted {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr= takeInput();
		System.out.println(is_Array_Sorted(arr, 0));

	}
	public static int[] takeInput() {
		int N = s.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			}
		return arr;
	}
	public static boolean is_Array_Sorted(int[] arr, int vidx)
	{
		if(vidx==arr.length-1)
		{
			return true;
		}
		else if(arr[0]<arr[1])
		{
			if(arr[vidx]>arr[vidx+1])
			{
				return false;
			}
			else
			{
				if(is_Array_Sorted(arr, vidx+1)==true)
					return true;
			}
			
			
			
		}
		else
		{
			if(arr[vidx]<arr[vidx+1])
			{
				return false;
			}
			else
			{
				if(is_Array_Sorted(arr, vidx+1)==true)
					return true;
			}
		}
		return false;
		
		
	}
}
