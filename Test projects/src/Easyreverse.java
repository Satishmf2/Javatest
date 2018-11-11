import java.util.Scanner;

public class Easyreverse {
	
	   public static void main(String args[]) {
		   System.out.println("Enter the string");
		   Scanner in=new Scanner(System.in);
		   String rev=" ";
		   String Org=in.nextLine();
		   System.out.println("03/13/2016");
		   System.out.println("Original is : " +Org);
		   for(int i=Org.length()-1;i>=0;i--) {
			   
			  rev=rev+Org.charAt(i);
			   
		   }
		   
		   System.out.println("Reversed is " +rev);
		   
		       
	   }
}
