class Aggregation{

	public static void main(String args[]) {
	MegaOfficeSuiteDVD dvd = new MegaOfficeSuiteDVD();
	Computer c = new Computer();
	 c.allDone();
	 
     System.out.println("\nBrowing the internet...");
     System.out.println("Writing some source code");
     System.out.println("Saving work...\n");
     c.allDone();
     c = null;
     dvd.viewShinySurface();
     
	}
}


class OperatingSystem1{
	void dvd() {
		System.out.println("DVD Method");
	}
	void linux() {
		System.out.println("linx method");
	}}
	
class PowerSupply1{
	void turnOn() {
		System.out.println("Power is on");
	}
	void turnOff() {
		System.out.println("Power is off");
	}}

class DVDDrive{
	void turnOn() {
		System.out.println("DVD is on");
	}
	void turnOff() {
		System.out.println("DVD is off");
	}}

class MegaOfficeSuiteDVD {
    void installSoftware() { System.out.println("Installation of Mega Office Suite complete!"); }
    void viewShinySurface() { System.out.println("\nJust look at that shiny prismy reflection ..."); }
}
class Computer1 {
	    private OperatingSystem os = new OperatingSystem();
	    private PowerSupply ps = new PowerSupply();
	    private DVDDrive drive = new DVDDrive();
	    private MegaOfficeSuiteDVD dvd;

	 Computer1(MegaOfficeSuiteDVD dvd) {
	        this.dvd = dvd; // aggregation
	        ps.turnOn();
	        os.linux();
	    }
	    
	    void allDone() {
	        os.dvd();
	        ps.turnOff();
	    }}
	