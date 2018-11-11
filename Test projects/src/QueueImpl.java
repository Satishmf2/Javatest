
public class QueueImpl {
 
	int size;
	int front, tail;
	int queue[]=new int[5];
	
	public void add(int data) {
		// TODO Auto-generated method stub
		queue[tail]=data;
		tail=tail+1;
		size=size+1;
	}
	
	public void show() {
		System.out.println("Elements:");
		
		for(int i=0;i<size;i++) {
              System.out.println(""+queue[front+i]);
	}
		

		
		for(int n:queue) {
			System.out.println(" "+n);
		}
}
	
	public int dequeue() {
		int data=queue[front];
		front =front+1;
		size=size-1;
		return data;
		
	}

	

	

}
