package ConditionalAssignment;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter number: ");       
		
		int num=sc.nextInt();  
		
		for(int i=1; i <= 10; i++)  
		{  
		  
		System.out.println(num*i);  
		}  
		

	}

}
