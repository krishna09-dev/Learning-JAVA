
public class Circle {
    
    // private variable to store the radius of the circle
    private int radius;

    // accessor method to access the private variable radius
    public int getRadius() {
        return radius;
    }

    // mutator method to change the value of the private variable radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // method to calculate the area of the circle
    public double area() {
        return (22/7) * radius * radius;
    }

    // method to calculate the circumference of the circle
    public double circumference() {
        return 2 * (22/7) * radius;
    }
}