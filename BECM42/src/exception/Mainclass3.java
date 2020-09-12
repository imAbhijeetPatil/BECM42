package exception;

//Genralized try-catch
public class Mainclass3 {
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
		catch(Exception ref)
		{
          ref.printStackTrace();
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
