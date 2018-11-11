import java.util.Scanner;

public class CountVolatile  {
	public static void main(String args[]) {
		
		Test11 t=new Test11();
		t.start();
		Scanner in=new Scanner(System.in);
		in.nextLine();
		t.stopcounter();	
	}
	
}

class Test11 extends Thread{
	CountVolatile c=new CountVolatile();
	boolean counter=true;
	int count=1;
	
		public void run() {
			while(counter) {
				System.out.println(" "+count);
				count++;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			
			}}
		
		public void stopcounter() {
			counter=false;
		}
	
}