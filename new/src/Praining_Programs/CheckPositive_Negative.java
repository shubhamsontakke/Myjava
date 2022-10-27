package Praining_Programs;

import java.util.Scanner;

public class CheckPositive_Negative {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter any number: ");
		num=s.nextInt();
		 if(num>0)
	            System.out.println("number is Positive."+num);
	        else if(num<0)
	            System.out.println("number is negative number"+num);
	        else
	            System.out.println("number is zero "+num);
	    }
		

	}


