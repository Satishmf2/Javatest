import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Set s1=new HashSet();
         
         for(int i=0;i<10;i++) {
        	   s1.add ( (int)  (Math.random()*100));
         }
         System.out.println("Ascending Order :  "+s1);
         
         Set<Integer> s2=new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				// TODO Auto-generated method stub
				return i2.compareTo(i1);
			}});
         
          s2.addAll(s1);
          System.out.println("Descending Order  :   "+s2);
	}

}
