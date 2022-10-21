package array;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
	
		
		int a[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.print("enter array elements");
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
	int max=a[0];
		for(int i=1;i<10;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.print(max);
		
		
		// TODO Auto-generated method stub

	}

}
