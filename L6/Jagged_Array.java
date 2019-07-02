package L6;

import java.util.Scanner;

public class Jagged_Array {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr= takeInput();
		display(arr);
	}
	public static int[][] takeInput()
	{
		System.out.println("Rows ?");
		int rows= s.nextInt();
		int[][] arr= new int[rows][];
		for(int row=0;row<arr.length;row++)
		{
			System.out.println("Cols ?");
			int cols= s.nextInt();
			arr[row]= new int[cols];
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.println("["+row+"]["+col+"]");
				arr[row][col]=s.nextInt();
			}
		}
		return arr;
	}
	public static void display(int[][] arr)
	{
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.print(arr[row][col]+"  ");
			}
			System.out.println();
		}
	}

}
