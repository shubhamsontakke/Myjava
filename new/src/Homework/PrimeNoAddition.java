package Homework;

import java.util.Scanner;

public class PrimeNoAddition {

	public static void main(String[] args) {
		
Scanner s = new Scanner(System.in);

        
        System.out.print("find sum of prime numbers upto we want: ");
        int upto = s.nextInt();

        int sum = 0;

        for(int num = 2; num <= upto; num++) {

            int i;

            for(i = 2; i <= (num / 2); i++) {

                if(num % i == 0) {
                    i = num;
                    break;
                }
            }

            
            if(i != num) {
                sum += num;            
            }
        }

        System.out.println("sum of all prime numbers upto " + upto + " : " + sum);
    }
	
	}




	


