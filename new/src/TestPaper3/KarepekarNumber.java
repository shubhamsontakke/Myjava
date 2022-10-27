package TestPaper3;

import java.util.Scanner;

public class KarepekarNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int count=0;
		int digit=0;
		int sqr=num*num;
		int p=sqr;
		int sum=0;
		while(num>0)
		{
			count++;
			sqr=sqr/10;
			
			}
		int k=(int)Math.pow(10,count/2);
		while(p>0)
		{
			sum=sum + p%k;
			p=p/k;
			
		}
		if(num==sum)
		{
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}

	}

}
