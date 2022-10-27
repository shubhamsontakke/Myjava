package ConditionalAssignment;

import java.util.Scanner;

public class CheckNmber {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter number: ");
		num=s.nextInt();
		
				if((num%5==0 && num%12==0))
				{
					System.out.print("number is divisible by 5 and 12");
				}
		// TODO Auto-generated
				else
				{
					System.out.print("number is not divisible by 5 and 12");

	}
	}

}
