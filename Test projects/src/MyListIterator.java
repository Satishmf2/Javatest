import java.util.LinkedList;
import java.util.*;

//Fri Mar 30
// Linked list addition and list iterator updating the elements
public class MyListIterator {
	public static void main(String args[]) {
		LinkedList l = new LinkedList();
		
		for(int i=0;i<5;i++) {
			l.add(i);
		}
		
		ListIterator ltr=l.listIterator();
		System.out.println("Forward");
 		while(ltr.hasNext()) {
 			System.out.print(ltr.next());
 			
		}
 		System.out.print('\n');
 	//	ltr=l.listIterator();
 		System.out.println("Reverse");
 		while(ltr.hasPrevious()) {
 			System.out.print(ltr.previous());
		}
 		
 		while(ltr.hasNext()) {
 			int i=(int) ltr.next();
 			if(i==0) {
 				ltr.remove();
 			}
 		}
 		System.out.print(l);
 		
 		
 		
		
	}

}
