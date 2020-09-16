package threads;

class Superclass
{
	
}

class ThreadOne extends Superclass implements Runnable
{
	@Override
	public void run() 
	{
		for (int i = 1; i <= 3; i++) 
		{
			System.out.println("task one");
		}
	}   
}

class ThreadTwo extends Thread
{
	@Override
	public void run() 
	{
		for (int j = 1; j <= 3; j++) 
		{
			System.out.println("task two");
		}	
	}
}
public class Mainclass2 
{
	public static void main(String[] args) 
	{
	   System.out.println("Main starts..");
	  
	   ThreadOne t1 = new ThreadOne();
	   
	   Thread th1 = new Thread(t1);
	   th1.start();
	   
	   ThreadTwo t2 = new ThreadTwo();
	   t2.start();
       
       System.out.println("Main ends..");
	}
}






