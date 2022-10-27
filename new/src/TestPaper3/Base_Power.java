package TestPaper3;

import java.util.Scanner;

public class Base_Power {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter base");
		int base=s.nextInt();
		System.out.println("enter the exponent");
		int expo=s.nextInt();
		int power=1;
		for(int i=1;i<=expo;i++)
		{
			power=power*base;
		}
		System.out.println(power);
		// TODO Auto-generated method stub

	}

}
