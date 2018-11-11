import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
	    String input1=sc.nextLine();
		double d1=Double.parseDouble(input1);
		String input2=sc.nextLine();
		double d2=Double.parseDouble(input2);
		double d3=d1+d2;
		System.out.println("The addition of the numbers is " +d3);
			}

}
