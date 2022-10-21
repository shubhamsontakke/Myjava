package array;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		System.out.print("enter array size");
		int size=s.nextInt();
		
		int ar[]=new int[size];
		System.out.print("enter array elements");
		for(int i=0;i<size;i++)
		{
			ar[i]=s.nextInt();
		}
		
		for(int i=0;i<ar.length;i++)
		{
			sum=sum + ar[i];
		}
		System.out.print(sum);
		// TODO Auto-generated method stub

	}

}
