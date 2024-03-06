package exercise01;

public class Circle {
	
public static double PI = 3.14;
    
    private double radius;

    
    
    public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


	// Constructor to set the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to get the value of PI
    public static double getPi() {
        return PI;
    }

    // Method to draw the circle
    public void draw() {
       return;
    }

}
