package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainclass5 
{

	public static void main(String[] args) 
	{
		Runnable r1 = () -> {
			System.out.println("task one");
		};
		Runnable r2 = () -> {
			System.out.println("task two");
		};
		Runnable r3 = () -> {
			System.out.println("task three");
		};
		
		ExecutorService ctp = Executors.newCachedThreadPool();
	
		ctp.submit(r1);
		ctp.submit(r2);
		ctp.submit(r3);
	}

}
