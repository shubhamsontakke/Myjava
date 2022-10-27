package Praining_Programs;

import java.util.Scanner;

public class Largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,large;
		Scanner s=new Scanner(System.in);
		System.out.print("enter numbers: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		large=s.nextInt();
		
		if((a>b) && (a>c))
		{
			System.out.print("a is greater:"+large);
		}
		else if((b>a) && (b>c))
			 {
				 System.out.print("b is greater:"+large);
			 }
			 else
			 {
		
			System.out.print("c is greater:"+large);
		
			 }

	}
}
	


