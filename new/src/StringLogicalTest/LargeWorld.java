package StringLogicalTest;

import java.util.Arrays;
import java.util.Scanner;

public class LargeWorld {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter String");
		String str=s.nextLine();
		str+=" ";
		String Word="",lWord="";
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch != ' ')
			{
				Word+=ch;
			}
			else {
				if(Word.length()>lWord.length())
				{
					lWord=Word;
					
				}
				Word="";
			}
			
		}
		System.out.println("longestm word is="+lWord);
		

	}

}
