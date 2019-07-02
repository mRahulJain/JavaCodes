package L6;
import java.util.Scanner;
public class Dubey_HackerRank {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = s.nextInt();
				if (arr[i][j] < -9 || arr[i][j] > 9) {
					System.out.println("WRONG ENTRIES");
					return;
				}
			}
		}
		int sum = findMaxSum(arr);
		System.out.println(sum);
	}

	public static int findMaxSum(int[][] arr) {
		int sum = Integer.MIN_VALUE;
		int row = 0;
		while (row < 4) {
			int col = 0;
			while (col < 4) {
				int psum = 0;
				int flag = 1;
				for (int j = col; j < col + 3; j++) {
					if(flag%2==0) {
						psum = psum + arr[row][j] + arr[row+1][j] + arr[row+2][j];
					} else {
						psum = psum + arr[row][j] + arr[row+2][j];
					}
					flag++;
				}
				if(psum > sum) {
					sum = psum;
				}
				col++;
			}
			row++;
		}
		return sum;
	}

}