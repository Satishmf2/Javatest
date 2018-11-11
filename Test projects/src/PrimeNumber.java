//033118
public class PrimeNumber {
      public static void main(String args[]) {
//    	          for(int i=1;i<100;i++) {
//    	        	       if(i % 2 != 0) {
//    	        	    	           System.out.print(" " +i);
//    	        	       }      
//    	          }
    	          for(int a=1;a<100;a++) {
    	        	       boolean isprime = true;
    	        	     for (int b=2;b<a;b++) {
    	        	    	     if (a % b == 0) {
    	        	    	    	     isprime = false;
    	        	    	    	     break;
    	        	    	     }}
    	        	    	     if(isprime) {
    	        	    	    	 System.out.print(" " +a);
    	        	    	     
    	        	           }
    	          }
      }
}
