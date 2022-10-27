package Patterns;

import java.util.Scanner;

public class PatternOfNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("rows");
		int rows=s.nextInt();
	
		  for (int i = 1; i <= rows; i++)
	        {
	            for (int j = rows; j > i; j--)
	            {
	                System.out.print(" ");
	            }

	            for (int k = 1; k <= i; k++)
	            {
	                System.out.print(i + " ");
	            }
	            System.out.println();
		// TODO Auto-generated method stub

	}
	}
}
