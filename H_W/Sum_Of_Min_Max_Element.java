package Test;

import java.util.Scanner;

public class Sum_Of_Min_Max_Element {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int T= s.nextInt();
		int count=1;
			int n= s.nextInt();
			int k= s.nextInt();
			int[] arr= takeInput(n);
			result(arr,k);

	}
	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void result(int[] arr, int k)
	{
		int res=0;
		
		for(int i=0;i<=arr.length-k;i++)
		{
			int min=arr[i];
			int max=arr[i];
			int sum=0;
			int j=0;
			int l=0;
			int s=i;
			for(j=0;j<k;j++)
			{
				if(arr[s]<min)
				{
					min=arr[s];
				}
				s++;
			}
			s=i;
			for(l=0;l<k;l++)
			{
				if(arr[s]>max)
				{
					max=arr[s];
				}
				s++;
			}
			sum=max+min;
//			res=res+sum;
			System.out.println(sum);
		}
//		System.out.println(res);
	}

}
