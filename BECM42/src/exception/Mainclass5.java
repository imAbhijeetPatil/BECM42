package exception;

public class Mainclass5 
{

	public static void test(int num)
	{
		System.out.println("test() starts...");
		
		try 
		{
			Thread.sleep(num);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("test() ends...");
		return;
	}
	public static void main(String[] args) 
	{
       System.out.println("main starts...");
       test(1);
       System.out.println("main ends...");
       return;
	}

}
