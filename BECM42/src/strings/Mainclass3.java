package strings;

public class Mainclass3 
{
	public static void main(String[] args) 
	{
        int i1 = 10;
        System.out.println(i1);
        i1 = 234;
        
        String s1 = "hello";//s1 ---> ["hello"]
        String s2 = "hello";//s2 ---> ["hello"]
        s1 = "world";       //s1 --> "world"
        s1 = "java";       //s1 --> ["java"]
        
        System.out.println(s1);
	}
}
