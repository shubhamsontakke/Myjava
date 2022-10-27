package ConditionalAssignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number");
		int num=s.nextInt();
		int reverse=0;
		while(num>0)
		{
			int r=num%10;
			reverse=reverse*10+r;
			num=num/10;
			
		}
		System.out.print(reverse);

	}

}
