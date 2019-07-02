package H_W;

import java.util.Scanner;

public class Inversion_Count {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int T= s.nextInt();
		int count=1;
		while(count<=T)
		{
			int[] arr= takeInput();
			compare(arr);
			count++;
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
	public static void compare(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
	

}
