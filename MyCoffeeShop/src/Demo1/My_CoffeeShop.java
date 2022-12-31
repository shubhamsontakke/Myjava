package Demo1;

import java.util.Scanner;

public class My_CoffeeShop {
	int FrenchFries =100;
	int ColdCoffee =100;
	int ColdDrink=80;
	int Pastry =100;
	int ch;
	int quantity;
	static int total;
	Scanner s=new Scanner(System.in);
	
	public void dispalayMenu()
	{
		System.out.println("**********// Welcome To My Cafe //*********");
		System.out.println("_____________________________________________");
		System.out.println("        1. FrenchFries     100/-");
		System.out.println("        2.ColdCoffee      100/-");
		System.out.println("        3.ColdDrink        80/-");
		System.out.println("        4.Pastry          100/-");
		System.out.println("        5.exit                  ");
		System.out.println(" *******************************");
		System.out.println("     what do you whant to order ?    ");
	}
	
	public void generateBill()
	{
		System.out.println();
		System.out.println("*** Thank You For Visit ***");
		System.out.println("Your Bill Is :" +total );
	}
	public void order()
	{
		while(true)
		{
		System.out.print("ente your choice");
		ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("You have ordered FrenchFries");
			System.out.println();
			System.out.println("enter desired quantity :");
			quantity=s.nextInt();
			total=total + quantity*FrenchFries;
			break;
		
		case 2:
			System.out.println("You have ordered ColdCoffee");
			System.out.println();
			System.out.println("enter desired quantity :");
			quantity=s.nextInt();
			total=total + quantity* ColdCoffee;
			break;
		
		case 3:
			System.out.println("You have ordered ColdDrink");
			System.out.println();
			System.out.println("enter desired quantity :");
			quantity=s.nextInt();
			total=total + quantity*ColdDrink;
			break;
			
		case 4:
			System.out.println("You have ordered Pastry");
			System.out.println();
			System.out.println("enter desired quantity :");
			quantity=s.nextInt();
			total=total + quantity*Pastry;
			break;
			
		case 5:
			System.exit(1);
			break;
			
		default :
			break;
		}
		System.out.println();
		System.out.print("Do you wish to order anything else(Y/N) : ");
		String again=s.next();
		if(again.equalsIgnoreCase("Y"))
		{
			order();
		}
		else if(again.equalsIgnoreCase("N"))
		{
			
			 generateBill();
			System.exit(1);
			
		}
		else {
			System.out.println("Invalid choice");
		}
			
		}
	}

}
