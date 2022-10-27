package ConditionalAssignment;

import java.util.Scanner;

public class Dsarium {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		int initial=num;
		int rem,sum=0,count=0;
		while(num>0) {
			rem=num%10;
			count++;
			num=num/10;
			
		}
		num=initial;
		for(int i=count;i>=1;i--)
		{
			sum=sum+(int) Math.pow( num % 10,i);
			num=num/10;
		}
		// TODO Auto-generated method stub
if(sum==initial) {
	System.out.println("is a disarium num"+initial);
}
else
{
	System.out.println("is not a disarium num"+initial);
}
	}

}
