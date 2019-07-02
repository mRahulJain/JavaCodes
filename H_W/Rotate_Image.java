package H_W;

import java.util.Scanner;

public class Rotate_Image {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		int [][] arr= takeInput();
		arr= rotate(arr);
		display(arr);

	}
	public static int[][] takeInput()
	{
		int rows= s.nextInt();
		int[][] arr= new int[rows][rows];
		for(int row=0;row<arr.length;row++)
		{
			arr[row]= new int[rows];
			for(int col=0;col<arr[0].length;col++)
			{
				arr[row][col]=s.nextInt();
			}
		}
		return arr;
	}
	public static int[][] rotate(int[][] arr)
	{
		int[][] arr1= new int[arr.length][arr.length];
		int col=0;
		while(col<arr.length)
		{
			int maxCol=arr.length-1;
			for(int row=0;row<arr.length;row++)
			{
				arr1[row][col]=arr[col][maxCol];
				maxCol--;
			}
			col++;
		}
		return arr1;
	}
	public static void display(int[][] arr)
	{
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr.length;col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}

	}

}
