public class Square {

    // private variable to store the side of the square
    private int side;

    // accessor method to access the private variable side
    public int getSide() {
        return side;
    }

    // mutator method to change the value of the private variable side
    public void setSide(int side) {
        this.side = side;
    }

    // method to calculate the area of the square
    public int area() {
        return side * side;
    }

    // method to calculate the perimeter of the square
    public int perimeter() {
        return 4 * side;
    }
}
