package string;

public class StringOp {
	

	public static void main(String[] args) {
		String a="SHUBHAM";
		String b="suraj";
		
		
		
		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
		
		System.out.println(b.concat(a));
		System.out.println(b.length());
		
		String c="  xyz   ";
		String d="Learn";
		
		System.out.println(c.trim());
		System.out.println(d.isEmpty());
		
		System.out.println(b.charAt(2));	
		System.out.println(a.indexOf('U'));
		
		System.out.println(b.equals(a));
		System.out.println(d.replace('r', 'e'));
		
		System.out.println(b.startsWith("sur"));	
		System.out.println(a.endsWith("HM"));
		
		
		
		// TODO Auto-generated method stub

	}

}
