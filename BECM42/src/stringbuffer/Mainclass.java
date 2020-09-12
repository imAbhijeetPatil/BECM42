package stringbuffer;

public class Mainclass {

	public static void main(String[] args) 
	{
       StringBuffer sb1 = new StringBuffer("hello");
       System.out.println(sb1);
       sb1 = sb1.append("world");
       System.out.println(sb1);
	}

}
