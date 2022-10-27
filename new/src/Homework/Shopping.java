package Homework;

public class Shopping {
	String items;
	int quantity;
	int bill;
	int price;
	
	void acceptDetails(String i,int q, int p) {
	items=i;
	quantity=q;
	price=p;
}
void calculation()
{
	if(quantity>0)
	{
		bill=quantity * price;
	}
}
void DisplaySoppingDetails()
{
	if(quantity > 0)
	{
		System.out.println("perchased item= /n"+items+" "+"item quantity= /n"+quantity+" "+"item price=/n "+price+" "+"bill="+bill);
	}
	else {
		System.out.println("error");
		
	}
}
	public static void main(String[] args) {
		Shopping shop=new Shopping();
		shop.acceptDetails("cloths",2,1000);
		shop.calculation();
		shop.DisplaySoppingDetails();
;		

	}
	

}
