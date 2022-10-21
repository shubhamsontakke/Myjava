package array;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		int c[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("enter array elements");
		for(int i=0;i<c.length;i++)
		{
			c[i]=s.nextInt();
		}
		System.out.println(" array elements");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]%2==0)
			{
				System.out.println(+c[i]+" "+"is even number ");
			}
		}
		// TODO Auto-generated method stub

	}

}
