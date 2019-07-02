package L10;

import java.util.Scanner;

public class Board_path {
	static Scanner s= new Scanner(System.in);
	static int count=0;
	public static void main(String[] args) {
		int N= s.nextInt();
		int M= s.nextInt();
		System.out.println(countboardPath(0, N, M));
		boardPath(0, N,M, "");

	}
	public static int boardPath(int curr, int end,int dice, String ans)
	{
		int count=0;
		if(curr==end)
		{
			System.out.print(ans+" ");
			return 1;
		}
		if(curr>end) {
			return 0;
		}
		for(int i=1;i<=dice;i++)
		{
			count= count + boardPath(curr+i, end,dice, ans+i);
		}
		return count;
	}
	public static int countboardPath(int curr, int end,int dice)
	{
		int count=0;
		if(curr==end)
		{
			return 1;
		}
		if(curr>end) {
			return 0;
		}
		for(int i=1;i<=dice;i++)
		{
			count= count + countboardPath(curr+i, end,dice);
		}
		return count;
	}

}
