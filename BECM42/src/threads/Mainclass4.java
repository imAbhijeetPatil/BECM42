package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Mainclass4 
{
	public static void main(String[] args) 
	{
		Runnable r1 = () -> 
		{
		  System.out.println("task one");	
		};
		Runnable r2 = () -> 
		{
		  System.out.println("task two");	
		};
		Runnable r3 = () -> 
		{
		  System.out.println("task three");	
		};
		
		int nThreads = Runtime.getRuntime().availableProcessors();
		System.out.println("availableProcessors : " +nThreads);
		
		ExecutorService ftp = Executors.newFixedThreadPool(nThreads);//Abstraction
		ftp.submit(r1);
		ftp.submit(r2);
		ftp.submit(r3);
		ftp.submit(r2);
		ftp.submit(r1);
		
		try 
		{
			ftp.awaitTermination(5,TimeUnit.SECONDS);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		ftp.shutdown();
	}
}



