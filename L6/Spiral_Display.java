package L6;

import java.util.Scanner;

public class Spiral_Display {
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
		int minRow=0;
		int maxRow=arr.length-1;
		int minCol=0;
		int maxCol=arr[0].length-1;
		int N= arr.length*arr[0].length;
		int count=0;
		while(count<N)
		{
			for(int row=minRow;count<N && row<=maxRow;row++)
			{
				System.out.print(arr[row][minCol]+" ");
				count++;
			}
			minCol++;
			for(int col=minCol;count<N && col<=maxCol;col++)
			{
				System.out.print(arr[maxRow][col]+" ");
				count++;
			}
			maxRow--;
			for(int row=maxRow;count<N && row>=minRow;row--)
			{
				System.out.print(arr[row][maxCol]+" ");
				count++;
			}
			maxCol--;
			for(int col=maxCol;count<N && col>=minCol;col--)
			{
				System.out.print(arr[minRow][col]+" ");
				count++;
			}
			minRow++;
		}
	}

}
