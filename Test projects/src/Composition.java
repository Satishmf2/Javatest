class Composition{

	public static void main(String args[]) {
	 Computer c = new Computer();
	 c.allDone();
	 
     System.out.println("\nBrowing the internet...");
     System.out.println("Writing some source code");
     System.out.println("Saving work...\n");
     c.allDone();
     c = null;
     
	}
}


class OperatingSystem{
	void dvd() {
		System.out.println("DVD Method");
	}
	void linux() {
		System.out.println("linx method");
	}}
	
class PowerSupply{
	void turnOn() {
		System.out.println("Power is on");
	}
	void turnOff() {
		System.out.println("Power is off");
	}}
	
	class Computer {
	    private OperatingSystem os = new OperatingSystem();
	    private PowerSupply ps = new PowerSupply();

	    Computer() {
	        ps.turnOn();
	        os.linux();
	    }
	    
	    void allDone() {
	        os.dvd();
	        ps.turnOff();
	    }}
	