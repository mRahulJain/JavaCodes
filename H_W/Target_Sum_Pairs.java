package H_W;

import java.util.Scanner;

public class Target_Sum_Pairs {
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
					int sumr=sum+sumi;
					if(sumr==target)
					{
						if(arr[i]<arr[j])
							System.out.println(arr[i]+" and "+ arr[j]);
						else
							System.out.println(arr[j]+" and "+ arr[i]);
					}
				}
			}
			i++;
		}
	}
	
}
