
public class Queue{

	public static void main(String args[]) {
	QueueImpl impl=new QueueImpl();
	impl.add(5);
	impl.add(10);
	impl.add(15);
	impl.add(20);
	impl.add(25);
	impl.show();
	
	impl.dequeue();
	
	impl.show();
	}
	
}
