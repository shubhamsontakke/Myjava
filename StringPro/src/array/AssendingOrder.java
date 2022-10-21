package array;

import java.util.Scanner;

public class AssendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("enter array elements");
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
		}
		
		System.out.println("array elements");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]>b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
					
				}
			}
			System.out.println(b[i]+" ");
		}
		
	}

}
