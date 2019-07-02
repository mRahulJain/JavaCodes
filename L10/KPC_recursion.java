package L10;

public class KPC_recursion {

	public static void main(String[] args) {
		getKPC("145", "");

	}
	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";

	}
	public static void getKPC(String ques, String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		String ch= getCode(ques.charAt(0));
		String roq= ques.substring(1);
		
		for(int i=0;i<ch.length();i++)
		{
			char c= ch.charAt(i);
			getKPC(roq, ans+c);
		}
		
		
		
	}

}
