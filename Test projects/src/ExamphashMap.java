import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExamphashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map hm=new HashMap();
		
		hm.put(1, "Satish");
		hm.put(2, "Kishore");
		hm.put(3,"Arun");
		hm.put(4,"Deepa");
		
		//Without using java 8 features removing the elements in even key positions and printing them. 
		
		//Using java8 features removing the elements in key positions. 
		
		Set keys=hm.keySet();
       // hm.values();
		Set<Entry<String, Integer>> entries=hm.entrySet();		
		System.out.println("Keys: " +keys);
		System.out.println("Values: " +hm.values());
		System.out.println("Keys: " +entries);
		
		//Without using stream counting the number of values that are greater than 4. 
		
		
		

	}

}
