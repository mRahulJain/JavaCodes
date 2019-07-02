package L7;

import java.util.ArrayList;

public class ArrayList_Intersection {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		int[] arr1= {10,20,30,30,40,40,50,50,50};
		int[] arr2= {10,10,10,30,30,30,40,60};
		list= result(arr1,arr2,list);   //n^2 time complexity
		System.out.println(list);

	}
	public static ArrayList<Integer> result(int[] arr1, int[] arr2, ArrayList<Integer> list)
	{
		if(arr1.length>arr2.length)
		{
			for(int i=0;i<arr2.length;i++)
			{
				int k=i;
				for(int j=i;j<arr2.length;j++)
				{
					int ele=arr1[k];
					if(ele==arr2[j])
					{//System.out.println(arr1[k]+" "+k+" "+j+" "+i);
						list.add(arr1[k]);
						arr2[j]=Integer.MIN_VALUE;
						arr1[k]=Integer.MAX_VALUE;
						k++;
					}
					
				}
			}
		}
		else
		{
			for(int i=0;i<arr1.length;i++)
			{
				int k=i;
				for(int j=i;j<arr1.length;j++)
				{
					int ele=arr1[k];
					if(ele==arr2[j])
					{
						list.add(arr1[k]);
						k++;
					}
				}
			}
		}
		return list;
	}
	
//	public static ArrayList<Integer> res(int[] arr1, int[] arr2, ArrayList<Integer> list)
//	{
//		if(arr1.length>arr2.length)
//		{
//			for(int i=0,j=0;i<arr2.length && j<arr2.length;j++)
//			{
//				if(arr1[i]==arr2[j])
//				{
//					list.add(arr1[i]);
//					i++;
//				}
//			}
//		}
//		else
//		{
//			for(int i=0,j=0;i<arr1.length && j<arr1.length;j++)
//			{
//				if(arr1[i]==arr2[j])
//				{
//					list.add(arr1[i]);
//					i++;
//				}
//			}
//		}
//		return list;
//	}

}
