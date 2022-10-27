package Praining_Programs;

import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.print("enter  any char: ");
		ch=s.next().charAt(0);
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.print("char is vowel");
		}
		else
		{
			System.out.print("consonent");
		}
		// TODO Auto-generated method stub

	}

}
