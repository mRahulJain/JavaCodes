package H_W;

import java.util.Scanner;

public class ARRAYS_IS_ARRAY_MIRROR_INVERSE {
		static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int N= s.nextInt();
		int[] arr= takeInput(N);
		int[] arr1= Inverse(arr);
		int flag=0;
		for(int i=0;i<N;i++)
		{
			if(arr[i]!=arr1[i])  {
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		

	}
	public static int[] takeInput(int N)
	{
		int i;
		int[] arr= new int[N];
		for(i=0;i<arr.length;i++)
		{
			arr[i]= s.nextInt();
		}
		return arr;
	}
	public static int[] Inverse(int[] arr) {
		int[] arr1= new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int a= arr[i];
			arr1[a]=i;
		}
		return arr1;
	}
}
