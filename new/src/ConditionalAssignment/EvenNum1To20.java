package ConditionalAssignment;

public class EvenNum1To20 {

	public static void main(String[] args) {
		int i;
		
		// TODO Auto-generated method stub
		for(i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				while(i%3 != 0)
				{
				System.out.println(i);
				break;
		}
			}
		}

	
	}

}

