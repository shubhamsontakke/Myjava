package array;

import java.util.Scanner;

public class ReverseElements {

	public static void main(String[] args) {
		int a[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("enter array elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("array elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		
		}
		System.out.println(" array elements in reverse ");
		for(int i=10-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		
		}
		
		
		// TODO Auto-generated method stub

	}

}
