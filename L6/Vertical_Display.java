package L6;

import java.util.Scanner;

public class Vertical_Display {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr= takeInput();
		display(arr);

	}
	public static int[][] takeInput()
	{
		System.out.println("Rows ?");
		int rows= s.nextInt();
		System.out.println("Cols ?");
		int cols= s.nextInt();
		int[][] arr= new int[rows][cols];
		for(int row=0;row<arr.length;row++)
		{
			arr[row]= new int[cols];
			for(int col=0;col<arr[0].length;col++)
			{
				System.out.println("["+row+"]["+col+"]");
				arr[row][col]=s.nextInt();
			}
		}
		return arr;
	}
	public static void display(int[][] arr)
	{
		for(int col=0;col<arr[0].length;col++)
		{
			for(int row=0;row<arr.length;row++)
			{
				System.out.print(arr[row][col]+"  ");
			}
			System.out.println();
		}
	}

}
