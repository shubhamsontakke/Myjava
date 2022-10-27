package Praining_Programs;

public class Cal_A_P_T {

	public static void main(String[] args) {
		int sub1=50,sub2=60,sub3=40,sub4=70,sub5=90, total;
		double avg,percentage;
		
		System.out.println("enter 5 subjects marks:"+sub1+" "+sub2+" "+sub3+" "+sub4+" "+sub5);
		
		total=sub1 +sub2 +sub3 +sub4 +sub5;
		
		avg=total/5;
		percentage=total/500.0*100;
		
		System.out.println("total="+total);
		
		System.out.println("avg="+avg);
		
		System.out.println("percentage="+percentage);
		// TODO Auto-generated method stub

	}

}
