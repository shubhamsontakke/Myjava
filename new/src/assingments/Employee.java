package assingments;

public class Employee {
    private	int emp_id;
	private String name;
	private long salary;
	
public void setValues(int e,String n,int s)
{
	emp_id=e;
	name=n;
	salary=s;
}
void getValues()
{
	System.out.println(emp_id+" "+name+" "+salary);
}

	public static void main(String[] args) {
		Employee e=new Employee();
				e.setValues(1, "shubham", 12000);
		e.getValues();
		
		// TODO Auto-generated method stub

	}

}
