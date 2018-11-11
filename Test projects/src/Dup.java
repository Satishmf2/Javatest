import java.awt.List;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		   int a[]= {1,2,2,8,5,3,2,1,10,9,8,7,6,4,3,2,1,0};
		   //convert Array to arraylist
		   
		   ArrayList l1=new ArrayList();
		   for(int i: a) {
			   l1.add(i);
		   }
		   System.out.println(" "+l1);
		   Set s1=new HashSet(l1);
		   l1.clear();
		   System.out.println("Elements : "+l1);
		   l1.addAll(s1);
		   System.out.println(" "+s1);
		   Collections.max(s1);
		   Set<Integer> s2=new TreeSet<Integer>(new Comparator<Integer>()
				   
				   {
			                 
			              public int compare(Integer o1, Integer o2) {
	                    return o2.compareTo(o1);
	            }
	        });
		   s2.addAll(s1);
		   System.out.println(" "+s2);
		   
	}

}
