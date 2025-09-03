package isp;

public class Square implements TwoDShape {
    private double length;

    Square() {
        this.length = 0;
    }

    Square(double length) {
        this.length = length;
    }

    @Override
    public void area() {
        System.out.println("The area of the square is " + this.length * this.length);
    }
}
