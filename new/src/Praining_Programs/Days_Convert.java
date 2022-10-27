package Praining_Programs;

public class Days_Convert {

	public static void main(String[] args) {
		
		
	        int days=2,years,weeks;
	        
	        System.out.println("Enter days: "+days);
	        years = days / 365;
	         weeks = days % 365 / 7;
	            days  = days % 365 % 7;
	            System.out.println("Year/s = " + years);
	        System.out.println("Week/s = " + weeks);
	        System.out.println("Day/s  = " + days);
		

	}

}
