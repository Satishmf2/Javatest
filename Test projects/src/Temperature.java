
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		    double farenheit=10;
		    double celcius=f2c(farenheit);
		    System.out.println("Fareheit :" +farenheit+ "celcius:" +celcius);
		    
	}
	
	static double f2c(double farenheit) {
		return (farenheit*32)*5 / 9 ;
	}

}
