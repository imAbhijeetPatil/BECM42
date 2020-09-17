package threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Mainclass6 
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
		
		ScheduledExecutorService stp = Executors.newScheduledThreadPool(4);
		
		stp.schedule(r1,3,TimeUnit.SECONDS);
		
		stp.scheduleAtFixedRate(r2,0,3,TimeUnit.SECONDS);
		
		stp.scheduleWithFixedDelay(r3,2,2,TimeUnit.SECONDS);
		
	}

}
