public class Rectangle {
    
    // private variable to store the length of the rectangle
    private int length;

    // private variable to store the breadth of the rectangle
    private int breadth;

    // accessor method to access the private variable length
    public int getLength() {
        return length;
    }

    // accessor method to access the private variable breadth
    public int getBreadth() {
        return breadth;
    }

    // mutator method to change the value of the private variable length
    public void setLength(int length) {
        this.length = length;
    }

    // mutator method to change the value of the private variable breadth
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // method to calculate the area of the rectangle
    public int area() {
        return length * breadth;
    }

    // method to calculate the perimeter of the rectangle
    public int perimeter() {
        return 2 * (length + breadth);
    }
}
