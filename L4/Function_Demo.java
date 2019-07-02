package L4;

public class Function_Demo {

	public static void main(String[] args) {
		System.out.println("Hello");
		addition();
		System.out.println("Bye");
		subtraction();
	}
	public static void addition()
	{
		int a=2;
		int b=3;
		int sum=a+b;
		subtraction();
		System.out.println(sum);
	}
	public static void subtraction()
	{
		int a=8;
		int b=2;
		int sub=a-b;
		System.out.println(sub);
	}

}
