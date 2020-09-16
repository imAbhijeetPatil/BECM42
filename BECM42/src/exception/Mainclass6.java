package exception;

public class Mainclass6 
{
	public static void test(int num) throws InterruptedException
	{
		System.out.println("test() starts...");

		Thread.sleep(num);

		System.out.println("test() ends...");
		return;
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		try 
		{
			test(0);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception Handled in Main method");
		}
		System.out.println("main ends...");
		return;
	}
}
