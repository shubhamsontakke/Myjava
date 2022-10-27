package Praining_Programs;

import java.util.Scanner;

public class EquilateralTrangleArea {

	public static void main(String[] args) {
		
		
		
		
		    double side, area;
		    Scanner sc=new Scanner(System.in);
		    
		    System.out.print("Enter side of an equilateral triangle: ");
		    side=sc.nextDouble();

		    
		    area = (Math.sqrt(3) / 4) * (side * side);

		   
		   System.out.println("Area of equilateral triangle="+area);
		}
		

	}


