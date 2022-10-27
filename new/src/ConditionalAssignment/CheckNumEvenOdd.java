package ConditionalAssignment;

import java.util.Scanner;

public class CheckNumEvenOdd {

	public static void main(String[] args) {
		
	int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter number");
		num=s.nextInt();
	
		switch(num%2)
		{
		case 1:
			
		    System.out.print("even number");
		    break;
		case 2:
		    System.out.println(" is an Odd number");
default:
	System.out.print("try again");
		// TODO Auto-generated method stub

	}
	}
}
