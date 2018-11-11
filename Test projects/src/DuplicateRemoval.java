import java.util.Arrays;

public class DuplicateRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st1="CCBBAA";
		
		char[] c1=st1.toCharArray();
		
		Arrays.sort(c1);
		
		for(int i=0;i<c1.length;i++) {
		    System.out.print(" " +c1[i]);
		}
		
		//Using the string class constructor to create a sorted string from the char array.
		
	    String sat=c1.toString();
	    System.out.println(" "+sat);
	
	}

}
