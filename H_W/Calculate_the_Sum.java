package H_W;

import java.util.Scanner;

public class Calculate_the_Sum {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int [] arr= takeInput();
		int T= s.nextInt();
		int count=1;
		while(count<=T)
		{
			arr= operation(arr);
			count++;
		}
		long sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		sum=sum%((long)Math.pow(10, 9)+7);
		System.out.println(sum);
	}
	public static int[] takeInput() {
		int N = s.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static int[] operation(int[] arr)
	{
		int[] arr1= new int[arr.length];
		int N= s.nextInt();
		N=N%arr.length;
		for(int i=0;i<arr.length;i++)
		{
			if((i-N)<0)
			{
				arr1[i]=arr[i]+arr[arr.length-N+i];
			}
			else
			{
				arr1[i]=arr[i]+arr[i-N];
			}
		}
		return arr1;
	}
	
	

}
