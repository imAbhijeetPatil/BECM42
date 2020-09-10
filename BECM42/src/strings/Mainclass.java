package strings;

public class Mainclass 
{
	public static void main(String[] args) 
	{
       String s1 = new String("jspiders"); //--> s1 -->[j,s,p,i,d,e,r,s]
       String s2 = new String("jspiders");
       
       System.out.println(s1.hashCode());
       System.out.println(s2.hashCode());
       
       System.out.println(s1.toString());
       System.out.println(s2);
       
       System.out.println(s1.equals(s2));
       
       System.out.println(s1 == s2);
	}
}
