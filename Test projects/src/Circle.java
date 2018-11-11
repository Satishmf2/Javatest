import java.util.*;

public class Circle {
       double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
    
	public double Area() {
		return radius*radius * Math.PI;
	}

	public static void main(String args[]) {
		ArrayList<Circle> circlelist=new ArrayList<>();
		System.out.println("The radius is ");
	}

}
