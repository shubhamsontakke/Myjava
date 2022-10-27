package ConditionalAssignment;

import java.util.Scanner;

public class FindPower {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter base");
		int base=s.nextInt();
		
		System.out.print("enter exponent");
		int expo=s.nextInt();
		int power=1;
		for(int i=1;i<=expo;i++)
		{
			power=power*base;
		}
		System.out.print(power);
		// TODO Auto-generated method stub

	}

}
