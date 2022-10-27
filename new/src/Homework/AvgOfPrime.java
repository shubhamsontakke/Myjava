package Homework;

import java.util.Scanner;

public class AvgOfPrime {
	public int Prime() {
		int sum=0;
		int count=0;
		for(int num=1;num<=20;num++)
		{
			for(int i=1;i<=20;i++)
			{
				if(num%i != 0) {
					sum=sum+num;
					count++;
				}
			}
		}
		System.out.println("sum="+sum+ " "+"count="+count);
		return (sum/count);
		
	
	}
	public static void main(String[] args) {
		AvgOfPrime a=new AvgOfPrime();
		a.Prime();
		int b=a.Prime();
		System.out.println(b);
	}

	}


