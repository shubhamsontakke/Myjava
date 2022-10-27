package Praining_Programs;
import java.util.Scanner;
public class GreatestNum_Ter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a, b, c, lar;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter all three numbers: ");
	        a = s.nextInt();
	        b = s.nextInt();
	        c = s.nextInt();
	        lar= c > (a > b ? a : b) ? c : ((a > b) ? a : b);
	        System.out.println("Largest Number: "+lar);

	}

}
