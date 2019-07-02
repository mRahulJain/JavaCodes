package H_W;

import java.util.Scanner;

public class Maze_path_recursion {
	static Scanner s= new Scanner(System.in);
	static int count=0;
	public static void main(String[] args) {
		int N= s.nextInt();
		countmazePath(0, 0, N-1, N-1);
		System.out.println(count);
		mazePath(0, 0, N-1, N-1, "");
	}
	public static void mazePath(int cr, int cc, int er, int ec, String ans)
	{
		if(cr==er && cc==ec)
		{
			System.out.print(ans+" ");
			return;
		}
		
		if(cr<er)
		{
			mazePath(cr+1, cc, er, ec, ans+"V");
		}
		
		if(cc<ec)
		{
			mazePath(cr, cc+1, er, ec, ans+"H");
		}
		
		if(cc==cr || cc+cr==er)
		{
			mazePath(cr+1, cc+1, er, ec, ans+"D");
		}
	}
	public static void countmazePath(int cr, int cc, int er, int ec)
	{
		if(cr==er && cc==ec)
		{
			count++;
			return;
		}
		
		if(cc<ec)
		{
			countmazePath(cr, cc+1, er, ec);
		}
		
		if(cr<er)
		{
			countmazePath(cr+1, cc, er, ec);
		}
		
		if(cc==cr || cc+cr==er)
		{
			countmazePath(cr+1, cc+1, er, ec);
		}

	}

}
