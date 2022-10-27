package TestPaper3;

import java.util.Scanner;

public class NumberSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter n numbers");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			int ans=i*i-1;
			System.out.print(ans+",");
		}
		
		// TODO Auto-generated method stub

	}

}
