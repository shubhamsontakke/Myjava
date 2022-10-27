package Homework;

public class OverloadStaticMethod {

	
		  public static void ex() {
		        System.out.println("OverloadStaticMethod.ex() ");
		    }
		    public static void ex(int a) {
		        System.out.println("OverloadStaticMethod.ex(int)");
		    }
		    public static void main(String args[])
		    {
		    	OverloadStaticMethod.ex();
		    	OverloadStaticMethod.ex(10);
		    }

	}

