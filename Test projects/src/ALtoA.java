
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ALtoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		      List<String> s1=new ArrayList<>();
		      s1.add("Satish");
		      s1.add("Kumar");
		      s1.add("USA");
		      String s2[]=new String[s1.size()];
		      s2=s1.toArray(s2);
		      System.out.println("From List: "+s1);
		      System.out.println("From Array: "+ Arrays.toString(s2));
	}

}
