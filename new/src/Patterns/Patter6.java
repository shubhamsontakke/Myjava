package Patterns;

public class Patter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
	    int num = 1;

	    for (int i = 0; i < size; i++) {
	      // print spaces
	      for (int j = 0; j < i; j++) {
	        System.out.print(" ");
	      }
	      // print numbers
	      for (int j = 0; j < size - i; j++) {
	        System.out.print(num++);
	      }
	      num = 1;
	      System.out.println();
	    }

	}

}
