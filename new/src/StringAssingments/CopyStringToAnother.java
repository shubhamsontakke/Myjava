package StringAssingments;

import java.util.Scanner;

public class CopyStringToAnother {

	public static void main(String[] args) {
		String str;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter a String");
        str = scanner.nextLine();
        
        String copy = new String(str);
 
        System.out.println("Input String : " + str);
        System.out.println("Copied String : " + copy);
    }

	}


