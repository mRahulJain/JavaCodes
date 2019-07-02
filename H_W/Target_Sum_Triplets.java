package H_W;

import java.util.Scanner;

public class Target_Sum_Triplets {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr= takeInput();
		int target= s.nextInt();
		Target(arr,target);

	}
	public static int[] takeInput() {
		int N = s.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void Target(int[] arr,int target)
	{
		int i=0;
		arr= Bubble_Sort(arr);
		while(i<arr.length)
		{
			int sum=arr[i];
			if(sum==target)
			{
				break;
			}
			else
			{
				for(int j=i+1;j<arr.length;j++)
				{
					int sumi=arr[j];
					int summ=sum+sumi;
					if(summ==target)
					{
						break;
					}
					else
					{
						for(int k=j+1;k<arr.length;k++)
						{
							int sumr=summ+arr[k];
							if(sumr==target)
							{
								System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
							}
						}
					}
				}
			}
			i++;
		}

	}
	public static int[] Bubble_Sort(int[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int i = 0; i < arr.length - counter - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}

}
