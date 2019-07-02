package L10;

public class Coin_toss {

	public static void main(String[] args) {
		coinToss(3, "");

	}
	public static void coinToss(int ques, String ans)
	{
		
		if(ques==0)
		{
			System.out.println(ans);
			return;
		}
		coinToss(ques-1, ans+"H");
		coinToss(ques-1, ans+"T");
	}

}
