package StringLogicalTest;

public class StringBuilderFuctions {

	public static void main(String[] args) {
		StringBuilder b=new StringBuilder("shubham");
		b.append("cute");
		System.out.println(b);
		
		StringBuffer b1=new StringBuffer("shubham");
		b1.replace(1,2,"shubham");
		System.out.println(b1);
		
		StringBuffer b3=new StringBuffer("shubham");
		b3.delete(1, 5);
		System.out.println(b3);
		
		
		StringBuffer b4=new StringBuffer("shubham");
		b4.reverse();
		System.out.println(b4);
		
		// TODO Auto-generated method stub

	}

}
