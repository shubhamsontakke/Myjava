package string;

import java.util.Scanner;


public class Pattern {

	public static void pl(String a)
	{
		String[]s=a.split(" ");
		for(int i=0;i<s.length;i++)
		{

			for(int j=0;j<=i;j++) {
				System.out.print(s[j]+" ");
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("enter the string");
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		Pattern.pl(a);

	}

		

}
