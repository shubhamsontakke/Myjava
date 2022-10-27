package ConditionalAssignment;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		int year;
		Scanner s=new Scanner(System.in);
		System.out.print("enter year: ");
	
		year=s.nextInt();
		if(year % 4 == 0) {
			System.out.print("leap year");
			
		}
		else {
			System.out.print("non leap year");
		}
	}

}