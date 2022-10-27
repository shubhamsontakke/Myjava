package ConditionalAssignment;

import java.util.Scanner;

public class ElectricityBill {


	public static void main(String[] args) {
		double a,b,c,d;
		Scanner s=new Scanner(System.in);
		System.out.print("enter electricity consumption unit");
		int unit=s.nextInt();
		
		a=(unit*0.50);
		b=(((50*0.50)+((unit-50)*0.75))+(50*0.50));
		c=((50*0.50)+(100*0.75)+((unit-100)*1.20));
		d=((50*0.50)+(100*0.75)+(100*1.20)+((unit-100)*1.50));
		if(unit<50) {
			System.out.print("total bill= "+(a+(a*0.2)));
			
		}
		else if(unit>50 && unit<=1501)
		{
			System.out.print("total bill= "+(b+(b*0.2)));
		}
		else if(unit>150 && unit<250)
		{
			System.out.print("total bill= "+(c+(c*0.2)));
		}
		else
		{
			System.out.print("total bill= "+(d+(d*0.2)));
		}
		// TODO Auto-generated method stub

	}

}
