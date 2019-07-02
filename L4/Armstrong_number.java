package L4;

public class Armstrong_number {

	public static void main(String[] args) {
		printAllArmstrong(0,1000);
		printArmstrong(153);
		printArmstrong(407);
		printArmstrong(162);
		

	}
	public static void printArmstrong(int n1)
	{
			int digits= numberOfDigits(n1);
			if(isArmstrong(n1,digits))
			{
				System.out.println(n1+" yes armstrong");
			}
			else
			{
				System.out.println(n1+" not armstrong");
			}
		
	}
	public static void printAllArmstrong(int ll, int ul)
	{
		for(int n=ll; n<=ul; n++)
		{
			int digits= numberOfDigits(n);
			if(isArmstrong(n,digits))
			{
				System.out.println(n);
			}
		}
		
	}
	public static int numberOfDigits(int num) {
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
	public static boolean isArmstrong(int num, int nod) {
		int n=num;
		int arm=0;
		int rem;
		while(num!=0)
		{
			rem=num%10;
			arm=arm+((int)Math.pow(rem, nod));
			num=num/10;
		}
		if(n==arm)
		{
			return true;
		}
		else
			return false;
	}

}
