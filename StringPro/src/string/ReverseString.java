package string;

import java.util.Scanner;

public class ReverseString {
	public static String reverse(String str)
	
	{
		String s1=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			s1=s1+str.charAt(i);
		}
		return s1;
		
	}

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner s=new Scanner(System.in);
		String st=s.next();
		System.out.println(ReverseString.reverse(st));
		
		// TODO Auto-generated method stub

	}

}
