package ConditionalAssignment;

import java.util.Scanner;

public class CheckLeapTernary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter year");
		// TODO Auto-generated method stub
		int year=s.nextInt();
		
		
		String leap=year%4==0?"leap year" : "non leap";
		System.out.print(leap);
 		 

	}

}
