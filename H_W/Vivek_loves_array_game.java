package H_W;

import java.util.Scanner;

public class Vivek_loves_array_game {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		String str= "123456789";
		String s= str.substring(0,1);
//		String ss= str.substring(0,1);
		String ss= str.substring(0,2);
		System.out.println(s);
		System.out.println(ss);

	}
	public static String codes(String str) {
		if (str == "1")
			return "a";
		else if (str == "2")
			return "b";
		else if (str == "3")
			return "c";
		else if (str == "4")
			return "d";
		else if (str == "5")
			return "e";
		else if (str == "6")
			return "f";
		else if (str == "7")
			return "g";
		else if (str == "8")
			return "h";
		else if (str == "9")
			return "i";
		else if (str == "10")
			return "j";
		else if (str == "11")
			return "k";
		else if (str == "12")
			return "l";
		else if (str == "13")
			return "m";
		else if (str == "14")
			return "n";
		else if (str == "15")
			return "o";
		else if (str == "16")
			return "p";
		else if (str == "17")
			return "q";
		else if (str == "18")
			return "r";
		else if (str == "19")
			return "s";
		else if (str == "20")
			return "t";
		else if (str == "21")
			return "u";
		else if (str == "22")
			return "v";
		else if (str == "23")
			return "w";
		else if (str == "24")
			return "x";
		else if (str == "25")
			return "y";
		else if (str == "26")
			return "z";
		else
			return "";
	}
	public static int[] takeInput() {
		int N = s.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			}
		return arr;
	}
//	public static int game(int[] arr, int vidx)
//	{
//		if(vidx==arr.length)
//		{
//			return 0;
//		}
//		else
//		{
//			
//		}
//	}

}
