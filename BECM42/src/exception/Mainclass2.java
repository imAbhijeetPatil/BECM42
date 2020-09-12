package exception;

//Try-with multiple catch blocks
public class Mainclass2 
{

	public static void test(int num)
	{
		System.out.println("test() starts...");
		int[] a1 = {10,20,30,40};
		
		
		try
		{
		 int res = 50 / num;
		 System.out.println(res);
		 System.out.println(a1[num]);
		}
		catch(ArithmeticException ref)
		{
			System.out.println("ArithmeticException handled");
			System.out.println("INVALID NUM FOR DIVISION");
		}
		catch(ArrayIndexOutOfBoundsException ref)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
			System.out.println("INVALID INDEX");
		}
		
		System.out.println("test() ends...");
		return;
	}
	public static void main(String[] args) 
	{
       System.out.println("main starts...");
       test(10);
       System.out.println("main ends...");
       return;
	}

}
