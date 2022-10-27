package StringLogicalTest;

import java.util.Scanner;

public class RemoveChar {

		public static void CompareString(String a,String a2)
		{
			String p=a.replaceAll(a2,"");
			System.out.println(p);
			
		}

		public static void main(String[] args) {
			System.out.println("enter the string one");
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			String a=s.nextLine();
			System.out.println("enter the string two");
			String a2=s.nextLine();
			RemoveChar.CompareString(a,a2);
		

		}

	}


