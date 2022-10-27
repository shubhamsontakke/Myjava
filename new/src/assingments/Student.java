package assingments;



public class Student {

	int rollNo=10;
	String name="shubham";
	Student()
	 {
		rollNo=26;
		name="rocky";
		System.out.println("Default constructor") ;
	 }
	 void display()
	 {
		System.out.println(rollNo+" "+name) ;
	 }
	
	public static void main(String[] args) {
		
Student s1=new Student();
Student s2=new Student();

	s1.display();
	s2.display();
		// TODO Auto-generated method stub

	}

}
