package Homework;

public class Student {

	int rollno;
	String name;
	float fee;
	Student (int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	public void calclulation() {
		if(fee<0)
		{
			System.out.println("not allowded");
			 display();
		}
	}
	void display()
	{
		this.display();
		System.out.println(rollno+""+name+""+fee);
	}

	class Student2{
		
	
	public static void main(String[] args) {
		Student s=new Student(111,"shubham",500f);
		Student s1=new Student(111,"rakesh",500f);
		s.display();
		s1.display();
	}
	}

}
