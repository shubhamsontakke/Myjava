package string;

import java.util.Scanner;

public class CheckPalindrome {

	public static void palinNum(String st) {
		StringBuffer b=new StringBuffer( st);
		b.reverse();
		String s=b.toString();
		if(st.equals(s)) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
				
			
				}

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter string:  ");
			String sn=s.next();
			CheckPalindrome.palinNum(sn);
			
			
			
			// TODO Auto-generated method stub

		}

	
// TODO Auto-generated method stub

	}


