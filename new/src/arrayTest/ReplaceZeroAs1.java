package arrayTest;

import java.util.Scanner;

public class ReplaceZeroAs1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
			System.out.println(a[i]);
		}
	
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
