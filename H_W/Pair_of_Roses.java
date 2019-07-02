package H_W;

import java.util.Scanner;

public class Pair_of_Roses {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int T= s.nextInt();
		int r=1;
		while(r<=T)
		{
			int[] arr= takeInput();
			arr= Bubble_Sort(arr);
			int D= s.nextInt();
			Target(arr,D);
			r++;
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
	public static void Target(int[] arr,int target)
	{
		int i=0;
		int r1=0,r2=0;
		while(i<arr.length)
		{
			int min= Integer.MAX_VALUE;
			int sum=arr[i];
			if(sum==target)
			{
				break;
			}
			else
			{
				for(int j=i+1;j<arr.length;j++)
				{
					int sumr=sum+arr[j];
					if(sumr==target)
					{
						int mini= arr[j]-arr[i];
						if(mini<min)
						{
							min=mini;
							r1=i;
							r2=j;
						}
					}
				}
			}
			i++;
		}
		System.out.println("Deepak should buy roses whose prices are "+arr[r1]+" and "+arr[r2]+".");	
	}
}
