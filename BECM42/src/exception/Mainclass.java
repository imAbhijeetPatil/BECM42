package exception;

public class Mainclass 
{
	public static void test(int num)
	{
		System.out.println("test() starts...");
		
		try
		{
		 int res = 50 / num;
		 System.out.println(res);
		}
		catch(ArithmeticException ref)
		{
			System.out.println("ArithmeticException handled");
			System.out.println("INVALID NUM FOR DIVISION");
		}
		
		System.out.println("test() ends...");
		return;
	}
	public static void main(String[] args) 
	{
       System.out.println("main starts...");
       test(0);
       System.out.println("main ends...");
       return;
	}
}
