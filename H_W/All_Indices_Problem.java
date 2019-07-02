package H_W;

import java.util.Scanner;

public class All_Indices_Problem {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr= takeInput();
		int num= s.nextInt();
		all_Indices(arr, num, 0);
		
	}
	public static int[] takeInput() {
		int N = s.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			}
		return arr;
	}
	public static void all_Indices(int[] arr, int num, int vidx)
	{
		if(vidx==arr.length)
		{
			return;
		}
		else if(arr[vidx]==num)
		{
			System.out.print(vidx+" ");
			all_Indices(arr, num, vidx+1);
		}
		else
		{
			all_Indices(arr, num, vidx+1);
		}
	}

}
