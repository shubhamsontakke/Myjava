package Praining_Programs;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int number;
		
			
			System.out.print(" Please Enter any Number to Check whether it is Divisible by 5 and 11 : ");
			number = sc.nextInt();	
			
			if((number % 5 == 0) && (number % 11 == 0))
			{
				System.out.println("given number is divisible by 5 and 12"); 
			}
			else
			{
				System.out.println("given number is not divisible by 5 and 12"); 
			}	
		}

}
