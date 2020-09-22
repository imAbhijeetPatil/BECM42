package ds;

class Student
{
	int sid;
	String name;
	double agg;
	
	public Student(int sid, String name, double agg) {
		super();
		this.sid = sid;
		this.name = name;
		this.agg = agg;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", agg=" + agg + "]";
	}	
}



public class Mainclass 
{
	static Student[] fakeDb = new Student[3];
	static int index = 0;
	//adding element to array
	public static void addStudent(int id,String name,double agg)
	{
		 Student v1 = new Student(id,name,agg);
		 fakeDb[index++] = v1; 
		 System.out.println("student added to "+index);
	}
	
	//retrive an element from array 
	public static Student getStudent(int id)
	{
		 Student v1 = fakeDb[id];
		 return v1;
	}
	
	//retrive all elements from array
	public static Student[] getAllStudent()
	{
		Student[] slist = new Student[3];
		for(int i=0;i<slist.length;i++)	
		{
			slist[i] = fakeDb[i];
		}
		return slist;
	}
	
	public static void main(String[] args) 
	{
         addStudent(123,"Smith",67.8);
         addStudent(243,"Blake",98.8);
         
         Student st1 = getStudent(0);
         System.out.println(st1);
         
         Student st2 = getStudent(1);
         System.out.println(st2);
	}
}
