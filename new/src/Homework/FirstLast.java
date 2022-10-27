package Homework;

import java.util.Scanner;

public class FirstLast {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number");
		int num=s.nextInt();
		int sum=0;
		int last=num%10;
		while(num>=10)
		{
			num=num/10;
			
		}
		int first=num;
		sum=first+last;
		System.out.print(sum);
			// TODO Auto-generated method stub
}
	}


