package TestPaper_2;

import java.util.Scanner;

public class TriponicNum {

	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
	      int num;
	      System.out.println("Enter a number:");
	      num=cs.nextInt();
	      int flag=0;
	      int cube_power=num*num*num;
	      while(num!=0)
	      {
	          if(num%10!=cube_power%10)
	          {
	              flag=1;
	              break;
	          }
	          num/=10;
	          cube_power/=10;
	      }
	      if(flag==0)
	         System.out.println("It is a Trimorphic Number.");
	     else
	          System.out.println("It is not a Trimorphic Number.");
	   cs.close();
	 }
		// TODO Auto-generated method stub

	}


