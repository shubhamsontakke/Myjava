package ConditionalAssignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

      
        num1 = scanner.nextFloat();
        System.out.print("Enter second number:");
        num2 = scanner.nextFloat();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        
        double output=0;

        switch(operator)
        {
        case '+':
        	output = num1 + num2;
            break;

        case '-':
        	output = num1 - num2;
            break;

        case '*':
        	output = num1 * num2;
            break;

        case '/':
        	output = num1 / num2;
            break;

        
        default:
            System.out.println("You have entered wrong operator");
            
    }

    System.out.println("result" +output);
}



	}


