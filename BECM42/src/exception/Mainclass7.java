package exception;

public class Mainclass7 
{

	public static void test(int num) 
	{
		System.out.println("test() starts...");
        
		if(num>0 && num<6)
		{
			System.out.println("valid");
		}
		else
		{
			IllegalArgumentException i1 = new IllegalArgumentException();
			throw i1;
		}

		System.out.println("test() ends...");
		return;
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		
			test(3);

		System.out.println("main ends...");
		return;
	}

}
