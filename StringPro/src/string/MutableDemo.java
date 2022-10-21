package string;

public class MutableDemo {
	public static void main(String[] args) {
		StringBuffer b=new StringBuffer();
		b.append("Hello");
		System.out.print(b);
		
		b.append("Hello");
		System.out.println(b);
		
		
		
		b.append("Java");
		System.out.println(b);
		
		
		b.insert(3,"#");
		System.out.println(b);
		
		b.reverse();
		System.out.println(b);
		
		// TODO Auto-generated method stub

	}

}


