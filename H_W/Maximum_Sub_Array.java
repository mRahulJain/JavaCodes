package H_W;

import java.util.Scanner;

public class Maximum_Sub_Array {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int T= s.nextInt();
		int i=1;
		while(i<=T)
		{
			int[] arr= takeInput();
			MaxSum(arr);
			i++;
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
	public static void MaxSum(int[] arr)
	{
		int sum=0;
		int sum1=0;
		for(int a=0;a<arr.length;a++)
		{
			sum=sum+arr[a];
		}
		for(int i=0;i<arr.length;i++)
		{
			sum1=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				sum1=sum1+arr[j];
				if(sum1>sum)
				{
					sum=sum1;
				}
			}
		}
		System.out.println(sum);
	}

}
