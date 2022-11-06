package StringAssingments;

import java.util.Scanner;

public class FinfAlphBeth_Digit_SpecialSymbol {

	public static void main(String[] args) {
		String aldisp_str;
		int i, alph, digi, spl;
		i = alph = digi = spl = 0;
		char ch;
		
		Scanner sc= new Scanner(System.in);

		System.out.print("enter string ");
		aldisp_str = sc.nextLine();
		
		while(i < aldisp_str.length())
		{
			ch = aldisp_str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
				spl++;
			}
			i++;
		}		
		System.out.println("\nNumber of Alphabet Characters  =  " + alph);
		System.out.println("Number of Digit Characters     =  " + digi);
		System.out.println("Number of Special Characters   =  " + spl);
	}



	}


