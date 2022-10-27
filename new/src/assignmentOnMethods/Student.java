package assignmentOnMethods;

public class Student {
	int id;
	String name;
	
	
	public void displayData(int i,String n)
	{
		id=i;
		name=n;
		System.out.println(name);
		getId();
	}
	public int getId()
	{
		
		return id;
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.displayData(1,"shubham");
		
		
		
		
		// TODO Auto-generated method stub

	}

}
