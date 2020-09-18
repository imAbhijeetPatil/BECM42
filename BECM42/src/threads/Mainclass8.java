package threads;

public class Mainclass8 {
	static String s1 = new String("hello");

	public static void main(String[] args) {

		Runnable r1 = () -> 
		{
			synchronized (s1) 
			{
				s1 = s1.concat("world");
				System.out.println(s1);
			}

		};

		Runnable r2 = () -> 
		{
			synchronized (s1) 
			{
				s1 = s1.replace('o', '$');
				System.out.println(s1);
			}
		};

		new Thread(r1).start();
		new Thread(r2).start();
	}
}
