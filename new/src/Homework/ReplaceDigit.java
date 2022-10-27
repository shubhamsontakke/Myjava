package Homework;

import java.util.Scanner;

public class ReplaceDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("enter number");
		int num=s.nextInt();
		int newNum=0;
		int next=0;
		int count=0;
		int copy=num;
		 while(num>0)
		 {
			 int r=num%10;
			 {
				 if(r==1)
				 {
					 r=0;
				 }
			 }
			 newNum=(newNum*10)+r;
			 num=num/10;
		 }
		 while(newNum>0)
		 {
			 int rim=newNum%10;
			 next=(next*10)+rim;
			 newNum=newNum/10;
			 
		 }
		
		System.out.println(next);

	}

}
