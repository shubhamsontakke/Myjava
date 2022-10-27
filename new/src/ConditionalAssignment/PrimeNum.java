package ConditionalAssignment;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		int num;
		int i=2;
		boolean isPrime=true;
		Scanner s=new Scanner(System.in);
		
		System.out.print("enter the number ");
		num=s.nextInt();
		while(i<num)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
			i++;
		}
		if(isPrime==true)
		{

			System.out.print("prime");
		}
		else {

			System.out.print("not prime");
		}
		
		// TODO Auto-generated method stub

	}

}
