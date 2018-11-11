import java.util.HashMap;
import java.util.Map;

public class equalandhash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
     Employee e1=new Employee(1);
     Employee e2=new Employee(1);
     
     Map<Employee, String> map=new HashMap<Employee, String>();
     map.put(e1, "Satish");
     map.put(e2, "Kumar");
     
     System.out.println(" "+map.size());
     
     Integer i1=new Integer(1);
     Integer i2=new Integer(1);
     Map<Integer, String> map1=new HashMap();
     map1.put(i1, "one");
     map1.put(i2, "one");
     System.out.println(" "+map1.size());


     
     
     
     
    		 
     
		    
	}

}

class Employee{
	int id;

	public Employee(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
}