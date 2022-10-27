package StringLogicalTest;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String s1=s.nextLine();
		for(int i=s1.length();i>0;i--)
		{
			System.out.print(s1.charAt(i-1));
		}
		
		
		// TODO Auto-generated method stub

	}

}
