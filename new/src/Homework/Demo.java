package Homework;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();
		System.out.println("enter second number");
		int num1=s.nextInt();
		
		if(num==0)
		{
			num=num1;
			System.out.println(num);
			
		}
		// TODO Auto-generated method stub

	}

}
