package string;

public class StringOperations {

	public static void main(String[] args) {
		String str="Hello";
		String str2="Hello";
		System.out.println(str==str2);
		
		/*str=str+"pune";
		System.out.println(str==str2);*/
		
		
		String st2=new String("Hello");
		System.out.println(str==str2);
		System.out.println(str==st2);
		
		System.out.println(str.equals(st2));
		System.out.println(str.equalsIgnoreCase(str2));
		
		System.out.println(str.compareTo(st2));
		System.out.println(str.compareTo(str2));
		
		
		// TODO Auto-generated method stub

	}

}
