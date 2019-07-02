package L7;

import java.util.ArrayList;

public class Addition_List {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {9,9,9};
		list= add(arr1,arr2,list);
		System.out.println(list);

	}
	public static ArrayList<Integer> add(int[] arr1, int[] arr2, ArrayList<Integer> list)
	{
		int i=arr1.length-1;
		int j=arr2.length-1;
		int carry=0;
		while(i>=0 || j>=0)
		{
			int sum=carry;
			if(i>=0)
			{
				sum=sum+arr1[i];
			}
			
			if(j>=0)
			{
				sum=sum+arr2[j];
			}
			int rem=sum%10;
			carry=sum/10;
			
			list.add(0, rem);
			i--;
			j--;
			
		}
		if(carry!=0)
		{
			list.add(0,carry);
		}
		return list;
	}

}
