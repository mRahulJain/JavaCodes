package H_W;

import java.util.Scanner;

public class Array_Print_row_wise {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr= takeInput();
		display(arr);

	}
	public static int[][] takeInput()
	{
		int rows= s.nextInt();
		int cols= s.nextInt();
		int[][] arr= new int[rows][cols];
		for(int row=0;row<arr.length;row++)
		{
			arr[row]= new int[cols];
			for(int col=0;col<arr[0].length;col++)
			{
				arr[row][col]=s.nextInt();
			}
		}
		return arr;
	}
	public static void display(int[][] arr)
	{
		for(int row=0;row<arr.length;row++)
		{
			if(row%2==0)
			{
				for(int col=0;col<arr[0].length;col++)
				{
					System.out.print(arr[row][col]+", ");
				}
			}
			else
			{
				for(int col=arr[0].length-1;col>=0;col--)
				{
					System.out.print(arr[row][col]+", ");
				}
			}
		}
		System.out.println("END");
	}
	
}
