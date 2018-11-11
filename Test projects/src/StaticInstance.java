
public class StaticInstance {
      private char[] stackArray;
      private int topofstack;
      int instanceField;
      static String staticField;
	public StaticInstance() {
//		stackArray=new char[capacity];
//		topofstack=-1;
	}
	public void method() {
		final String localVariable = "Initial Value";
	    System.out.println(localVariable);
	  }
	
	public static void main(String args[]) {
		StaticInstance obj = new StaticInstance();
	    System.out.println(obj.instanceField);
	    System.out.println(obj.staticField);
	    System.out.println(StaticInstance.staticField);
	    System.out.println(new StaticInstance().instanceField);
	}}

