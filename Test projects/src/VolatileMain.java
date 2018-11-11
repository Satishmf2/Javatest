public class VolatileMain{	
	
	public final static int Total_threads = 3;
	
	public static void main(String args[]) throws InterruptedException {
		VolatileData volatiledata = new VolatileData();
		
		Thread[] threads=new Thread[Total_threads];
		
		for(int i=0;i<Total_threads;++i) {
			
			threads[i]=new VolatiileThread(volatiledata);
			System.out.println("Sat1 : "+threads[i]);
			
		}
		
		for(int i=0;i< Total_threads;i++) {
			threads[i].start();
		}
		
		for(int i=0;i< Total_threads;i++) {
				threads[i].join();
		
		
	}
}
}




























