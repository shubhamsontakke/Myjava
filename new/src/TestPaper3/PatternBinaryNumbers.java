package TestPaper3;

public class PatternBinaryNumbers {

	public static void main(String[] args) {
		int j;
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
			if(j%2==0)
			{
				System.out.print("0");
			}
			else
			{
				System.out.print("1");
			}
		}
		
			System.out.println();
	}
	}
}

