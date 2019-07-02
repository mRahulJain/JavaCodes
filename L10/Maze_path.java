package L10;

import java.util.Scanner;

public class Maze_path {
	static Scanner s= new Scanner(System.in);
	static int count=0;
	public static void main(String[] args) {
		int N= s.nextInt();
		countmazePath(0, 0, N, N);
		System.out.println(count);
		mazePath(0, 0, N, N, "");
	}
	public static void mazePath(int cr, int cc, int er, int ec, String ans)
	{
		if(cr==er && cc==ec)
		{
			System.out.println(ans);
			return;
		}
		
		if(cc<ec)
		{
			mazePath(cr, cc+1, er, ec, ans+"H");
		}
		
		if(cr<er)
		{
			mazePath(cr+1, cc, er, ec, ans+"V");
		}
		
		if(cc<ec || cr<er)
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
		
		if(cc<ec || cr<er)
		{
			countmazePath(cr+1, cc+1, er, ec);
		}
	}

}
