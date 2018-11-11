import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProdCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		BlockingQueue bq=new LinkedBlockingQueue();
		Thread prod=new Thread(new ProdThread1(bq));
		Thread cons=new Thread(new ConsThread(bq));
		prod.start();
		cons.start();
		
	}

}

class ProdThread1 implements Runnable{

	private final BlockingQueue bq;
	public ProdThread1(BlockingQueue bq) {
		// TODO Auto-generated constructor stub
		this.bq= bq;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++) {
             System.out.println("Produced: "+i);
             try {
				bq.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
}}


class ConsThread implements Runnable{

	private final BlockingQueue bq;
	public ConsThread(BlockingQueue bq) {
		// TODO Auto-generated constructor stub
		this.bq= bq;
	}

	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++) {
             System.out.println("Consumed: "+i);
             try {
				System.out.println("Consumed: "+bq.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}}

}
