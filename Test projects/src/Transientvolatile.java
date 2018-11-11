import java.io.*;
class Test implements Serializable
{
    // Normal variables
    int i = 10, j = 20;
 
    // Transient variables
    transient int k = 30;
 
    // Use of transient has no impact here
    transient static int l = 40;
    transient final int m = 50;
 
    public static void main(String[] args) throws Exception
    {
        Test input = new Test();
 
        // serialization
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);
 
        // de-serialization
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Test output = (Test)ois.readObject();
        System.out.println("i = " + output.i);
        System.out.println("j = " + output.j);
        System.out.println("k = " + output.k);
        System.out.println("l = " + output.l); 
        System.out.println("m = " + output.m);
    }
    
    class MyRunnable1 implements Runnable{
    	  
    	   //System.out.println("My Name is Satish");
    	   private boolean active;

		@Override
		public void run() {
			// TODO Auto-generated method stub
			active=true;
			while(active) {
				System.out.println("My Name is Satish");
			}
		}
		
		public void stop() {
			active=false;
		    while(!active) {
		    	    System.out.println("My Name is Kumar R");
		    }
		}
		
		Thread t1=new Thread();
		Thread t2=new Thread();
		
		
    	
    }
    
   
}