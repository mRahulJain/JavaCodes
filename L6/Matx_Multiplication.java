package L6;

import java.util.Scanner;

public class Matx_Multiplication {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr1= {{1,2,0},{3,1,0},{4,2,1}};
		int[][] arr2= {{1,1,0,1},{3,1,0,1},{4,1,1,1}};
		int[][] arr3= multiply(arr1,arr2);
		display(arr3);
	}
	public static int[][] multiply(int[][]arr1, int[][] arr2)
	{
		int[][] arr3= new int[arr1.length][arr2[0].length];
		for(int row=0;row<arr1.length;row++)
		{
			for(int col=0;col<arr2[0].length;col++)
			{
				int sum=0;
				for(int i= 0;i<arr3.length;i++)
				{
					sum=sum+arr1[row][i]*arr2[i][col];
				}
				arr3[row][col]=sum;
			}
		}
		return arr3;
	}
	public static void display(int[][] arr)
	{
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[0].length;col++)
			{
				System.out.print(arr[row][col]+"  ");
			}
			System.out.println();
		}
	}

}
