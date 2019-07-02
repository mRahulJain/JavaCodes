package H_W;

import java.util.Scanner;

public class Print_Series {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N1 = s.nextInt();
		int N2 = s.nextInt();
		int n=1;
		int count = 1;
		while(count!=11)
		{
			if ((3 * n + 2) % N2 != 0)
			{
				System.out.println(3*n+2);
				count++;
			}
			n++;
		}
	}

}
