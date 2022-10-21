package string;

import java.util.Scanner;

public class ReplaceChar {
	public static void CompareString(String a,String a2)
	{
		String p=a.replaceAll(a2," ");
		System.out.println(p);
		
	}

	public static void main(String[] args) {
		System.out.println("enter the string one");
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		System.out.println("enter the string two");
		String a2=s.nextLine();
		ReplaceChar.CompareString(a,a2);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
