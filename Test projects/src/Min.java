
public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		     int a[]= {1,2,3,4,5};
		     int min=a[0];
		     for(int i=0;i<a.length-1;i++) {
		    	         
		    	         if (a[i] > a[i+1] ){
		    	        	       min=a[i+1];
		    	        	       i++;
		    	        	     
		    	         }
		     }
	         System.out.println("Min value is " +min);

	}

}
