
public class VolatiileThread extends Thread {
         
	     private final VolatileData data;

		public VolatiileThread(VolatileData data) {
			super();
			this.data = data;
		}
	     
	    public void run() {

			for (int i = 0; i <2 ; i++) {
				System.out.println("Satish");
			}
	    	    int OldValue = data.getCounter();
	    	  
	    	    System.out.println("[Thread + " +Thread.currentThread().getId() +"]Oldvalue:+" +OldValue );
	    	    
	    	    data.increaseCounter();
	    	    
	    	    int newValue =data.getCounter();
	    	    
	    	    System.out.println("[Thread + " +Thread.currentThread().getId() +"]NewValue:+" +newValue );

	    	    
	    }
}
