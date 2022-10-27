package StringLogicalTest;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		sb.insert(1, "shubham");
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.replace(1,2,"hii");
		System.out.println(sb1);
		
		
		StringBuffer sb2=new StringBuffer("Hello");
		sb2.delete(1, 2);
		System.out.println(sb2);
		
		
		
		StringBuffer sb3=new StringBuffer("Hello");
		sb3.reverse();
		System.out.println(sb3);
		
		StringBuffer sb4=new StringBuffer();
		System.out.println(sb4.capacity());
		
		// TODO Auto-generated method stub

	}

}
