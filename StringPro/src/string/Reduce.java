package string;

import java.util.Scanner;

public class Reduce {
	public static String reduce(String a)
	{
		String s="";
		String[] b=a.split("\\s");
		for(int i=0;i<b.length-1;i++)
		{
			s=s+b[i].charAt(0)+".";
			
		}
		s=s+b[b.length-1];
		return s;
	}

	public static void main(String[] args) {
		System.out.println("enter the string");
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		System.out.println(Reduce.reduce(a));
		
		
		// TODO Auto-generated method stub

	}

}


