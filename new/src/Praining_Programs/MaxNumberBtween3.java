package Praining_Programs;

import java.util.Scanner;

public class MaxNumberBtween3 {

	public static void main(String[] args) {
		 int num1;
	      int num2;
	      int num3;
	      System.out.println("enter three number: ");
	      Scanner s=new Scanner(System.in);
	      
	      
	      
	      num1=s.nextInt();
	      num2=s.nextInt();
	      num3=s.nextInt();
	      if ((num1 > num2) && (num1 > num3))
	      {
	         System.out.println( "max num: "+num1 );
	      }
	      else if ((num2 >num1) && (num2 > num3))
	      {
	         System.out.println("max number is"+ num2 );
	      }
	      else
	    	  
	         System.out.println( "max number is"+num3 );
		// TODO Auto-generated method stub

	}

}
