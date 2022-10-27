package ConditionalAssignment;

public class DisplayNumber1To30 {

	public static void main(String[] args) {
		for(int i=1; i<=30;i++)
		{
			if(i%2==0 || i%3==0 || i%9==0)
			{
				continue;
			}
			System.out.println(i);
			
		}
		// TODO Auto-generated method stub

	}

}
