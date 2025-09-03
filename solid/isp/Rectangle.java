package isp;

public class Rectangle implements TwoDShape {
    private double length;
    private double breadth;

    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println("The area of the rrectangle is " + this.length * this.breadth);
    }
}
