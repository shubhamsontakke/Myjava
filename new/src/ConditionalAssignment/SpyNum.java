package ConditionalAssignment;

import java.util.Scanner;

public class SpyNum {

	public static void main(String[] args) 
		
		{
	        int product = 1, sum = 0, ld;
	        int n;
	        Scanner s=new Scanner(System.in);
	        System.out.print("enter number to check spy or not: ");
	        n=s.nextInt();
	          while (n > 0) {
	            ld = n % 10;
	            sum = sum + ld;
	            product = product * ld;
	            n = n / 10;
	        }
	  
	        if (sum == product)
	        {
	            System.out.println("Given number is spy number");
	        }
	        else
	        {
	            System.out.println("Given number is not spy number");
	    }

	}
}

