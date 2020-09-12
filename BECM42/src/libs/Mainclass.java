package libs;

class Employee extends Object
{
	String name;
	int empId;
	double sal;
	
	public Employee(String name, int empId, double sal) 
	{
		super();
		this.name = name;
		this.empId = empId;
		this.sal = sal;
	}
	
	@Override
	public int hashCode() 
	{
		return empId;
	}
	
	@Override
	public boolean equals(Object obj)//Object obj = e2; 
	{
	   return this.empId == obj.hashCode();	
	}
	
	@Override
	public String toString() 
	{
		return name+" "+empId+" "+sal;
	}
	
}

public class Mainclass 
{
	public static void main(String[] args)
	{
      Employee e1 = new Employee("Smith",7012,2354.45);
      Employee e2 = new Employee("Smith",7012,2354.45);
      Employee e3 = new Employee("Martin",8711,3135.45);
      
      System.out.println(e1 == e2);
      
      System.out.println(e1.hashCode());
      System.out.println(e2.hashCode());
      System.out.println(e3.hashCode());
      
      System.out.println(e2.equals(e1));
      System.out.println(e1.equals(e3));
      
      System.out.println(e1.toString());
      System.out.println(e2);
      System.out.println(e3);

	}
}













