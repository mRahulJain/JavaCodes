package L7;

import java.util.ArrayList;

public class Next_permutation_greater_number {

	public static void main(String[] args) {
		int[] arr1= {1,2,3};
		arr1=result(arr1);
		display(arr1);

	}
	public static void display(int[] arr) {
		for (int val : arr)
			System.out.println(val);
	}
	public static int[] result(int[] arr)
	{
		int j=arr.length-1;
		for(;j>0;j--)
		{
			if(arr[j]>arr[j-1])
			{
				break;
			}
		}
		int temp=arr[j-1];
		arr[j-1]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		for(int l=j;l<arr.length-1;l++)
		{
			if(arr[l]>arr[l+1])
			{
				int temp1=arr[l];
				arr[l]=arr[l+1];
				arr[l+1]=temp;
			}
		}
		
		return arr;
	}

}
