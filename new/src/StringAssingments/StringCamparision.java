package StringAssingments;

public class StringCamparision {

	public static void main(String[] args) {

        String string1 = new String("shubham");
        String string2 = new String("shubhamsontakke");
        String string3 = new String("rocky");
        String string4 = new String("rocky");
        String string5 = new String("Rocky");
  
        
        System.out.println(  string1 + " and " + string2
                           + " : " + string1.equalsIgnoreCase(string2));
  
       
        System.out.println( string3 + " and " + string4
                           + " : " + string3.equalsIgnoreCase(string4));
  
        
        System.out.println( string4 + " and " + string5
                           + " : " + string4.equalsIgnoreCase(string5));
  
     
        System.out.println("Comparing " + string1 + " and " + string4
                           + " : " + string1.equalsIgnoreCase(string4));
    }

}
		

	


